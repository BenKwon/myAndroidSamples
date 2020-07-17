package com.example.myAndroidPractice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;

public class ConnectGame extends AppCompatActivity implements View.OnClickListener{
    String turn = "yellow";
    int [][]board = {{0,0,0},
                     {0,0,0},
                     {0,0,0}}; //1 is yellow 2 is red, 0 is no stone on position
    public boolean check_end(){
        for(int i = 0 ; i < 3 ; i ++){
            for(int j = 0 ;  j < 3 ; j++){
                if(board[i][j]==board[i+1][j] && board[i][j] == board[i+2][j]) {
                    return true;
                }
                if(j==0){
                    if(board[i][j]==board[i+1][j]&& board[i][j] == board[i+2][j]){
                        return  true;
                    }
                }
            }
        }
        return  false;
    }
    public void check_board(View v){
        for(int i = 0 ; i<3 ; i ++){
            for(int j = 0 ; j < 3 ; j++){
                Log.i("info;"Integer.toString(board[i][j]));
            }
        }

    }

    public void onClick(View v){
        switch (v.getId()){
            case (R.id.row1):
                ImageView row11 = findViewById(R.id.row11);
                if(turn=="yellow" && board[0][0] ==0){
                    row11.setImageResource(R.drawable.yellow);
                    board[0][0] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[0][0] == 0){
                    row11.setImageResource(R.drawable.red);
                    board[0][0] = 2;
                    turn = "yellow";
                }
                row11.animate().translationY(15).setDuration(400);
                Log.i("info",Integer.toString(board[0][0]));
                break;
            case (R.id.row2):
                ImageView row12 = findViewById(R.id.row12);
                if(turn=="yellow" && board[0][1] ==0){
                    row12.setImageResource(R.drawable.yellow);
                    board[0][1] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[0][1] == 0){
                    row12.setImageResource(R.drawable.red);
                    board[0][1] = 2;
                    turn = "yellow";
                }
                row12.animate().translationY(15).setDuration(400);
                Log.i("info",Integer.toString(board[0][1]));
                break;
            case (R.id.row3):
                ImageView row13 = findViewById(R.id.row13);
                if(turn=="yellow" && board[0][2] ==0){
                    row13.setImageResource(R.drawable.yellow);
                    board[0][2] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[0][2] == 0){
                    row13.setImageResource(R.drawable.red);
                    board[0][2] = 2;
                    turn = "yellow";
                }
                row13.animate().translationY(15).setDuration(400);
                Log.i("info","row1 clicked");
                break;
            case (R.id.row4):
                ImageView row21 = findViewById(R.id.row21);
                if(turn=="yellow" && board[1][0] ==0){
                    row21.setImageResource(R.drawable.yellow);
                    board[1][0] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[1][0] == 0){
                    row21.setImageResource(R.drawable.red);
                    board[1][0] = 2;
                    turn = "yellow";
                }
                row21.animate().translationY(15).setDuration(400);
                Log.i("info","row1 clicked");
                break;
            case (R.id.row5):
                ImageView row22 = findViewById(R.id.row22);
                if(turn=="yellow" && board[1][1] ==0){
                    row22.setImageResource(R.drawable.yellow);
                    board[1][01] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[1][1] == 0){
                    row22.setImageResource(R.drawable.red);
                    board[1][1] = 2;
                    turn = "yellow";
                }
                row22.animate().translationY(15).setDuration(400);
                Log.i("info","row1 clicked");
                break;
            case (R.id.row6):
                ImageView row23 = findViewById(R.id.row23);
                if(turn=="yellow" && board[1][2] ==0){
                    row23.setImageResource(R.drawable.yellow);
                    board[1][2] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[1][2] == 0){
                    row23.setImageResource(R.drawable.red);
                    board[1][2] = 2;
                    turn = "yellow";
                }
                row23.animate().translationY(15).setDuration(400);
                Log.i("info","row1 clicked");
                break;
            case (R.id.row7):
                ImageView row31 = findViewById(R.id.row31);
                if(turn=="yellow" && board[2][0] ==0){
                    row31.setImageResource(R.drawable.yellow);
                    board[2][0] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[2][0] == 0){
                    row31.setImageResource(R.drawable.red);
                    board[2][0] = 2;
                    turn = "yellow";
                }
                row31.animate().translationY(15).setDuration(400);
                Log.i("info","row1 clicked");
                break;
            case (R.id.row8):
                ImageView row32 = findViewById(R.id.row32);
                if(turn=="yellow" && board[2][1] ==0){
                    row32.setImageResource(R.drawable.yellow);
                    board[2][1] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[2][1] == 0){
                    row32.setImageResource(R.drawable.red);
                    board[2][1] = 2;
                    turn = "yellow";
                }
                row32.animate().translationY(15).setDuration(400);
                Log.i("info","row1 clicked");
                break;
            case (R.id.row9):
                ImageView row33 = findViewById(R.id.row33);
                if(turn=="yellow" && board[2][2] ==0){
                    row33.setImageResource(R.drawable.yellow);
                    board[2][2] = 1;
                    turn ="red";
                }
                else if(turn=="red" && board[2][2] == 0){
                    row33.setImageResource(R.drawable.red);
                    board[2][2] = 2;
                    turn = "yellow";
                }
                row33.animate().translationY(15).setDuration(400);
                Log.i("info","row1 clicked");
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_connect_game);
        ImageView row1 = findViewById(R.id.row1);
        ImageView row2 = findViewById(R.id.row2);
        ImageView row3 = findViewById(R.id.row3);
        ImageView row4 = findViewById(R.id.row4);
        ImageView row5 = findViewById(R.id.row5);
        ImageView row6 = findViewById(R.id.row6);
        ImageView row7 = findViewById(R.id.row7);
        ImageView row8 = findViewById(R.id.row8);
        ImageView row9 = findViewById(R.id.row9);
        row1.setOnClickListener(this);
        row2.setOnClickListener(this);
        row3.setOnClickListener(this);
        row4.setOnClickListener(this);
        row5.setOnClickListener(this);
        row6.setOnClickListener(this);
        row7.setOnClickListener(this);
        row8.setOnClickListener(this);
        row9.setOnClickListener(this);





    }
}