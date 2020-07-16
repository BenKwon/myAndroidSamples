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
            homer.animate().alpha(0).setDuration(2000).start();
            bart.animate().alpha(1).setDuration(2000).start();
            bart_turn = 0;
        }else{
            homer.animate().alpha(1).setDuration(2000).start();
            bart.animate().alpha(0).setDuration(2000).start();
            bart_turn = 1;
        }



    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fading_animations);
    }
}