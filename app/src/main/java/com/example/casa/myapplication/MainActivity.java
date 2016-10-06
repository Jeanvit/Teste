package com.example.casa.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.opencv.android.OpenCVLoader;
import org.opencv.core.Core;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    static{
        System.loadLibrary("MyLibs");
        if (OpenCVLoader.initDebug()){
            Log.d(TAG, "Opencv Loaded");
        } else{
            Log.d(TAG, "ERRO");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView) findViewById(R.id.textView)).setText(NativeClass.getMessageFromJNI());
    }
}
