package com.wizardproduction.mad_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.math.*;
public class Calculator extends AppCompatActivity {

    private TextView val1,val2,val3;

    private Button btnac,btnprd,btneql,btnback,btnadd,btnsub,btndiv,btnmul,
            btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;

    private double first;
    private double second;
    private double result;
    private String calculation;
    private String ans;
    private String symbol = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);





//assigning the keyword to the buttons
        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        val3 = findViewById(R.id.val3);
        val1.setText(null);
        val2.setText(null);
        val3.setText(null);

        btnac = findViewById(R.id.btnac);
        btnprd = findViewById(R.id.btnprd);
        btneql = findViewById(R.id.btneql);
        btnback = findViewById(R.id.btnback);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btndiv = findViewById(R.id.btndiv);
        btnmul = findViewById(R.id.btnmul);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);


        // inserting the values in the text view
        // all clear button operation.
        btnac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1.setText(null);
                val2.setText(null);
                val3.setText(null);
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"0";
                val2.setText(text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"1";
                val2.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"2";
                val2.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"3";
                val2.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"4";
                val2.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"5";
                val2.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"6";
                val2.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"7";
                val2.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"8";
                val2.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+"9";
                val2.setText(text);
            }
        });
        btnprd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = val2.getText()+".";
                val2.setText(text);
            }
        });

        //Symbol onclick listener starts form here


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn0.getText().toString();
                val2.setText(text);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn1.getText().toString();
                val2.setText(text);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn2.getText().toString();
                val2.setText(text);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn3.getText().toString();
                val2.setText(text);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn4.getText().toString();
                val2.setText(text);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn5.getText().toString();
                val2.setText(text);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn6.getText().toString();
                val2.setText(text);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn7.getText().toString();
                val2.setText(text);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn8.getText().toString();
                val2.setText(text);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btn9.getText().toString();
                val2.setText(text);
            }
        });
        btnprd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = null;

                text = val2.getText().toString()+btnprd.getText().toString();
                val2.setText(text);
            }
        });
        // operation of backspace button
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  Bckspc = null;
                if(val2.getText().length()>0){

                    StringBuilder stgbuld = new StringBuilder(val2.getText());
                    stgbuld.deleteCharAt(val2.getText().length()-1);
                    Bckspc =stgbuld.toString();
                    val2.setText(Bckspc);
                }

            }
        });

        //calculation part coding starts

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1;
                first = Double.parseDouble((String)val2.getText());
                num1 = String.format("%.2f",first);
                val1.setText(num1);
                val2.setText("");
                calculation = "+";
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1;
                first = Double.parseDouble((String)val2.getText());
                num1 = String.format("%.2f",first);
                val1.setText(num1);
                val2.setText("");
                calculation = "-";
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1;
                first = Double.parseDouble((String)val2.getText());
                num1 = String.format("%.2f",first);
                val1.setText(num1);
                val2.setText("");
                calculation = "/";
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num1;
                first = Double.parseDouble((String)val2.getText());
                num1 = String.format("%.2f",first);
                val1.setText(num1);
                val2.setText("");
                calculation = "*";
            }
        });

        // Equal button operation starts from here

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                second = Double.parseDouble((String)val2.getText());
                if(calculation=="/"){
                    result = (first/second);
                    ans = String.format("%.2f",result);
                    val2.setText(ans);
                    val1.setText(null);
                }
                if(calculation=="*"){
                    result = first*second;
                    ans = String.format("%.2f",result);
                    val2.setText(ans);
                    val1.setText(null);
                }
                if(calculation=="-"){
                    result = (first-second);
                    ans = String.format("%.2f",result);
                    val2.setText(ans);
                    val1.setText(null);
                }
                if(calculation=="+"){
                    result = (first+second);
                    ans = String.format("%.2f",result);
                    val2.setText(ans);
                    val1.setText(null);
                }
            }
        });
    }
}

