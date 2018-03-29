package com.android.ahivaran.domain.repository;


import com.android.ahivaran.domain.Category;
import com.android.ahivaran.domain.Product;

import java.util.List;

import rx.Observable;

public interface ProductRepository {
    Observable<Category> getProducts(int pageNo);

    Observable<Product> getProduct(String productId);
}
