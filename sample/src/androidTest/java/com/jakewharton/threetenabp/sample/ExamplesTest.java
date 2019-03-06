package com.jakewharton.threetenabp.sample;

import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.threeten.bp.Instant;

import static org.junit.Assert.assertNotEquals;

public final class ExamplesTest {
  @Rule public final ActivityTestRule<Examples> examplesActivity =
      new ActivityTestRule<>(Examples.class);

  /**
   * Assert that ProGuard has run and obfuscated a library type. This implicitly also tests the
   * embedded ProGuard rules in the library are correct since currently ProGuard fails without them.
   */
  @Test public void proguardHappened() {
    Examples activity = examplesActivity.getActivity();
    Instant now = activity.now();
    assertNotEquals("Instant", now.getClass().getSimpleName());
  }
}
