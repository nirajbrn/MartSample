package com.android.ahivaran.data.mapper;


import com.android.ahivaran.data.entity.Image;
import com.android.ahivaran.data.entity.Price;
import com.android.ahivaran.data.entity.ProductEntity;
import com.android.ahivaran.domain.Product;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ProductEntityMapperTest {

    private ProductEntityMapper productEntityMapper;

    @Before
    public void setUp() throws Exception {
        productEntityMapper = new ProductEntityMapper();
    }

    @Test
    public void transformProductEntity() {
        List<ProductEntity> productEntities = createFakeProductEntityList();
        List<Product> productList = productEntityMapper.transform(productEntities);
        assertThat(productList.get(0).getTitle(), is("Australian Broccoli"));
        assertThat(productList.get(0).getProductId(), is("33973"));
        assertThat(productList.get(1).getTitle(), is("RedMart Strong and Absorbent Kitchen Towels"));
        assertThat(productList.get(1).getProductId(), is("21286"));
    }

    private List<ProductEntity> createFakeProductEntityList() {
        ProductEntity productEntity1 = new ProductEntity("33973", "Australian Broccoli", "Product of Australia. Versatile broccoli is delicious raw or cooked, and it is packed with so many complex nutrients that it's often called a superfood.",
                new Image("/i/m/8885003328014_0005_1520495600715.jpg"), new Price("2.6"));
        ProductEntity productEntity2 = new ProductEntity("21286", "RedMart Strong and Absorbent Kitchen Towels", "RedMart Multi Purpose Kitchen Towels are high-quality, responsibly sourced kitchen towels. They are strong and absorbent - ideal for cleaning, drying and removing grease. This paper is FSC certified to ensure a responsible and sustainable management of the worlds forests . This paper contains no optical brightening agents , that can cause skin irritation.",
                new Image("/i/m/504445126400_1446443807223.jpg"), new Price("3.8"));
        List<ProductEntity> productEntities = new ArrayList<>();
        productEntities.add(productEntity1);
        productEntities.add(productEntity2);
        return productEntities;

    }
}
