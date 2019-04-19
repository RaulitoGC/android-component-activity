package com.rguzmanc.activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.rguzmanc.activity.launchmode.DefaultActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private ProgressDialog mProgressDialog;
    private Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Cargando...");
        mProgressDialog.setCancelable(false);

        mDialog = new Dialog(this);
        mDialog.setContentView(R.layout.dialog_custom);
        mDialog.setTitle("Title...");

        findViewById(R.id.open_activity_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnotherActivity();
            }
        });

        findViewById(R.id.open_launch_demo_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToLaunchDemoActivity();
            }
        });

        findViewById(R.id.open_state_activity_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStateActivity();
            }
        });

        findViewById(R.id.open_progress_dialog_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgressDialog();
            }
        });

        findViewById(R.id.open_dialog_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        Log.d(TAG, "On create");
    }

    private void goToAnotherActivity() {
        startActivity(new Intent(this, DialogActivity.class));
    }

    private void goToStateActivity() {
        startActivity(new Intent(this, StateActivity.class));
    }

    private void goToLaunchDemoActivity() {
        startActivity(new Intent(this, DefaultActivity.class));
    }

    private void openProgressDialog() {
        mProgressDialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressDialog.dismiss();
            }
        }, 3000);
    }

    private void openDialog() {
        mDialog.show();
        Button dialogButton = (Button) mDialog.findViewById(R.id.dialogButtonOK);
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "On resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "On pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "On stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "On restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "On destroy");
    }
}
