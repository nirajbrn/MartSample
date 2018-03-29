package com.android.ahivaran.domain.interactor;

import com.android.ahivaran.domain.executor.PostExecutorThread;
import com.android.ahivaran.domain.executor.ThreadExecutor;
import com.android.ahivaran.domain.repository.ProductRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.verifyZeroInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GetProductsTest {

    private GetProducts getProducts;

    @Mock private ProductRepository mockProductApiRepository;
    @Mock private ThreadExecutor mockThreadExecutor;
    @Mock private PostExecutorThread mockPostExecutionThread;

    @Before
    public void setUp() {
        getProducts = new GetProducts(mockThreadExecutor,
                mockPostExecutionThread, mockProductApiRepository, 0);
    }

    @Test
    public void testGetTempForecastUseCaseObservableHappyCase() {
        getProducts.buildUseCaseObservable();
        verify(mockProductApiRepository).getProducts(0);
        verifyNoMoreInteractions(mockProductApiRepository);
        verifyZeroInteractions(mockPostExecutionThread);
        verifyZeroInteractions(mockThreadExecutor);
    }

}
