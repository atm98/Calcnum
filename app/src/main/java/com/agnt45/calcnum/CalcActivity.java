package com.agnt45.calcnum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {
    private Button equal,add,sub,mul,div,dec,clr;
    private EditText number1,number2,Result;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        equal=(Button) findViewById(R.id.equal);
        add=(Button) findViewById(R.id.add);
        sub=(Button) findViewById(R.id.subtract);
        mul=(Button) findViewById(R.id.multiply);
        div=(Button) findViewById(R.id.divide);
        dec=(Button) findViewById(R.id.decimal);
        clr=(Button) findViewById(R.id.clear);
        number1 = (EditText) findViewById(R.id.num1);
        number2 = (EditText) findViewById(R.id.num2);
        Result = (EditText) findViewById(R.id.res);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Result.setText(Integer.toString(result));
                result = 0;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(number1.getText().toString()) + Integer.parseInt(number2.getText().toString());
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(number1.getText().toString()) - Integer.parseInt(number2.getText().toString());
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(number1.getText().toString()) * Integer.parseInt(number2.getText().toString());
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = Integer.parseInt(number1.getText().toString()) / Integer.parseInt(number2.getText().toString());
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number1.setText("");
                number2.setText("");
                Result.setText("");
            }
        });
    }
}
