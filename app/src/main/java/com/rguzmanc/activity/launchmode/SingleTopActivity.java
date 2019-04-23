package com.rguzmanc.activity.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;


public class SingleTopActivity extends BaseActivity {

  @Override
  int getBackgroundColor() {
    return android.R.color.holo_red_dark;
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d("SingleTopActivity", "On Create");
  }

  @Override
  protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    Log.d("SingleTopActivity", "On New Intent Called");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d("SingleTopActivity", "On Resume");
  }
}
