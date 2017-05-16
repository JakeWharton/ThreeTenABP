package com.jakewharton.threetenabp;

import android.app.Application;
import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesInitializer;
import org.threeten.bp.zone.ZoneRulesProvider;

import static org.threeten.bp.zone.ZoneRulesInitializer.DO_NOTHING;

/** Android-specific initializer for the JSR-310 library. */
public final class AndroidThreeTen {
  static {
    ZoneRulesInitializer.setInitializer(DO_NOTHING);
  }

  private static final AtomicBoolean initialized = new AtomicBoolean();

  public static void init(Application application) {
    init((Context) application);
  }

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
