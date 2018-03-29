package com.android.ahivaran.data.repository;


import com.android.ahivaran.data.api.ProductApi;
import com.android.ahivaran.data.entity.ProductEntity;
import com.android.ahivaran.data.entity.ResponseEntity;
import com.android.ahivaran.data.mapper.ProductEntityMapper;
import com.android.ahivaran.domain.Category;
import com.android.ahivaran.domain.Product;

import java.util.HashMap;
import java.util.Map;

import rx.Observable;
import rx.functions.Func1;

public class ProductRepository implements com.android.ahivaran.domain.repository.ProductRepository {

    private ProductApi productApi;

    public ProductRepository(ProductApi productApi) {
        this.productApi = productApi;
    }

    @Override
    public Observable<Category> getProducts(int pageNo) {
        Map<String, String> filters = new HashMap<>();
        filters.put("page", String.valueOf(pageNo));
        filters.put("pageSize", "20");
        return productApi.getProducts(filters).map(new Func1<ResponseEntity, Category>() {
            @Override
            public Category call(ResponseEntity responseEntity) {
                return new Category(new ProductEntityMapper().transform(responseEntity.getProducts()), responseEntity.getTotal(), responseEntity.getPage(), responseEntity.getPageSize());
            }
        });
    }

    @Override
    public Observable<Product> getProduct(String productId) {
        return productApi.getProduct(productId).map(new Func1<ResponseEntity, Product>() {
            @Override
            public Product call(ResponseEntity responseEntity) {
                ProductEntity productEntity = responseEntity.getProductEntity();
                return new Product(productEntity.getId(), productEntity.getTitle(),
                        productEntity.getDescription(), productEntity.getPricing().getPrice(), productEntity.getImg().getImgUrlPath());
            }
        });
    }
}
