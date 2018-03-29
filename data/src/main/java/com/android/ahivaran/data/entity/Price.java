package com.android.ahivaran.data.entity;


import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Price {
    @SerializedName("price")
    String price;
}
