package com.rguzmanc.activity.launchmode;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

public class DefaultActivity extends BaseActivity {

  @Override
  int getBackgroundColor() {
    return android.R.color.holo_blue_dark;
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.d("DefaultActivity", "On Create");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.d("DefaultActivity", "On Resume");
  }

}
