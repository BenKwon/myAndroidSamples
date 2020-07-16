package com.example.myAndroidPractice;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;

public class OtherAnimation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_animation);
        ImageView bart = findViewById(R.id.bart2);
        bart.animate().rotation(3600).translationX(15).setDuration(2000);
    }
}