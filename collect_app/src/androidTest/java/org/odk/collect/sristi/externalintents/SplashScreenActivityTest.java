package org.odk.collect.sristi.externalintents;

import android.support.test.filters.Suppress;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.odk.collect.sristi.activities.SplashScreenActivity;

import java.io.IOException;

import static org.odk.collect.sristi.externalintents.ExportedActivitiesUtils.testDirectories;

@Suppress
// Frequent failures: https://github.com/opendatakit/collect/issues/796
public class SplashScreenActivityTest {

    @Rule
    public ActivityTestRule<SplashScreenActivity> splashScreenActivityRule =
            new ExportedActivityTestRule<>(SplashScreenActivity.class);

    @Test
    public void splashScreenActivityMakesDirsTest() throws IOException {
        testDirectories();
    }

}
