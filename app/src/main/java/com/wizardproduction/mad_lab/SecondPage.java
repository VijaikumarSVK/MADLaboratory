package com.wizardproduction.mad_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.*;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    int ch = 1;
    float val = 15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);

        final TextView txt = (TextView)findViewById(R.id.data);
        Button increase = (Button)findViewById(R.id.increbtn);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setTextSize(val);
                val = val+3;
                if(val >=24)
                    val =15;
            }
        });
        Button decrease = (Button)findViewById(R.id.decrebtn);
        decrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.setTextSize(val-3);
                val = val-1;
                if(val<=9)
                    val=15;
            }
        });


        Button font = (Button) findViewById(R.id.fontcolor);
        font.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ch){
                    case 1:
                        txt.setTextColor(Color.BLUE);
                        break;
                    case 2:
                        txt.setTextColor(Color.RED);
                        break;
                    case 3:
                        txt.setTextColor(Color.YELLOW);
                        break;
                    case 4:
                        txt.setTextColor(Color.MAGENTA);
                        break;
                    case 5:
                        txt.setTextColor(Color.GREEN);
                        break;
                    case 6:
                        txt.setTextColor(Color.CYAN);
                        break;
                    case 7:
                        txt.setTextColor(Color.BLACK);
                        break;
                }
                ch++;
                if(ch == 8)
                    ch=1;
            }
        });
    }
}
