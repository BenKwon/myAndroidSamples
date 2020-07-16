package com.example.myAndroidPractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class FadingAnimations extends AppCompatActivity {
    int bart_turn = 1;
    public void fade_change(View v){
        Log.i("info","clicked");
        ImageView bart = (ImageView) findViewById(R.id.bart);
        ImageView homer = (ImageView) findViewById(R.id.homer);
        if(bart_turn == 1){

        }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fading_animations);
    }
}