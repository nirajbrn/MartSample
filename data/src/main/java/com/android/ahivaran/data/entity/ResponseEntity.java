package com.android.ahivaran.data.entity;


import com.google.gson.annotations.SerializedName;

import java.util.List;

import lombok.Getter;

@Getter
public class ResponseEntity {
    @SerializedName("product")
    ProductEntity productEntity;
    @SerializedName("products")
    List<ProductEntity> products;
    @SerializedName("total")
    int total;
    @SerializedName("page")
    int page;
    @SerializedName("page_size")
    int pageSize;
}
