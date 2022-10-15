package com.example.calcualtion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import com.example.calcualtion.Calculation;

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
        view = findViewById(R.id.result);
        add = findViewById(R.id.plus);
        subtract = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        one = findViewById(R.id.number1);
        two = findViewById(R.id.number2);
        three = findViewById(R.id.number3);
        four = findViewById(R.id.number4);
        five = findViewById(R.id.number5);
        six = findViewById(R.id.number6);
        seven = findViewById(R.id.number7);
        eight = findViewById(R.id.number8);
        nine = findViewById(R.id.number9);
        dot = findViewById(R.id.dot);
        zero = findViewById(R.id.number0);
        equal = findViewById(R.id.equals);
        percent = findViewById(R.id.percent);
        positive = findViewById(R.id.positive);
        clean = findViewById(R.id.AC);

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
        clean.setOnClickListener(btulistener);
        equal.setOnClickListener(btulistener);
        subtract.setOnClickListener(btulistener);
        percent.setOnClickListener(btulistener);
        positive.setOnClickListener(btulistener);
        view.setText("0");
    }

    View.OnClickListener btulistener = new View.OnClickListener() {
        String currentNumber = "";
        String lastNumber = "0";
        int dotNumber = 0;
        int cleanStatus = 0;
        //判断连等
        int equalNum = 0;
        //判断运算状态
        int calStatus = 0;
        String operator = "";
        String result = "";
        //按压状态
        int buttonStatus=0;

        @SuppressLint("ResourceAsColor")
        @Override
        public void onClick(View v) {
            buttonStatus=0;
            add.setBackgroundResource(R.drawable.circlebuttonorange);
            subtract.setBackgroundResource(R.drawable.circlebuttonorange);
            multiply.setBackgroundResource(R.drawable.circlebuttonorange);
            divide.setBackgroundResource(R.drawable.circlebuttonorange);

            if (currentNumber.length() != 0 && operator.length() != 0) {
                calStatus = 1;
            } else {
                calStatus = 0;
            }
            switch (v.getId()) {
                case R.id.number1:
                    calculation += 1;
                    currentNumber += "1";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number2:
                    calculation += 2;
                    currentNumber += "2";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number3:
                    calculation += 3;
                    currentNumber += "3";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number4:
                    calculation += 4;
                    currentNumber += "4";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number5:
                    calculation += 5;
                    currentNumber += "5";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number6:
                    calculation += 6;
                    currentNumber += "6";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number7:
                    calculation += 7;
                    currentNumber += "7";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number8:
                    calculation += 8;
                    currentNumber += "8";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number9:
                    calculation += 9;
                    currentNumber += "9";
                    equalNum = 0;
                    view.setText(currentNumber);
                    break;
                case R.id.number0:
                    calculation += 0;
                    equalNum = 0;
                    if (currentNumber.length() == 1 && currentNumber.charAt(currentNumber.length() - 1) == '0') {
                        break;
                    }
                    currentNumber += "0";
                    view.setText(currentNumber);
                    break;
                case R.id.dot:
                    calculation += '.';
                    equalNum = 0;
                    if (dotNumber != 0) {
                        break;
                    } else if (currentNumber.length() == 0) {
                        currentNumber = "0.";
                        dotNumber++;
                    } else {
                        currentNumber += ".";
                        dotNumber++;
                    }
                    view.setText(currentNumber);
                    break;
                //考虑输入多个符号的情况
                //equal完成连乘功能
                case R.id.plus:
                    calculation += '+';
                    buttonStatus=1;
                    if (calStatus == 1&&equalNum==0) {
                        result = Calculation.calcuationFunction(currentNumber, lastNumber, operator);
                        lastNumber = result;
                        currentNumber = "";
                        operator = "+";
                        dotNumber = 0;
                        view.setText(result);
                        break;
                    }

                    lastNumber = currentNumber;
                    currentNumber = "";
                    operator = "+";
                    dotNumber = 0;
                    equalNum = 0;
                    break;
                case R.id.minus:
                    calculation += '-';
                    buttonStatus=2;
                    if (calStatus == 1&&equalNum==0) {
                        result = Calculation.calcuationFunction(currentNumber, lastNumber, operator);
                        lastNumber = result;
                        currentNumber = "";
                        operator = "-";
                        dotNumber = 0;
                        view.setText(result);
                        break;
                    }
                    lastNumber = currentNumber;
                    currentNumber = "";
                    operator = "-";
                    dotNumber = 0;
                    equalNum = 0;
                    break;
                case R.id.multiply:
                    buttonStatus=3;
                    calculation += '*';
                    if (calStatus == 1&&equalNum==0) {
                        result = Calculation.calcuationFunction(currentNumber, lastNumber, operator);
                        lastNumber = result;
                        currentNumber = "";
                        operator = "*";
                        dotNumber = 0;
                        view.setText(result);
                        break;
                    }
                    lastNumber = currentNumber;
                    currentNumber = "";
                    operator = "*";
                    dotNumber = 0;
                    equalNum = 0;
                    break;
                case R.id.divide:
                    buttonStatus=4;
                    calculation += '/';
                    if (calStatus == 1&&equalNum==0) {
                        result = Calculation.calcuationFunction(currentNumber, lastNumber, operator);
                        lastNumber = result;
                        currentNumber = "";
                        operator = "/";
                        dotNumber = 0;
                        view.setText(result);
                        break;
                    }
                    lastNumber = currentNumber;
                    currentNumber = "";
                    operator = "/";
                    dotNumber = 0;
                    equalNum = 0;
                    break;
                case R.id.AC:
                    equalNum = 0;
                    //在刚输入运算符的情况下，lastnumber不会被清除，只是清除显示
                    Toast.makeText(MainActivity.this, "cleanStatus:" + cleanStatus, Toast.LENGTH_SHORT).show();
                    if (cleanStatus == 0) {
                        calculation = "";
                        currentNumber = "";
                        lastNumber = "0";
                        operator = "";
                        view.setText("0");
                    } else if (currentNumber.length() != 0) {
                        currentNumber = "";
                        view.setText("0");
                        cleanStatus = 0;
                    } else {
                        view.setText("0");
                        cleanStatus = 0;
                    }
                    break;
                case R.id.equals:
                    if (equalNum != 0) {
                        result = Calculation.calcuationFunction(lastNumber, currentNumber, operator);
                        currentNumber = result;
                        view.setText(result);
                        equalNum++;
                        break;
                    }
                    result = Calculation.calcuationFunction(currentNumber, lastNumber, operator);
                    Toast.makeText(MainActivity.this, "result:" + result, Toast.LENGTH_SHORT).show();
                    lastNumber = currentNumber;
                    currentNumber = result;
                    view.setText(result);
                    equalNum++;
                    break;
                case R.id.percent:
                    if (currentNumber.length() != 0 && currentNumber != "0") {
                        result = Calculation.calcuationFunction(currentNumber, "0.01", "*");
                        currentNumber = result;
                        view.setText(result);
                        break;
                    }
                    break;
                case R.id.positive:
                    if (currentNumber.length() != 0 && currentNumber != "0") {
                        result = Calculation.calcuationFunction(currentNumber, "-1", "*");
                        currentNumber = result;
                        view.setText(result);
                        break;
                    }
                    break;
            }
            switch (buttonStatus){
                case 1:
                    add.setBackgroundResource(R.drawable.circlebuttonorangepress);
                    break;
                case 2:
                    subtract.setBackgroundResource(R.drawable.circlebuttonorangepress);
                    break;
                case 3:
                    multiply.setBackgroundResource(R.drawable.circlebuttonorangepress);
                    break;
                case 4:
                    divide.setBackgroundResource(R.drawable.circlebuttonorangepress);
                    break;
                default:
                    break;
            }
            if (view.getText() != "0") {
                cleanStatus = 1;
                Toast.makeText(MainActivity.this, view.getText(), Toast.LENGTH_SHORT).show();
            }
            if (cleanStatus == 1) {
                clean.setText("C");
            } else {
                clean.setText("AC");
            }
        }
    };
}