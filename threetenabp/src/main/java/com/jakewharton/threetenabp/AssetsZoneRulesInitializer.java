package com.jakewharton.threetenabp;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import org.threeten.bp.zone.TzdbZoneRulesProvider;
import org.threeten.bp.zone.ZoneRulesInitializer;
import org.threeten.bp.zone.ZoneRulesProvider;

final class AssetsZoneRulesInitializer extends ZoneRulesInitializer {
  private final Context context;

  AssetsZoneRulesInitializer(Context context) {
    this.context = context;
  }

  @Override protected void initializeProviders() {
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
}
