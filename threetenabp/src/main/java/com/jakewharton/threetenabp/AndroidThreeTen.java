package com.jakewharton.threetenabp;

import android.app.Application;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesProvider;

/** Android-specific initializer for the JSR-310 library. */
public final class AndroidThreeTen {
  private static final AtomicBoolean initialized = new AtomicBoolean();

  public static void init(Context context) {
    if (initialized.getAndSet(true)) {
      return;
    }

    TzdbZoneRulesProvider provider;
    InputStream is = null;
    try {
      is = context.getAssets().open("org/threeten/bp/TZDB.dat");
      provider = new TzdbZoneRulesProvider(is);
    } catch (IOException e) {
      throw new IllegalStateException("TZDB.dat missing from assets.", e);
    } finally {
      if (is != null) {
        try {
          is.close();
        } catch (IOException ignored) {
        }
      }
    }

    ZoneRulesProvider.registerProvider(provider);
  }

  private AndroidThreeTen() {
    throw new AssertionError("No instances.");
  }
}
