package com.rguzmanc.activity.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;


public class SingleTaskActivity extends BaseActivity {

  @Override
  int getBackgroundColor() {
    return android.R.color.holo_green_dark;
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d("SingleTaskActivity", "On Create");
  }

  @Override
  protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    Log.d("SingleTaskActivity", "On New Intent Called");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d("SingleTaskActivity", "On Resume");
  }
}
