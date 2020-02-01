package com.tonytangandroid.motif.assist.mylibrary;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.dicedmelon.example.android.library.R;

public class LoginActivity extends Activity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.welcome_activity);

    final View button = findViewById(R.id.login);
    button.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View view) {
        startActivity(new Intent(LoginActivity.this, LoginActivity.class));
      }
    });
  }
}