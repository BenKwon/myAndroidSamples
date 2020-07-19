package com.example.myAndroidPractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.d("info","--------------OnCreate---------------");
    }
    @Override
    protected  void onStart() {
        super.onStart();
        Log.d("info","--------------OnStart---------------");

    }

    @Override
    protected  void onResume(){
        super.onResume();
        Log.d("info","--------------OnResume---------------");

    }
    @Override
    protected  void onPause(){
        super.onPause();
        Log.d("info","--------------OnPause---------------");

    }
    @Override
    protected  void onStop(){
        super.onStop();
        Log.d("info","--------------OnStop---------------");

    }
    @Override
    protected  void onRestart(){
        super.onRestart();
        Log.d("info","--------------OnRestart---------------");

    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d("info","--------------OnDestroy---------------");

    }


}