package org.odk.collect.sristi.widgets;

import android.support.annotation.NonNull;

import net.bytebuddy.utility.RandomString;

import org.javarosa.core.model.data.StringData;
import org.odk.collect.sristi.widgets.base.GeneralStringWidgetTest;
import org.robolectric.RuntimeEnvironment;

import java.util.Random;

/**
 * @author James Knight
 */
public class StringNumberWidgetTest
        extends GeneralStringWidgetTest<StringNumberWidget, StringData> {

    public StringNumberWidgetTest() {
        super();
    }

    @NonNull
    @Override
    public StringNumberWidget createWidget() {
        Random random = new Random();
        boolean useThousandSeparator = random.nextBoolean();
        return new StringNumberWidget(RuntimeEnvironment.application, formEntryPrompt, false, useThousandSeparator);
    }

    @NonNull
    @Override
    public StringData getNextAnswer() {
        return new StringData(RandomString.make());
    }
}
