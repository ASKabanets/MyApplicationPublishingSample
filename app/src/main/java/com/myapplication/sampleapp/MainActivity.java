package com.myapplication.sampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.mypublishinglibrary.MyDummyEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("TAG", new MyDummyEntity().getTestString());
        Log.i("TAG", getResources().getString(R.string.library_test_string));
    }
}
