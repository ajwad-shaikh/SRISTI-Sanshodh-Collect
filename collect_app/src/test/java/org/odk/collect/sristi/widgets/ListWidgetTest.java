package org.odk.collect.sristi.widgets;

import android.support.annotation.NonNull;

import org.odk.collect.sristi.widgets.base.GeneralSelectOneWidgetTest;
import org.robolectric.RuntimeEnvironment;

/**
 * @author James Knight
 */

public class ListWidgetTest extends GeneralSelectOneWidgetTest<ListWidget> {
    @NonNull
    @Override
    public ListWidget createWidget() {
        return new ListWidget(RuntimeEnvironment.application, formEntryPrompt, false);
    }
}
