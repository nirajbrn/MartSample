package com.android.ahivaran.domain.interactor;


import com.android.ahivaran.domain.Product;
import com.android.ahivaran.domain.executor.PostExecutorThread;
import com.android.ahivaran.domain.executor.ThreadExecutor;
import com.android.ahivaran.domain.repository.ProductRepository;

import rx.Observable;

public class GetProduct extends UseCase<Product> {
    private ProductRepository productRepository;
    private String productId;

    public GetProduct(ThreadExecutor threadExecutor,
                      PostExecutorThread postExecutionThread, ProductRepository productRepository, String productId) {
        super(threadExecutor, postExecutionThread);
        this.productRepository = productRepository;
        this.productId = productId;
    }

    @Override
    protected Observable<Product> buildUseCaseObservable() {
        return productRepository.getProduct(productId);
    }
}
