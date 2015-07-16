package com.jakewharton.threetenabp.sample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public final class ExamplesTest {
  @Rule public final ActivityTestRule<Examples> examplesActivity =
      new ActivityTestRule<>(Examples.class);

  @Test public void example() {
    Examples activity = examplesActivity.getActivity();
    assertNotNull(activity.zdt);
    assertNotNull(activity.zdtNewYork);
    assertNotNull(activity.zdtParis);
    assertNotNull(activity.ldt);
    assertNotNull(activity.year);
    assertNotNull(activity.today);
    assertNotNull(activity.time);
    assertNotNull(activity.later);
    assertNotNull(activity.dec);
    assertNotNull(activity.lastDayOfMonth);
    assertNotNull(activity.dt);
    assertNotNull(activity.resolved);
    assertNotNull(activity.formattedRFC);
    assertNotNull(activity.formatted);
    assertNotNull(activity.bday);
  }
}
