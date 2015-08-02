package com.jakewharton.threetenabp.sample;

import android.app.Application;
import com.jakewharton.threetenabp.AndroidThreeTen;

public final class ExamplesApp extends Application {
  @Override public void onCreate() {
    super.onCreate();
    AndroidThreeTen.init(this);
  }
}
