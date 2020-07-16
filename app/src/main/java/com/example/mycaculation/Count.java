package com.example.mycaculation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;

public class Count extends AppCompatActivity {
    @BindView(R.id.count_text)
    TextView count;
    int count_num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        TextView count = findViewById(R.id.count_text);
        count_num = 0;
        count.setText("" + count_num);
        final Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                if(msg.what == 10){
                    Toast.makeText(Count.this, "카운트가 완료되었습니다", Toast.LENGTH_SHORT).show();
                }
                count.setText("" + msg.what);
            }
        };

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for(int i =0; i < 10 ; i++){
                    count_num++;
                    Message msg = Message.obtain();
                    msg.what = count_num;
                    handler.sendMessage(msg);
                    try{
                        Thread.sleep(1000);
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

}