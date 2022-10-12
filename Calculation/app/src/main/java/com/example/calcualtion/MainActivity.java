package com.example.calcualtion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private TextView view;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button three;
    private Button two;
    private Button one;
    private Button Clean;
    private Button dot;
    private Button zero;
    private Button equal;
    private Button percent;
    private Button positive;
    private Button clean;
    private String calculation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view.findViewById(R.id.result);
        add.findViewById(R.id.add);
        subtract.findViewById(R.id.minus);
        multiply.findViewById(R.id.multiply);
        divide.findViewById(R.id.divide);
        one.findViewById(R.id.number1);
        two.findViewById(R.id.number2);
        three.findViewById(R.id.number3);
        four.findViewById(R.id.number4);
        five.findViewById(R.id.number5);
        six.findViewById(R.id.number6);
        seven.findViewById(R.id.number7);
        eight.findViewById(R.id.number8);
        nine.findViewById(R.id.number9);
        dot.findViewById(R.id.dot);
        zero.findViewById(R.id.number0);
        equal.findViewById(R.id.equals);
        percent.findViewById(R.id.percent);
        positive.findViewById(R.id.positive);
        clean.findViewById(R.id.AC);

        add.setOnClickListener(btulistener);
        multiply.setOnClickListener(btulistener);
        divide.setOnClickListener(btulistener);
        dot.setOnClickListener(btulistener);
        one.setOnClickListener(btulistener);
        two.setOnClickListener(btulistener);
        three.setOnClickListener(btulistener);
        four.setOnClickListener(btulistener);
        five.setOnClickListener(btulistener);
        six.setOnClickListener(btulistener);
        seven.setOnClickListener(btulistener);
        eight.setOnClickListener(btulistener);
        nine.setOnClickListener(btulistener);
        zero.setOnClickListener(btulistener);
        Clean.setOnClickListener(btulistener);
        equal.setOnClickListener(btulistener);
        subtract.setOnClickListener(btulistener);

    }
    View.OnClickListener btulistener = new View.OnClickListener() {
        String currentNumber;
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.number1:
                    calculation+=1;
                    currentNumber+="1";
                    view.setText(currentNumber);
                    break;
                case R.id.number2:
                    calculation+=2;
                    currentNumber+="2";
                    view.setText(currentNumber);
                    break;
                case R.id.number3:
                    calculation+=3;
                    currentNumber+="3";
                    view.setText(currentNumber);
                    break;
                case R.id.number4:
                    calculation+=4;
                    currentNumber+="4";
                    view.setText(currentNumber);
                    break;
                case R.id.number5:
                    calculation+=5;
                    currentNumber+="5";
                    view.setText(currentNumber);
                    break;
                case R.id.number6:
                    calculation+=6;
                    currentNumber+="6";
                    view.setText(currentNumber);
                    break;
                case R.id.number7:
                    calculation+=7;
                    currentNumber+="7";
                    view.setText(currentNumber);
                    break;
                case R.id.number8:
                    calculation+=8;
                    currentNumber+="8";
                    view.setText(currentNumber);
                    break;
                case R.id.number9:
                    calculation+=9;
                    currentNumber+="9";
                    view.setText(currentNumber);
                    break;
                case R.id.number0:
                    calculation+=0;
                    currentNumber+="0";
                    view.setText(currentNumber);
                    break;
                //考虑输入多个符号的情况
                case R.id.add:
                    calculation+='+';
                    currentNumber="0";
                    break;
                case R.id.minus:
                    calculation+='-';
                    currentNumber="0";
                    break;
                case R.id.multiply:
                    calculation+='+';
                    currentNumber="0";
                    break;
            }

        }
    };
}