package com.android.ahivaran.redmart.view;

import android.content.Intent;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.android.ahivaran.data.api.ProductApi;
import com.android.ahivaran.data.repository.ProductRepository;
import com.android.ahivaran.data.retrofit.ApiRetrofitFactory;
import com.android.ahivaran.domain.Category;
import com.android.ahivaran.redmart.Presenter.ProductPresenter;
import com.android.ahivaran.redmart.R;
import com.android.ahivaran.redmart.adapter.CategoryAdapter;
import com.android.ahivaran.redmart.utils.CommonSubscriber;
import com.android.ahivaran.redmart.utils.Constants;
import com.android.ahivaran.redmart.utils.RecyclerViewOnClickListener;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CategoryListingScreen extends AppCompatActivity implements RecyclerViewOnClickListener{
    public static final String TAG = CategoryListingScreen.class.getSimpleName();

    private ProductPresenter categoryPresenter;
    private CategoryAdapter categoryAdapter;
    private LinearLayoutManager layoutManager;
    private int totalPage = 0;
    private boolean isLoading;
    private int currentPage = 0;
    private boolean isLastPage;

    @Bind(R.id.galleryRecyclerView)
    RecyclerView galleryRecyclerView;

    @Bind(R.id.refresh_layout)
    SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_listing_page);
        ButterKnife.bind(this);

        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimaryDark, R.color.colorPrimaryDark,
                R.color.colorPrimary);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (currentPage == 0) {
                    loadMoreItems();
                } else {
                    swipeRefreshLayout.setRefreshing(false);
                }
            }
        });

        categoryPresenter = new ProductPresenter(new ProductRepository(ApiRetrofitFactory.getInstance().create(ProductApi.class)));
        categoryAdapter = new CategoryAdapter(this, this);
        galleryRecyclerView.setHasFixedSize(true);
        layoutManager = new GridLayoutManager(this, 2);
        galleryRecyclerView.setLayoutManager(layoutManager);
        galleryRecyclerView.setItemAnimator(new DefaultItemAnimator());
        galleryRecyclerView.setAdapter(categoryAdapter);
        galleryRecyclerView.addOnScrollListener(recyclerViewOnScrollListener);
        loadMoreItems();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        categoryPresenter.destroy();
    }

    private RecyclerView.OnScrollListener recyclerViewOnScrollListener = new RecyclerView.OnScrollListener() {
        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            super.onScrollStateChanged(recyclerView, newState);
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
            super.onScrolled(recyclerView, dx, dy);
            int visibleItemCount = layoutManager.getChildCount();
            int totalItemCount = layoutManager.getItemCount();
            int firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();

            if (!isLoading && !isLastPage) {
                if ((visibleItemCount + firstVisibleItemPosition) >= totalItemCount
                        && firstVisibleItemPosition >= 0
                        && totalItemCount >= totalPage) {
                    loadMoreItems();
                }
            }
        }
    };

    private void loadMoreItems() {
        swipeRefreshLayout.setRefreshing(true);
        isLoading = true;
        currentPage++;
        Log.d(TAG, "loadMoreItems(): pageNo: " + currentPage);
        categoryPresenter.getProducts(currentPage, new CommonSubscriber<Category>() {
            @Override
            public void onCompleted() {
                super.onCompleted();
            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                Toast.makeText(CategoryListingScreen.this, e.getMessage(), Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
                isLoading = false;
                currentPage--;
            }

            @Override
            public void onNext(Category category) {
                super.onNext(category);
                Log.d(TAG, "onNext(): page: "+category.getPage());
                Toast.makeText(CategoryListingScreen.this, String.valueOf(category.getPage()), Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
                isLoading = false;
                if (currentPage == category.getTotal()/category.getPageSize()){
                    isLastPage = true;
                }
                totalPage = category.getPage();
                categoryAdapter.setProductList(category.getProducts());
            }
        });
    }

    @Override
    public void onClick(String productId) {
        Log.d(TAG, "onClick(): productId: "+productId);
        startActivity(new Intent(this, PdpScreen.class).putExtra(Constants.PRODUCT_ID, productId));
    }
}
