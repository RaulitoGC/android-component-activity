package com.rguzmanc.activity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.rguzmanc.activity.widget.SpinnerView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private Button mOpenAnotherActivityButton;
    private Button mOpenDialogButton;
    private Button mOpenProgressDialogButton;
    private Button mOpenStateActivityButton;
    private ProgressDialog mProgressDialog;
    private Dialog mDialog;
    private SpinnerView<String> mNamesSpinnerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mOpenAnotherActivityButton = (Button) findViewById(R.id.open_activity_button);
        mOpenStateActivityButton = (Button) findViewById(R.id.open_state_activity_button);
        mOpenProgressDialogButton = (Button) findViewById(R.id.open_progress_dialog_button);
        mOpenDialogButton = (Button) findViewById(R.id.open_dialog_button);
        mNamesSpinnerView = (SpinnerView) findViewById(R.id.open_name_list_spinner);

        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setMessage("Cargando...");
        mProgressDialog.setCancelable(false);

        mDialog = new Dialog(this);
        mDialog.setContentView(R.layout.dialog_custom);
        mDialog.setTitle("Title...");

        mNamesSpinnerView.setEntries(new String[]{"Juan","Luis","Carlos","Raul","Cesar"});

        mOpenAnotherActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAnotherActivity();
            }
        });

        mOpenStateActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToStateActivity();
            }
        });

        mOpenProgressDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProgressDialog();
            }
        });

        mOpenDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });

        mNamesSpinnerView.setOnItemSpinnerClick(new SpinnerView.OnSpinnerClick() {
            @Override
            public void onItemClick(int position) {
                Log.d(TAG," spinner view on click");
                Log.d(TAG,mNamesSpinnerView.getSelectedItem());
            }

            @Override
            public void onRestoreItems() {

            }
        });

        Log.d(TAG,"On create");
    }

    private void goToAnotherActivity(){
        startActivity(new Intent(this,DialogActivity.class));
    }

    private void goToStateActivity(){
        startActivity(new Intent(this,StateActivity.class));
    }

    private void openProgressDialog(){
        mProgressDialog.show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mProgressDialog.dismiss();
            }
        },30000);
    }

    private void openDialog(){
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
        Log.d(TAG,"On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"On resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"On pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"On stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"On restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"On destroy");
    }
}
