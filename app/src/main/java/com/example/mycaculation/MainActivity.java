package com.example.mycaculation;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;
        public void onClick(View v) {
            Intent intent = new Intent();
            switch (v.getId()){
                case R.id.btn1: //계산기
                    intent = new Intent(this, caculator.class);
                    startActivity(intent);
                    break;
                case R.id.btn2: //이미지 전환
                    intent = new Intent(this, imageChange.class);
                    startActivity(intent);
                    break;
                case R.id.btn3:
                    intent = new Intent(this, Count.class);
                    startActivity(intent);
                    break;
                case R.id.btn4:
                    intent = new Intent(this, relatvieLayout_1.class);
                    startActivity(intent);
                    break;
                case R.id.btn5:
                    intent = new Intent(this, LoginActivity.class);
                    startActivity(intent);
                    break;
                case R.id.btn6:
                    intent = new Intent(this, FadingAnimations.class);
                    startActivity(intent);
                    break;
            }
        }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);
        Button btn1 = findViewById(R.id.btn1);
        Button btn2 = findViewById(R.id.btn2);
        Button btn3 = findViewById(R.id.btn3);
        Button btn4 = findViewById(R.id.btn4);
        Button btn5 = findViewById(R.id.btn5);
        Button btn6 = findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);

    }
}

