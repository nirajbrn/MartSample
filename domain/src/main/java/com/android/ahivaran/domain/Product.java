package com.android.ahivaran.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Product {
    private String productId;
    private String title;
    private String description;
    private String price;
    private String imgUrlPath;
}
