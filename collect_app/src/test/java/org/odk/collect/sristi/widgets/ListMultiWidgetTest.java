package org.odk.collect.sristi.widgets;

import android.support.annotation.NonNull;

import org.odk.collect.sristi.widgets.base.GeneralSelectMultiWidgetTest;
import org.robolectric.RuntimeEnvironment;

/**
 * @author James Knight
 */

public class ListMultiWidgetTest extends GeneralSelectMultiWidgetTest<ListMultiWidget> {
    @NonNull
    @Override
    public ListMultiWidget createWidget() {
        return new ListMultiWidget(RuntimeEnvironment.application, formEntryPrompt, true);
    }
}
