package com.artjimlop.baseproject.view;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.artjimlop.baseproject.R;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public static Intent getCallingIntent(Context context) {
    return new Intent(context, MainActivity.class);
  }
}
