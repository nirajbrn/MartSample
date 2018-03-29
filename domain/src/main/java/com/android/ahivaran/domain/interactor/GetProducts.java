package com.android.ahivaran.domain.interactor;


import com.android.ahivaran.domain.Category;
import com.android.ahivaran.domain.executor.PostExecutorThread;
import com.android.ahivaran.domain.executor.ThreadExecutor;
import com.android.ahivaran.domain.repository.ProductRepository;

import rx.Observable;

public class GetProducts extends UseCase<Category> {

    private ProductRepository productRepository;
    private int pageNo;

    public GetProducts(ThreadExecutor threadExecutor, PostExecutorThread postExecutionThread,
                       ProductRepository productRepository, int pageNo) {
        super(threadExecutor, postExecutionThread);
        this.productRepository = productRepository;
        this.pageNo = pageNo;
    }

    @Override
    protected Observable<Category> buildUseCaseObservable() {
        return productRepository.getProducts(pageNo);
    }
}
