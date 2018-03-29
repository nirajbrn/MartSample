package com.android.ahivaran.data.api;


import com.android.ahivaran.data.entity.ProductEntity;
import com.android.ahivaran.data.entity.ResponseEntity;

import java.util.Map;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.QueryMap;
import rx.Observable;

public interface ProductApi {
    @GET(Urls.CATEGORY_DISPLAY_API)
    Observable<ResponseEntity> getProducts(@QueryMap Map<String, String > filters);

    @GET(Urls.PDP_API)
    Observable<ResponseEntity> getProduct(@Path("productId") String productId);
}
