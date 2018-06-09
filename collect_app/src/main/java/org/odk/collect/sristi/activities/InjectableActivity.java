package org.odk.collect.sristi.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import dagger.android.AndroidInjection;

/**
 * @author James Knight
 */

public abstract class InjectableActivity extends CollectAbstractActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
