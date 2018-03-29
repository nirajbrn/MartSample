package com.android.ahivaran.data.entity;


import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor
@Getter
public class Image {
    @SerializedName("name")
    String imgUrlPath;
}
