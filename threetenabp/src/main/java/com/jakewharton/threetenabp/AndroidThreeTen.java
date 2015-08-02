package com.jakewharton.threetenabp;

import android.app.Application;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesProvider;

/** Android-specific initializer for the JSR-310 library. */
public final class AndroidThreeTen {
  private static final AtomicBoolean initialized = new AtomicBoolean();

  public static void init(Application application) {
    if (initialized.getAndSet(true)) {
      return;
    }

    TzdbZoneRulesProvider provider;
    try {
      InputStream is = application.getAssets().open("org/threeten/bp/TZDB.dat");
      provider = new TzdbZoneRulesProvider(is);
    } catch (IOException e) {
      throw new IllegalStateException("TZDB.dat missing from assets.", e);
    }

    ZoneRulesProvider.registerProvider(provider);
  }

  private AndroidThreeTen() {
    throw new AssertionError("No instances.");
  }
}
