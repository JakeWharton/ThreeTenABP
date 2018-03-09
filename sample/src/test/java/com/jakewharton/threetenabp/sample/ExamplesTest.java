package com.jakewharton.threetenabp.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.threeten.bp.Instant;

import static org.junit.Assert.assertNotNull;

/** This class has two tests to ensure that we can initialize the library multiple times. */
@RunWith(RobolectricTestRunner.class)
public final class ExamplesTest {
  @Test public void one() {
    Examples activity = Robolectric.setupActivity(Examples.class);
    Instant now = activity.now();
    assertNotNull(now);
  }

  @Test public void two() {
    Examples activity = Robolectric.setupActivity(Examples.class);
    Instant now = activity.now();
    assertNotNull(now);
  }
}
