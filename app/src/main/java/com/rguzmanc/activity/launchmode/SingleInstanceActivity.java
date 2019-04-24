package com.rguzmanc.activity.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;

import timber.log.Timber;

public class SingleInstanceActivity extends BaseActivity {

  @Override
  int getBackgroundColor() {
    return android.R.color.holo_purple;
  }

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Timber.d("On Create");
  }

  @Override
  protected void onNewIntent(Intent intent) {
    super.onNewIntent(intent);
    Timber.d("On New Intent");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Timber.d("On Resume");
  }
}
