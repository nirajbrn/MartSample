package com.android.ahivaran.data.entity;


import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ProductEntity {
    @SerializedName("id")
    String id;
    @SerializedName("title")
    String title;
    @SerializedName("desc")
    String description;
    @SerializedName("img")
    Image img;
    @SerializedName("pricing")
    Price pricing;
}
