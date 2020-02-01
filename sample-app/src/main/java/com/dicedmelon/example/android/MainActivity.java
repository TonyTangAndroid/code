package com.dicedmelon.example.android;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import com.dicedmelon.example.android.databinding.ActivityMainBinding;
import com.tonytangandroid.motif.assist.mylibrary.AndroidCode;
import com.tonytangandroid.motif.assist.mylibrary.AppTestCode;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ActivityMainBinding viewDataBinding =
        DataBindingUtil.setContentView(this, R.layout.activity_main);

    NumberProvider numberProvider = new NumberProvider();
    viewDataBinding.setNumber(numberProvider.provideNumber());

    System.out.println(AppTestCode.message());
  }
}
