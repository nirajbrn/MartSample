package com.android.ahivaran.domain.interactor;

import com.android.ahivaran.domain.executor.PostExecutorThread;
import com.android.ahivaran.domain.executor.ThreadExecutor;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import rx.Observable;
import rx.Subscriber;
import rx.schedulers.TestScheduler;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class UseCaseTest {
    private UseCaseTestClass useCaseTestClass;
    @Mock private ThreadExecutor mockThreadExecutor;
    @Mock private PostExecutorThread mockPostExecutionThread;
    @Mock private TestCommonSubscriber<Object> commonSubscriber;

    @Before
    public void setUp() {
        this.useCaseTestClass = new UseCaseTestClass(mockThreadExecutor, mockPostExecutionThread);
        this.commonSubscriber = new TestCommonSubscriber<>();
        given(mockPostExecutionThread.getScheduler()).willReturn(new TestScheduler());
    }

    @Test
    public void testBuildUseCaseObservableReturnCorrectResult() {
        useCaseTestClass.execute(commonSubscriber);
        assertThat(commonSubscriber.count, is(0));
    }

    @Test
    public void testSubscriptionWhenExecutingUseCase() {
        useCaseTestClass.execute(commonSubscriber);
        useCaseTestClass.unsubscribe();

        assertThat(commonSubscriber.isUnsubscribed(), is(true));
    }

    private static class UseCaseTestClass extends UseCase<Object> {

        public UseCaseTestClass(ThreadExecutor threadExecutor, PostExecutorThread postExecutionThread) {
            super(threadExecutor, postExecutionThread);
        }

        @Override
        public void execute(Subscriber<Object> UseCaseSubscriber) {
            super.execute(UseCaseSubscriber);
        }

        @Override
        protected Observable<Object> buildUseCaseObservable() {
            return Observable.empty();
        }
    }

    private static class TestCommonSubscriber<T> extends Subscriber<T> {
        private int count = 0;
        @Override
        public void onCompleted() {
            count++;
        }

        @Override
        public void onError(Throwable e) {

        }

        @Override
        public void onNext(T t) {

        }
    }
}