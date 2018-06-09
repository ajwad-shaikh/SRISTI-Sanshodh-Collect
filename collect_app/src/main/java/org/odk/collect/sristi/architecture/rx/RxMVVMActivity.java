package org.odk.collect.sristi.architecture.rx;

import android.arch.lifecycle.Lifecycle;

import com.trello.lifecycle2.android.lifecycle.AndroidLifecycle;
import com.trello.rxlifecycle2.LifecycleProvider;
import com.trello.rxlifecycle2.LifecycleTransformer;

import org.odk.collect.sristi.architecture.MVVMActivity;
import org.odk.collect.sristi.architecture.MVVMViewModel;

/**
 * A {@link MVVMActivity} subclass that provides RxLifecycle
 * methods for binding {@link io.reactivex.Observable}'s to
 * the Activity lifecycle.
 */
public abstract class RxMVVMActivity<V extends MVVMViewModel> extends MVVMActivity<V> {
    private final LifecycleProvider<Lifecycle.Event> provider =
            AndroidLifecycle.createLifecycleProvider(this);

    protected <T> LifecycleTransformer<T> bindToLifecycle() {
        return provider.bindToLifecycle();
    }
}
