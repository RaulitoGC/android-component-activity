package com.rguzmanc.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import timber.log.Timber;

public class DialogActivity extends AppCompatActivity {

  public static final String TAG = DialogActivity.class.getSimpleName();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_another);
    Timber.d("On Create");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Timber.d("On Start");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Timber.d("On Resume");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Timber.d("On Pause");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Timber.d("On Stop");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Timber.d("On Restart");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Timber.d("On Destroy");
  }
}
