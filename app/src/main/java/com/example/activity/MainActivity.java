package com.example.activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "StartActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate");
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestoreInstanceState()", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onRestoreInstanceState");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onRestore", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onRestart");
    }

    @Override
    public void onStart(){
        super.onStart();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStart", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStart");
    }
    @Override
    public void onResume(){
        super.onResume();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onResume", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onSaveInstanceState", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause(){
        super.onPause();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onPause", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy");
    }
}