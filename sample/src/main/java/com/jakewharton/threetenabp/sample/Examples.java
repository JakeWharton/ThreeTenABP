package com.jakewharton.threetenabp.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import org.threeten.bp.Instant;

import static android.util.TypedValue.COMPLEX_UNIT_SP;
import static android.view.Gravity.CENTER;

public final class Examples extends Activity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    TextView tv = new TextView(this);
    tv.setGravity(CENTER);
    tv.setTextSize(COMPLEX_UNIT_SP, 20);
    tv.setText("NOW: " + now());
    setContentView(tv);
  }

  public Instant now() {
    return Instant.now();
  }
}
