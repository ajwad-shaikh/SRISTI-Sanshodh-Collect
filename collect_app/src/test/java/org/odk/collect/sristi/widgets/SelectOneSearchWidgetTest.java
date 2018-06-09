package org.odk.collect.sristi.widgets;

import android.support.annotation.NonNull;

import org.odk.collect.sristi.widgets.base.GeneralSelectOneWidgetTest;
import org.robolectric.RuntimeEnvironment;

/**
 * @author James Knight
 */
public class SelectOneSearchWidgetTest extends GeneralSelectOneWidgetTest<SelectOneSearchWidget> {

    @NonNull
    @Override
    public SelectOneSearchWidget createWidget() {
        return new SelectOneSearchWidget(RuntimeEnvironment.application, formEntryPrompt);
    }
}
