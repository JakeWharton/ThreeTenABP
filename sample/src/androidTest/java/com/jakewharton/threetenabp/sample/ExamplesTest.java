package com.jakewharton.threetenabp.sample;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;

import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.threeten.bp.Instant;
import org.threeten.bp.ZonedDateTime;

import static org.junit.Assert.assertEquals;
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

  /**
   * Assert that date-time info is retained after serialization and deserialization.
   */
  @Test public void proguardAllowsSerialization() {
    Examples activity = examplesActivity.getActivity();
    ZonedDateTime hereAndNow = activity.hereAndNow();

    final Parcelable before = new TestParcelable(hereAndNow);

    Parcel parcel = Parcel.obtain();
    before.writeToParcel(parcel, before.describeContents());
    parcel.setDataPosition(0);

    final TestParcelable after = TestParcelable.CREATOR.createFromParcel(parcel);

    assertEquals(hereAndNow.toString(), after.zonedDateTime.toString());
  }
}
