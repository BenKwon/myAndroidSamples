package com.example.myAndroidPractice;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class caculator extends AppCompatActivity implements View.OnClickListener {
    Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8, btn_9;
    Button plus, minus, divide, multiply, clear, result, double_btn;
    TextView tv;
    String pro = "";

    //return result of string math expression
    public static double eval(final String str) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() {
                ch = (++pos < str.length()) ? str.charAt(pos) : -1;
            }
            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }
            double parse() {
                nextChar();
                double x = parseExpression();
                if (pos < str.length()) Log.i("info", "eval function error");
                //throw new RuntimeException("Unexpected: " + (char)ch);
                return x;
            }
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x;
                }
            }
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x;
                }
            }
            double parseFactor() {
                if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                double x = 0;
                int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();
                    String func = str.substring(startPos, this.pos);
                    x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else Log.i("info", "eval function error2");
                } else {
                    Log.i("info", "eval function error3");
                }
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x;
            }
        }.parse();
    }

    @Override
    public void onClick(View v){
        if(pro == "0") pro = "";
        if(v.getId() == R.id.btn_0) pro += "0";
        else if(v.getId() == R.id.btn_1) pro += "1";
        else if(v.getId() == R.id.btn_2) pro += "2";
        else if(v.getId() == R.id.btn_3) pro += "3";
        else if(v.getId() == R.id.btn_4) pro += "4";
        else if(v.getId() == R.id.btn_5) pro += "5";
        else if(v.getId() == R.id.btn_6) pro += "6";
        else if(v.getId() == R.id.btn_7) pro += "7";
        else if(v.getId() == R.id.btn_8) pro += "8";
        else if(v.getId() == R.id.btn_9) pro += "9";
        else if(v.getId() == R.id.double_btn) pro += ".";
            //연산
        else if(v.getId() == R.id.plus) pro += "+";
        else if(v.getId() == R.id.minus) pro += "-";
        else if(v.getId() == R.id.multiply) pro += "*";
        else if(v.getId() == R.id.divide) pro += "/";
        else if(v.getId() == R.id.plus) pro += "+";
            //clear
        else if(v.getId() == R.id.clear) pro = "0";
            //result
        else if(v.getId() == R.id.result) {
            pro = Double.toString(eval(pro));
        }
        //set tv text
        tv = (TextView) findViewById(R.id.board_tv);
        tv.setText(pro);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main_caculator);
        tv = (TextView) findViewById(R.id.board_tv);
        tv.setText("0");
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0.setOnClickListener(this);
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);

        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        clear = findViewById(R.id.clear);
        result = findViewById(R.id.result);
        double_btn = findViewById(R.id.double_btn);

        double_btn.setOnClickListener(this);
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        divide.setOnClickListener(this);
        multiply.setOnClickListener(this);
        clear.setOnClickListener(this);
        result.setOnClickListener(this);

    }
}
