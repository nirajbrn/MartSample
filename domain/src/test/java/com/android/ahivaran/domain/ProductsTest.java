package com.android.ahivaran.domain;

import com.android.ahivaran.domain.executor.PostExecutorThread;
import com.android.ahivaran.domain.executor.ThreadExecutor;
import com.android.ahivaran.domain.repository.ProductRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class ProductsTest {

    private Product product;
    private String PRODUCT_ID = "21286";
    private String TITLE = "RedMart Strong and Absorbent Kitchen Towels";
    private String DESCRIPTION = "RedMart Multi Purpose Kitchen Towels are high-quality, responsibly sourced kitchen towels. They are strong and absorbent - ideal for cleaning, drying and removing grease. This paper is FSC certified to ensure a responsible and sustainable management of the worlds forests . This paper contains no optical brightening agents , that can cause skin irritation.";
    private String PRICE = "2.6";

    @Before
    public void setUp() {
        product = new Product(PRODUCT_ID, TITLE, DESCRIPTION, PRICE, null);
    }

    @Test
    public void testProductHappyCase() {
        assertThat(product.getProductId(), is(PRODUCT_ID));
        assertThat(product.getTitle(), is(TITLE));
        assertThat(product.getDescription(), is(DESCRIPTION));
        assertThat(product.getPrice(), is(PRICE));
    }

}
