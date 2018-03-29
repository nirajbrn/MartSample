package com.android.ahivaran.redmart.Presenter;


import com.android.ahivaran.domain.Category;
import com.android.ahivaran.domain.Product;
import com.android.ahivaran.domain.interactor.GetProduct;
import com.android.ahivaran.domain.interactor.GetProducts;
import com.android.ahivaran.domain.repository.ProductRepository;
import com.android.ahivaran.redmart.utils.CommonSubscriber;

public class ProductPresenter extends Presenter {

    private ProductRepository productRepository;

    public ProductPresenter(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void getProducts(int pageNo, CommonSubscriber<Category> subscriber) {
        executeUseCase(new GetProducts(mThreadExecutor, mPostExecutorThread, productRepository, pageNo), subscriber);
    }

    public void getProduct(String productId, CommonSubscriber<Product> subscriber) {
        executeUseCase(new GetProduct(mThreadExecutor, mPostExecutorThread, productRepository, productId), subscriber);
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void destroy() {
        unsubscribe();
    }
}
