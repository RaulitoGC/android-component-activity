package com.rguzmanc.activity.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.text.InputType;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;

import com.rguzmanc.activity.R;

/**
 * Created by Raul Guzman Condor <raul.guzman@mediabyte.com.pe> on 3/19/17.
 */

public class SpinnerView<T> extends EditText implements View.OnClickListener {

    private T[] mEntries;
    private T mCurrentItem;
    private int mIndex;
    private String mTitle;
    private OnSpinnerClick listerner = null;

    public interface OnSpinnerClick{
        void onItemClick(int position);
        void onRestoreItems();
    }

    public SpinnerView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
        setFocusable(false);
        setInputType(InputType.TYPE_TEXT_VARIATION_NORMAL);
        setOnClickListener(this);
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public void setOnItemSpinnerClick(OnSpinnerClick listerner){
        this.listerner = listerner;
    }

    private void init(AttributeSet attrs) {
        TypedArray a = getContext().obtainStyledAttributes(attrs,
                R.styleable.SpinnerView);

        mTitle = a.getString(R.styleable.SpinnerView_alertTitle);

        a.recycle();
    }

    public void setEntries(T[] entries) {
        mEntries = entries;
    }

    public T[] getEntries() {
        return mEntries;
    }

    public T getSelectedItem() {
        return mCurrentItem;
    }



    @Override
    public void setSelection(int index) {
        if( mEntries != null && index!=-1){
            mIndex = index;
            mCurrentItem = mEntries[index];
            setText(mCurrentItem.toString());
        }else{
            mCurrentItem=null;
        }
    }

    public int getSelectedItemPosition() {
        return mIndex;
    }

    @Override
    public void onClick(View v) {
        if (mEntries != null) {
            CharSequence[] items = new CharSequence[mEntries.length];
            for (int i = 0; i < mEntries.length; i++) {
                items[i] = mEntries[i].toString();
            }

            AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
            builder.setItems(items, new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int position) {

                    setSelection(position);
                    if (listerner != null) {
                        listerner.onItemClick(position);
                    }

                }
            });
            builder.setTitle(mTitle);
            AlertDialog alert = builder.create();
            alert.show();
        }else{
            listerner.onRestoreItems();
        }
    }
}
