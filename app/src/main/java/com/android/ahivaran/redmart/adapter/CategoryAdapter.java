package com.android.ahivaran.redmart.adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.ahivaran.domain.Product;
import com.android.ahivaran.redmart.R;
import com.android.ahivaran.redmart.utils.RandomColor;
import com.android.ahivaran.redmart.utils.RecyclerViewOnClickListener;
import com.bumptech.glide.Glide;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryHolder> {

    private List<Product> productList;
    private Context context;
    private RecyclerViewOnClickListener recyclerViewOnClickListener;

    public CategoryAdapter(Context context, RecyclerViewOnClickListener recyclerViewOnClickListener) {
        this.productList = new ArrayList<>();
        this.context = context;
        this.recyclerViewOnClickListener = recyclerViewOnClickListener;
    }

    @Override
    public CategoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new CategoryHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.category_item_layout, parent, false),
                recyclerViewOnClickListener, productList);
    }

    @Override
    public void onBindViewHolder(CategoryHolder holder, int position) {

        holder.productName.setText(productList.get(position).getTitle());
        holder.priceTv.setText(context.getString(R.string.price, productList.get(position).getPrice()));
        Glide.with(context)
                .load(String.format("http://media.redmart.com/newmedia/200p%1$s", productList.get(position).getImgUrlPath()))
                .fitCenter()
                .placeholder(RandomColor.getRandomColor())
                .into(holder.productImv);
    }

    @Override
    public int getItemCount() {
        return productList !=  null ? productList.size() : 0;
    }

    public void setProductList(List<Product> products) {
        productList.addAll(products);
        notifyDataSetChanged();
    }

    static class CategoryHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @Bind(R.id.productImv)
        ImageView productImv;
        @Bind(R.id.productName)
        TextView productName;
        @Bind(R.id.priceTv)
        TextView priceTv;
        WeakReference<RecyclerViewOnClickListener> weakReferenceListener;
        WeakReference<List<Product>> weakReferenceProducts;

        CategoryHolder(View itemView, RecyclerViewOnClickListener recyclerViewOnClickListener, List<Product> products) {
            super(itemView);
            weakReferenceListener = new WeakReference<>(recyclerViewOnClickListener);
            weakReferenceProducts = new WeakReference<>(products);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            weakReferenceListener.get().onClick(weakReferenceProducts.get().get(getLayoutPosition()).getProductId());
        }
    }
}
