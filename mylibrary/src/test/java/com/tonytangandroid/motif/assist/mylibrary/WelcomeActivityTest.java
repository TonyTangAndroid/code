package com.tonytangandroid.motif.assist.mylibrary;

import android.content.Intent;
import android.os.Build;
import com.dicedmelon.example.android.library.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.P)
public class WelcomeActivityTest {

  @Test public void clickingLogin_shouldStartLoginActivity() {
    WelcomeActivity activity = Robolectric.setupActivity(WelcomeActivity.class);
    activity.findViewById(R.id.login).performClick();

    Intent expectedIntent = new Intent(activity, LoginActivity.class);
    Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
    assertEquals(expectedIntent.getComponent(), actual.getComponent());
  }
}