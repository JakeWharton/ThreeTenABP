package com.jakewharton.threetenabp.sample;

import androidx.test.rule.ActivityTestRule;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

  /** Assert that date-time info is retained after serialization and deserialization. */
  @Test public void proguardAllowsSerialization() throws Exception {
    ZonedDateTime expected = examplesActivity.getActivity().hereAndNow();

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    try (ObjectOutputStream os = new ObjectOutputStream(out)) {
      os.writeObject(expected);
    }
    byte[] bytes = out.toByteArray();

    ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(bytes));
    ZonedDateTime actual = (ZonedDateTime) in.readObject();

    // Difference is only reflected in toString and not just equals.
    assertEquals(expected.toString(), actual.toString());
  }
}
