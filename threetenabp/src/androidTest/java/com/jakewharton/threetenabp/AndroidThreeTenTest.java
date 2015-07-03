package com.jakewharton.threetenabp;

import android.app.Application;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.threeten.bp.zone.ZoneRulesProvider;

import static com.google.common.truth.Truth.assertThat;

@RunWith(AndroidJUnit4.class)
public final class AndroidThreeTenTest {
  private final Application application =
      (Application) InstrumentationRegistry.getTargetContext().getApplicationContext();

  @Test public void litmus() {
    AndroidThreeTen.init(application);
    assertThat(ZoneRulesProvider.getAvailableZoneIds()).isNotEmpty();
  }
}
