package com.example.myprojectiscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    TextView str;
    TextView result;
    String number;
    String number1;
    String number2;
    String numberRes;
    String action;
    String percNum;
    boolean percFunc;
    boolean haveAction;
    String p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button clear = (Button) findViewById(R.id.clear);
        Button delete = (Button) findViewById(R.id.delete);
        Button percent = (Button) findViewById(R.id.percent);
        Button division = (Button) findViewById(R.id.division);
        Button multiplication = (Button) findViewById(R.id.multiplication);
        Button substraction = (Button) findViewById(R.id.substraction);
        Button addition = (Button) findViewById(R.id.addition);
        Button plusminus = (Button) findViewById(R.id.plusminus);
        Button dot = (Button) findViewById(R.id.dot);
        Button equals = (Button) findViewById(R.id.equals);
        Button n9 = (Button) findViewById(R.id.n9);
        Button n8 = (Button) findViewById(R.id.n8);
        Button n7 = (Button) findViewById(R.id.n7);
        Button n6 = (Button) findViewById(R.id.n6);
        Button n5 = (Button) findViewById(R.id.n5);
        Button n4 = (Button) findViewById(R.id.n4);
        Button n3 = (Button) findViewById(R.id.n3);
        Button n2 = (Button) findViewById(R.id.n2);
        Button n1 = (Button) findViewById(R.id.n1);
        Button n0 = (Button) findViewById(R.id.n0);
        str = (TextView) findViewById(R.id.str);
        result = (TextView) findViewById(R.id.result);

        number = "";
        number1 = "";
        number2 = "";
        numberRes = "";
        action = "";
        percFunc = false;
        percNum = "";
        haveAction = false;
        p = "";

        n9.setOnClickListener(this);
        n8.setOnClickListener(this);
        n7.setOnClickListener(this);
        n6.setOnClickListener(this);
        n5.setOnClickListener(this);
        n4.setOnClickListener(this);
        n3.setOnClickListener(this);
        n2.setOnClickListener(this);
        n1.setOnClickListener(this);
        n0.setOnClickListener(this);
        clear.setOnClickListener(this);
        delete.setOnClickListener(this);
        addition.setOnClickListener(this);
        substraction.setOnClickListener(this);
        equals.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
        percent.setOnClickListener(this);
        dot.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        DecimalFormat format = new DecimalFormat("0.#");
        switch (v.getId()) {
            case R.id.clear:    //If button "C" clicked
                number = "";    //all of strings variables clean
                number1 = "";
                number2 = "";
                numberRes = "";
                action = "";
                percFunc = false;
                percNum = "";
                str.setText(number);
                break;
            case R.id.n9:         //If button "9" clicked
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "9";
                number2 += "9";
                str.setText(number);
                break;
            case R.id.n8:         //If button "8" clicked
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "8";
                number2 += "8";
                str.setText(number);
                break;
            case R.id.n7:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "7";
                number2 += "7";
                str.setText(number);
                break;
            case R.id.n6:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "6";
                number2 += "6";
                str.setText(number);
                break;
            case R.id.n5:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "5";
                number2 += "5";
                str.setText(number);
                break;
            case R.id.n4:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "4";
                number2 += "4";
                str.setText(number);
                break;
            case R.id.n3:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "3";
                number2 += "3";
                str.setText(number);
                break;
            case R.id.n2:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "2";
                number2 += "2";
                str.setText(number);
                break;
            case R.id.n1:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "1";
                number2 += "1";
                str.setText(number);
                break;
            case R.id.n0:
                multiplicationAfterPercent();
                bottomEquals(haveAction);
                number += "0";
                number2 += "0";
                str.setText(number);
                break;
            case R.id.delete:
                if (number == null || number.length() == 0)  //check if a variable is empty doing nothing
                    break;
                else
                    number = number.substring(0, number.length() - 1); //else delete last char of variable
                str.setText(number);
                break;
            case R.id.addition:
                if ((action == "") && (number != "")) {
                    haveAction = true;
                    action = "addition"; //variable action for func "equal" that shows what to do
                    percentFunctionCheck();   //aboid of error related to character of percent
                    number2 = "";
                    number += "+";
                    str.setText(number);
                }
                break;

            case R.id.substraction:
                if ((action == "") && (number != "")) {
                    haveAction = true;
                    action = "substraction";
                    percentFunctionCheck();
                    number2 = "";
                    number += "-";
                    str.setText(number);
                }
                break;
            case R.id.multiplication:
                if ((action == "") && (number != "")) {
                    haveAction = true;
                    action = "multiplication";
                    percentFunctionCheck();
                    number2 = "";
                    number += "*";
                    str.setText(number);
                }
                break;
            case R.id.division:
                if ((action == "") && (number != "")) {
                    haveAction = true;
                    action = "division";
                    percentFunctionCheck();
                    number2 = "";
                    number += "/";
                    str.setText(number);
                }
                break;


            case R.id.percent:
                if (number != "") {
                    percFunc = true;
                    if (action == "") {
                        percNum = "num1";
                        number1 = number;
                    } else
                        percNum = "num2";
                    number += "%";
                    str.setText(number);
                }
                break;

            case R.id.dot:
                if (number != "") {
                    number += ".";
                    number2 += ".";
                    str.setText(number);
                }
                break;

            case R.id.equals:
                if ((number1!="") && (number2!="")) {
                    double num1 = Double.parseDouble(number1);
                    double num2 = Double.parseDouble(number2);

                    if (percNum == "num1")
                        num1 = num1 * 0.01;
                    else if (percNum == "num2")
                        num2 = num2 * 0.01;


                    double res;
                    switch (action) {
                        case "addition":
                            res = num1 + num2;
                            str.setText(format.format(res));
                            number = format.format(res);
                            nullAfterResults();
                            break;
                        case "substraction":
                            res = num1 - num2;
                            str.setText(format.format(res));
                            number = format.format(res);
                            nullAfterResults();
                            break;
                        case "multiplication":
                            res = num1 * num2;
                            str.setText(format.format(res));
                            number = format.format(res);
                            nullAfterResults();
                            break;
                        case "division":
                            res = num1 / num2;
                            if ((num1 % num2) == 0) {
                                str.setText(format.format(res));
                                number = format.format(res);
                                nullAfterResults();
                            }
                            else {
                                str.setText(Double.toString(res));
                                number = format.format(res);
                                nullAfterResults();
                            }
                            break;
                    }
                    break;
                }
                break;
        }
    }


    public void multiplicationAfterPercent() {
        if ((percNum == "num1") && (action == "")) {
            action = "multiplication";
            haveAction = true;
            number2 = "";
            number += "*";
        }
    }

    public void percentFunctionCheck() {
        if (percFunc == false)
            number1 = number;
    }

    public void nullAfterResults() {
        number1 = "";
        number2 = "";
        numberRes = "";
        action = "";
        percFunc = false;
        percNum = "";
        haveAction = false;
    }

    public void bottomEquals(boolean haveAction) {

        if (haveAction) {
            p += "p";

            result.setText(p);
//            DecimalFormat format = new DecimalFormat("0.#");
//
//            double num1 = Double.parseDouble(number1);
//            double num2 = Double.parseDouble(number2);
//
//            if (percNum == "num1")
//                num1 = num1 * 0.01;
//            else if (percNum == "num2")
//                num2 = num2 * 0.01;
//
//
//            double res;
//            switch (action) {
//                case "addition":
//                    res = num1 + num2;
//                    result.setText(format.format(res));
//                    break;
//                case "substraction":
//                    res = num1 - num2;
//                    result.setText(format.format(res));
//                    break;
//                case "multiplication":
//                    res = num1 * num2;
//                    result.setText(format.format(res));
//                    break;
//                case "division":
//                    res = num1 / num2;
//                    if ((num1 % num2) == 0) {
//                        result.setText(format.format(res));
//                    }
//                    else {
//                        result.setText(Double.toString(res));
//                    }
//
//            }
        }



    }

}

