package com.jakewharton.threetenabp;

import android.content.Context;
import androidx.test.InstrumentationRegistry;
import org.junit.Test;
import org.threeten.bp.zone.ZoneRulesProvider;

import static com.google.common.truth.Truth.assertThat;

public final class AndroidThreeTenTest {
  private final Context context =
      InstrumentationRegistry.getTargetContext().getApplicationContext();

  @Test public void litmus() {
    AndroidThreeTen.init(context);
    assertThat(ZoneRulesProvider.getAvailableZoneIds()).isNotEmpty();
  }
}
