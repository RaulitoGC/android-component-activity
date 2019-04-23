package com.rguzmanc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DialogActivity extends AppCompatActivity {

    public static final String TAG = DialogActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        Log.d(TAG,"On create");
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
