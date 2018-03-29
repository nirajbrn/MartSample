package com.android.ahivaran.data.api;


public final class Urls {

    /**
     * API Urls
     */
    public static final String CATEGORY_DISPLAY_API = "/v1.6.0/catalog/search";
    public static final String PDP_API = "/v1.6.0/catalog/products/{productId}";
    public static String getBaseUrl() {
        return "https://api.redmart.com";
    }
}
