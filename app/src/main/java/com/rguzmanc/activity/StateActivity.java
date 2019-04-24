package com.rguzmanc.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import timber.log.Timber;

public class StateActivity extends AppCompatActivity {

  public static final String ARGS_NAME = "ARGS_NAME";
  public static final String ARGS_LAST_NAME = "ARGS_LAST_NAME";
  public static final String ARGS_AGE = "ARGS_AGE";

  private EditText mNameEditText;
  private EditText mLastNameEditText;
  private EditText mAgeEditText;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_state);

    mNameEditText = findViewById(R.id.name_edit_text);
    mLastNameEditText = findViewById(R.id.last_name_edit_text);
    mAgeEditText = findViewById(R.id.age_edit_text);
    Timber.d("On Create");
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Timber.d("On Save instance state");
    outState.putString(ARGS_NAME, mNameEditText.getText().toString());
    outState.putString(ARGS_LAST_NAME, mLastNameEditText.getText().toString());
    outState.putString(ARGS_AGE, mAgeEditText.getText().toString());
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    Timber.d("On Restore instance state");
    mNameEditText.setText(savedInstanceState.getString(ARGS_NAME));
    mLastNameEditText.setText(savedInstanceState.getString(ARGS_LAST_NAME));
    mAgeEditText.setText(savedInstanceState.getString(ARGS_AGE));
  }

  @Override
  protected void onStart() {
    super.onStart();
    Timber.d("On Start");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Timber.d("On Pause");
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
