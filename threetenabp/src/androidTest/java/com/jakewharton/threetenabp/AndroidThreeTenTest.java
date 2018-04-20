package com.jakewharton.threetenabp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
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
