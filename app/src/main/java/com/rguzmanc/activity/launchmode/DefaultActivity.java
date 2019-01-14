package com.rguzmanc.activity.launchmode;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.rguzmanc.activity.R;

/**
 * Created by Raul Guzman Condor <raul.guzman@mediabyte.com.pe> on 3/19/17.
 */

public class DefaultActivity extends AppCompatActivity {

    private Button mDefaultActivityButton;
    private Button mSingleTopActivityButton;
    private Button mSingleInstanceActivityButton;
    private Button mSingleTaskActivity;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);

        getWindow().setBackgroundDrawableResource(android.R.color.holo_blue_dark);

        mDefaultActivityButton = (Button) findViewById(R.id.open_normal_activity_button);
        mSingleInstanceActivityButton = (Button) findViewById(R.id.open_single_instance_activity_button);
        mSingleTopActivityButton = (Button) findViewById(R.id.open_single_single_top_activity_button);
        mSingleTaskActivity = (Button) findViewById(R.id.open_single_task_activity_button);

        mDefaultActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDefaultActivity();
            }
        });

        mSingleInstanceActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSingleInstanceActivity();
            }
        });

        mSingleTopActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSingleTopActivity();
            }
        });

        mSingleTaskActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSingleTaskActivity();
            }
        });
        Log.d("DefaultActivity", "On Create");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("DefaultActivity", "On Resume");
    }

    private void goToDefaultActivity(){
        startActivity(new Intent(this,DefaultActivity.class));
    }

    private void goToSingleTopActivity(){
        startActivity(new Intent(this,SingleTopActivity.class));
    }

    private void goToSingleTaskActivity(){
        startActivity(new Intent(this,SingleTaskActivity.class));
    }

    private void goToSingleInstanceActivity(){
        startActivity(new Intent(this,SingleInstanceActivity.class));
    }
}
