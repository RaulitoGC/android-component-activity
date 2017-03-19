package com.rguzmanc.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.EditText;

/**
 * Created by Raul Guzman Condor <raul.guzman@mediabyte.com.pe> on 3/19/17.
 */

public class StateActivity extends AppCompatActivity {

    public static final String TAG = StateActivity.class.getSimpleName();

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

        mNameEditText = (EditText) findViewById(R.id.name_edit_text);
        mLastNameEditText = (EditText) findViewById(R.id.last_name_edit_text);
        mAgeEditText = (EditText) findViewById(R.id.age_edit_text);

        /*
        if(savedInstanceState != null){
            mNameEditText.setText(savedInstanceState.getString(ARGS_NAME));
            mLastNameEditText.setText(savedInstanceState.getString(ARGS_LAST_NAME));
            mAgeEditText.setText(savedInstanceState.getString(ARGS_AGE));
        }
        */

        Log.d(TAG,"On create");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(TAG,"On Save instance state");
        outState.putString(ARGS_NAME,mNameEditText.getText().toString());
        outState.putString(ARGS_LAST_NAME,mLastNameEditText.getText().toString());
        outState.putString(ARGS_AGE,mAgeEditText.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG,"On Restore instance state");
        mNameEditText.setText(savedInstanceState.getString(ARGS_NAME));
        mLastNameEditText.setText(savedInstanceState.getString(ARGS_LAST_NAME));
        mAgeEditText.setText(savedInstanceState.getString(ARGS_AGE));
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
