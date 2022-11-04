package com.example.my_appl1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    double num1=0, num2=0, res=0;
    String sign = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = findViewById(R.id.textViewResult);
    }


    public void buttonClickFunction(View view) {
        if (view instanceof Button){
            Button button = (Button) view;
            String str = button.getText().toString();
            result.append(str);
        }
    }

    public void buttonClickEqual(View view) {
        if (view instanceof Button) {
            String str2 = result.getText().toString();
            num2 = Double.parseDouble(str2);
            switch (sign) {
                case "+":
                    res = num1 + num2;
                    break;
                case "-":
                    res = num1 - num2;
                    break;
                case "x":
                    res = (num1 * num2);
                    break;
                case "/":
                    res = (num1 / num2);
                    break;
                default:
                    break;
            }
            String sum = String.valueOf(res);
            result.setText(sum);
        }
    }

    public void buttonClickPlus(View view) {
        if (view instanceof Button){
            String str1 = result.getText().toString();
            num1 = Double.parseDouble(str1);
            sign = "+";
            result.setText("");
        }
    }

    public void buttonClickMinus(View view) {
        if (view instanceof Button) {
            String str1 = result.getText().toString();
            num1 = Double.parseDouble(str1);
            sign = "-";
            result.setText("");
        }
    }
    public void buttonClickDiv(View view) {
            if (view instanceof Button) {
                String str1 = result.getText().toString();
                num1 = Double.parseDouble(str1);
                sign = "/";
                result.setText("");
            }
        }
    public void buttonClickTimes(View view) {
        if (view instanceof Button) {
            String str1 = result.getText().toString();
            num1 = Double.parseDouble(str1);
            sign = "x";
            result.setText("");
        }
    }
    public void buttonClickClear(View view) {
        result.setText(null);
    }

    public void buttonClickNegative(View view) {
        if (view instanceof Button) {
            result.append("-");
        }
    }
    public void buttonClickDot(View view) {
        if (view instanceof Button){
            result.append(".");
        }
    }


}