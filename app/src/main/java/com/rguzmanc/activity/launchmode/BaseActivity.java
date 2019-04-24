package com.rguzmanc.activity.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.ColorRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.rguzmanc.activity.R;

public abstract class BaseActivity extends AppCompatActivity {

  @ColorRes
  abstract int getBackgroundColor();

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_launch_mode);

    getWindow().setBackgroundDrawableResource(getBackgroundColor());

    findViewById(R.id.open_normal_activity_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        goToDefaultActivity();
      }
    });

    findViewById(R.id.open_single_instance_activity_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        goToSingleInstanceActivity();
      }
    });

    findViewById(R.id.open_single_single_top_activity_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        goToSingleTopActivity();
      }
    });

    findViewById(R.id.open_single_task_activity_button).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        goToSingleTaskActivity();
      }
    });
  }

  private void goToDefaultActivity() {
    startActivity(new Intent(this, DefaultActivity.class));
  }

  private void goToSingleTopActivity() {
    startActivity(new Intent(this, SingleTopActivity.class));
  }

  private void goToSingleTaskActivity() {
    startActivity(new Intent(this, SingleTaskActivity.class));
  }

  private void goToSingleInstanceActivity() {
    startActivity(new Intent(this, SingleInstanceActivity.class));
  }
}
