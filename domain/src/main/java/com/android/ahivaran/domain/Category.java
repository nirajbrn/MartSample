package com.android.ahivaran.domain;


import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Category {
    List<Product> products;
    int total;
    int page;
    int pageSize;

}
