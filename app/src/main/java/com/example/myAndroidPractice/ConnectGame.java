package com.example.myAndroidPractice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;

public class ConnectGame extends AppCompatActivity {
    @BindView(R.id.row1_1)
    ImageView row1_1;
    public void rock_clicked(View v){
        row1_1.setTranslationY(1500);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_connect_game);
    }
}