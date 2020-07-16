package com.example.mycaculation;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.OnClick;

public class imageChange  extends AppCompatActivity {
    int flag = 1 ;

    public void image_change(View v){
        ImageView image4 = (ImageView) findViewById(R.id.imageView4);
        ImageView image3 = (ImageView) findViewById(R.id.imageView3);
        if(flag == 1){
            image4.setImageResource(R.drawable.img1);
            image3.setImageResource(R.drawable.img2);
            flag = 0;
        }
        else if(flag == 0){
            image4.setImageResource(R.drawable.img2);
            image3.setImageResource(R.drawable.img1);
            flag = 1;
        }
        /*
        if(flag == 1){
            image4.setVisibility(View.VISIBLE);
            image3.setVisibility(View.INVISIBLE);
            flag = 0;
        }
        else{
            image3.setVisibility(View.VISIBLE);
            image4.setVisibility(View.INVISIBLE);
            flag = 1;
        }

      */
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.image_change);
        flag = 1;

    }
}
