package com.android.ahivaran.redmart.view;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.ahivaran.data.api.ProductApi;
import com.android.ahivaran.data.repository.ProductRepository;
import com.android.ahivaran.data.retrofit.ApiRetrofitFactory;
import com.android.ahivaran.domain.Product;
import com.android.ahivaran.redmart.Presenter.ProductPresenter;
import com.android.ahivaran.redmart.R;
import com.android.ahivaran.redmart.utils.CommonSubscriber;
import com.android.ahivaran.redmart.utils.Constants;
import com.android.ahivaran.redmart.utils.RandomColor;
import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PdpScreen extends AppCompatActivity {
    public static final String TAG = PdpScreen.class.getSimpleName();

    @Bind(R.id.productImv)
    ImageView productImv;
    @Bind(R.id.productNameTv)
    TextView productNameTv;
    @Bind(R.id.productDescription)
    TextView productDescription;
    @Bind(R.id.productPricingTv)
    TextView productPricingTv;


    @Bind(R.id.refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;
    private ProductPresenter productPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdp_screen);
        ButterKnife.bind(this);
        setActionBar();
        final String productId = getIntent().getStringExtra(Constants.PRODUCT_ID);
        Log.d(TAG, "onCreate(): productId: " + productId);

        productPresenter =
                new ProductPresenter(new ProductRepository(ApiRetrofitFactory.getInstance().create(ProductApi.class)));

        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimaryDark, R.color.colorPrimaryDark,
                R.color.colorPrimary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getProduct(productId);
            }
        });
        getProduct(productId);
    }

    private void setActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void getProduct(String productId) {
        swipeRefreshLayout.setRefreshing(true);
        productPresenter.getProduct(productId, new CommonSubscriber<Product>() {
            @Override
            public void onCompleted() {
                super.onCompleted();
                swipeRefreshLayout.setRefreshing(false);
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                swipeRefreshLayout.setRefreshing(false);
                Toast.makeText(PdpScreen.this, e.getMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNext(Product product) {
                super.onNext(product);
                swipeRefreshLayout.setRefreshing(false);
                productNameTv.setText(product.getTitle());
                productDescription.setText(product.getDescription());
                productPricingTv.setText(getString(R.string.price, product.getPrice()));
                Glide.with(PdpScreen.this)
                        .load(String.format("http://media.redmart.com/newmedia/200p%1$s", product.getImgUrlPath()))
                        .fitCenter()
                        .placeholder(RandomColor.getRandomColor())
                        .into(productImv);
            }
        });
    }
}
