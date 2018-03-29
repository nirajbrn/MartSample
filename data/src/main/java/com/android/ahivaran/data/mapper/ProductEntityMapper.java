package com.android.ahivaran.data.mapper;


import com.android.ahivaran.data.entity.ProductEntity;
import com.android.ahivaran.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductEntityMapper {
    public List<Product> transform(List<ProductEntity> productEntities) {
        List<Product> products = new ArrayList<>();

        for (ProductEntity productEntity : productEntities) {
            products.add(new Product(productEntity.getId(), productEntity.getTitle(), productEntity.getDescription(),
                    productEntity.getPricing().getPrice(), productEntity.getImg().getImgUrlPath()));
        }
        return products;
    }
}
