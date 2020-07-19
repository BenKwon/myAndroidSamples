package com.example.myAndroidPractice;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import butterknife.BindView;

public class ConnectGame extends AppCompatActivity implements View.OnClickListener{
    String turn = "yellow";
    int turn_nums = 0;
    int [][]board = {{0,0,0},
                     {0,0,0},
                     {0,0,0}}; //1 is yellow 2 is red, 0 is no stone on position
    int gaming_flag = 1; //게임 진행중인지 알려주는 플래그 Let player know whether they are playing game or not
    public boolean check_end(){
        int j = 2;

        if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0){
            Toast.makeText(this, "끝", Toast.LENGTH_SHORT).show();
            Button restart = findViewById(R.id.restart);
            restart.setVisibility(View.VISIBLE);
            if(turn=="yellow"){
                TextView result = findViewById(R.id.result);
                result.setText("red WIN !!");
            }
            else{
                TextView result = findViewById(R.id.result);
                result.setText("red WIN !!");
            }
            return true;
        }
        if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != 0){
            Toast.makeText(this, "끝", Toast.LENGTH_SHORT).show();
            Button restart = findViewById(R.id.restart);
            restart.setVisibility(View.VISIBLE);
            if(turn=="yellow"){
                TextView result = findViewById(R.id.result);
                result.setText("red WIN !!");
            }
            else{
                TextView result = findViewById(R.id.result);
                result.setText("yellow WIN !!");
            }
            return true;
        }
        for(int i = 0; i < 3 ; i++){
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != 0){
                Toast.makeText(this, "끝", Toast.LENGTH_SHORT).show();
                Button restart = findViewById(R.id.restart);
                restart.setVisibility(View.VISIBLE);
                if(turn=="yellow"){
                    TextView result = findViewById(R.id.result);
                    result.setText("red WIN !!");
                }
                else{
                    TextView result = findViewById(R.id.result);
                    result.setText("yellow WIN !!");
                }
                return true;
            }
            if(board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != 0){
                Toast.makeText(this, "끝", Toast.LENGTH_SHORT).show();
                Button restart = findViewById(R.id.restart);
                restart.setVisibility(View.VISIBLE);
                if(turn=="yellow"){
                    TextView result = findViewById(R.id.result);
                    result.setText("red WIN !!");
                }
                else{
                    TextView result = findViewById(R.id.result);
                    result.setText("yellow WIN !!");
                }
                return true;
            }
        }
        if(turn_nums==9){
            Toast.makeText(this, "끝", Toast.LENGTH_SHORT).show();
            Button restart = findViewById(R.id.restart);
            restart.setVisibility(View.VISIBLE);
            TextView result = findViewById(R.id.result);
            result.setText("DRAW!!");
            return true;
        }
        return  false;
    }

    public void refresh_clicked(View v){
        gaming_flag = 1;
        turn_nums=0;
        board = new int[][]{{0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}};
        ImageView row11 = findViewById(R.id.row11);
        ImageView row12 = findViewById(R.id.row12);
        ImageView row13 = findViewById(R.id.row13);
        ImageView row21 = findViewById(R.id.row21);
        ImageView row22 = findViewById(R.id.row22);
        ImageView row23 = findViewById(R.id.row23);
        ImageView row31 = findViewById(R.id.row31);
        ImageView row32 = findViewById(R.id.row32);
        ImageView row33 = findViewById(R.id.row33);
        Button restart = findViewById(R.id.restart);

        row11.setTranslationY(-2000);
        row12.setTranslationY(-2000);
        row13.setTranslationY(-2000);
        row21.setTranslationY(-2000);
        row22.setTranslationY(-2000);
        row23.setTranslationY(-2000);
        row31.setTranslationY(-2000);
        row32.setTranslationY(-2000);
        row33.setTranslationY(-2000);
        restart.setVisibility(View.INVISIBLE);
        TextView result = findViewById(R.id.result);
        result.setText("");
    }


    public void onClick(View v){
        if(gaming_flag == 1) {
            turn_nums++;
            switch (v.getId()) {
                case (R.id.row1):
                    ImageView row11 = findViewById(R.id.row11);
                    if (turn == "yellow" && board[0][0] == 0) {
                        row11.setImageResource(R.drawable.yellow);
                        board[0][0] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[0][0] == 0) {
                        row11.setImageResource(R.drawable.red);
                        board[0][0] = 2;
                        turn = "yellow";
                    }
                    row11.animate().translationY(15).setDuration(400);
                    Log.i("info", Integer.toString(board[0][0]));
                    break;
                case (R.id.row2):
                    ImageView row12 = findViewById(R.id.row12);
                    if (turn == "yellow" && board[0][1] == 0) {
                        row12.setImageResource(R.drawable.yellow);
                        board[0][1] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[0][1] == 0) {
                        row12.setImageResource(R.drawable.red);
                        board[0][1] = 2;
                        turn = "yellow";
                    }
                    row12.animate().translationY(15).setDuration(400);
                    Log.i("info", Integer.toString(board[0][1]));
                    break;
                case (R.id.row3):
                    ImageView row13 = findViewById(R.id.row13);
                    if (turn == "yellow" && board[0][2] == 0) {
                        row13.setImageResource(R.drawable.yellow);
                        board[0][2] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[0][2] == 0) {
                        row13.setImageResource(R.drawable.red);
                        board[0][2] = 2;
                        turn = "yellow";
                    }
                    row13.animate().translationY(15).setDuration(400);
                    Log.i("info", "row1 clicked");
                    break;
                case (R.id.row4):
                    ImageView row21 = findViewById(R.id.row21);
                    if (turn == "yellow" && board[1][0] == 0) {
                        row21.setImageResource(R.drawable.yellow);
                        board[1][0] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[1][0] == 0) {
                        row21.setImageResource(R.drawable.red);
                        board[1][0] = 2;
                        turn = "yellow";
                    }
                    row21.animate().translationY(15).setDuration(400);
                    Log.i("info", "row1 clicked");
                    break;
                case (R.id.row5):
                    ImageView row22 = findViewById(R.id.row22);
                    if (turn == "yellow" && board[1][1] == 0) {
                        row22.setImageResource(R.drawable.yellow);
                        board[1][01] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[1][1] == 0) {
                        row22.setImageResource(R.drawable.red);
                        board[1][1] = 2;
                        turn = "yellow";
                    }
                    row22.animate().translationY(15).setDuration(400);
                    Log.i("info", "row1 clicked");
                    break;
                case (R.id.row6):
                    ImageView row23 = findViewById(R.id.row23);
                    if (turn == "yellow" && board[1][2] == 0) {
                        row23.setImageResource(R.drawable.yellow);
                        board[1][2] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[1][2] == 0) {
                        row23.setImageResource(R.drawable.red);
                        board[1][2] = 2;
                        turn = "yellow";
                    }
                    row23.animate().translationY(15).setDuration(400);
                    Log.i("info", "row1 clicked");
                    break;
                case (R.id.row7):
                    ImageView row31 = findViewById(R.id.row31);
                    if (turn == "yellow" && board[2][0] == 0) {
                        row31.setImageResource(R.drawable.yellow);
                        board[2][0] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[2][0] == 0) {
                        row31.setImageResource(R.drawable.red);
                        board[2][0] = 2;
                        turn = "yellow";
                    }
                    row31.animate().translationY(15).setDuration(400);
                    Log.i("info", "row1 clicked");
                    break;
                case (R.id.row8):
                    ImageView row32 = findViewById(R.id.row32);
                    if (turn == "yellow" && board[2][1] == 0) {
                        row32.setImageResource(R.drawable.yellow);
                        board[2][1] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[2][1] == 0) {
                        row32.setImageResource(R.drawable.red);
                        board[2][1] = 2;
                        turn = "yellow";
                    }
                    row32.animate().translationY(15).setDuration(400);
                    Log.i("info", "row1 clicked");
                    break;
                case (R.id.row9):
                    ImageView row33 = findViewById(R.id.row33);
                    if (turn == "yellow" && board[2][2] == 0) {
                        row33.setImageResource(R.drawable.yellow);
                        board[2][2] = 1;
                        turn = "red";
                    } else if (turn == "red" && board[2][2] == 0) {
                        row33.setImageResource(R.drawable.red);
                        board[2][2] = 2;
                        turn = "yellow";
                    }
                    row33.animate().translationY(15).setDuration(400);
                    Log.i("info", "row1 clicked");
                    break;
            }
            if (check_end()) {
                gaming_flag = 0;
            }
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