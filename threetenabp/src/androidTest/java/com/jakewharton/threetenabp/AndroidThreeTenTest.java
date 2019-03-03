package com.jakewharton.threetenabp;

import android.content.Context;
import androidx.test.InstrumentationRegistry;
import org.junit.Test;
import org.threeten.bp.zone.ZoneRulesProvider;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.fail;

public final class AndroidThreeTenTest {
  private final Context context =
      InstrumentationRegistry.getTargetContext().getApplicationContext();

  @Test public void litmus() {
    AndroidThreeTen.init(context);
    assertThat(ZoneRulesProvider.getAvailableZoneIds()).isNotEmpty();
  }

  @Test public void customPath() {
    AndroidThreeTen.init(context, "does/not/exist.dat");
    try {
      // This will trigger class loading and parsing of the supplied file.
      ZoneRulesProvider.getAvailableZoneIds();
      fail();
    } catch (ExceptionInInitializerError e) {
      assertThat(e).hasCauseThat().isInstanceOf(IllegalStateException.class);
      assertThat(e).hasCauseThat().hasMessageThat().isEqualTo("does/not/exist.dat missing from assets");
    }
  }
}
