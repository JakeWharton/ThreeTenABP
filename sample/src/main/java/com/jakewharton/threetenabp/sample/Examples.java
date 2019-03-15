package com.jakewharton.threetenabp.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.jakewharton.threetenabp.format.AndroidDateTimeFormatter;

import org.threeten.bp.Instant;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.format.DateTimeFormatter;
import org.threeten.bp.format.FormatStyle;

import static android.util.TypedValue.COMPLEX_UNIT_SP;
import static android.view.Gravity.CENTER;

public final class Examples extends Activity {
  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    DateTimeFormatter formatter = AndroidDateTimeFormatter.ofLocalizedTime(this);

    TextView tv = new TextView(this);
    tv.setGravity(CENTER);
    tv.setTextSize(COMPLEX_UNIT_SP, 20);
    tv.setText("NOW: " + formatter.format(hereAndNow()));
    setContentView(tv);
  }

  public Instant now() {
    return Instant.now();
  }

  public ZonedDateTime hereAndNow() {
    return ZonedDateTime.ofInstant(now(), ZoneId.systemDefault());
  }
}
