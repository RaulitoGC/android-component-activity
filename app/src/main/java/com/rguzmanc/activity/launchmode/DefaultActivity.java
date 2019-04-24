package com.rguzmanc.activity.launchmode;

import android.os.Bundle;

import androidx.annotation.Nullable;

import timber.log.Timber;

public class DefaultActivity extends BaseActivity {

  @Override
  int getBackgroundColor() {
    return android.R.color.holo_blue_dark;
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Timber.d("On Create");
  }

  @Override
  protected void onResume() {
    super.onResume();
  }

}
