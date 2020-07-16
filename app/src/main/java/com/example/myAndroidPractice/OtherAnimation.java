package com.example.myAndroidPractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;

public class OtherAnimation extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_animation);
        ImageView bart = findViewById(R.id.bart);
        bart.animate().translationX(-300).setDuration(2000);
    }
}