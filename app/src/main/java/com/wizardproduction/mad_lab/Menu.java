package com.wizardproduction.mad_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Menu extends AppCompatActivity {
    public Button button1, button2, button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        button1 = (Button) findViewById(R.id.assign1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,GUIFontColor.class);
                startActivity(intent);
            }
        });

        button2 = (Button) findViewById(R.id.assign2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,SimpleAnimation.class);
                startActivity(intent);
            }
        });

        button3 = (Button) findViewById(R.id.assign3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Calculator.class);
                startActivity(intent);
            }
        });
        button4 = (Button) findViewById(R.id.assign4);

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this,Calculator.class);
                startActivity(intent);
            }
        });


    }
}
