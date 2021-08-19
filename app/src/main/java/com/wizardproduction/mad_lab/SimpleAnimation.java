package com.wizardproduction.mad_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SimpleAnimation extends AppCompatActivity {

    Button  blink,bounce,fadein,fadeout,ltor,rtol,rotate,sample,zoomin,zoomout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_animation);

        blink = (Button)findViewById(R.id.blink);
        bounce = (Button)findViewById(R.id.bounce);
        fadein = (Button)findViewById(R.id.fadein);
        fadeout = (Button)findViewById(R.id.fadeout);
        ltor = (Button)findViewById(R.id.ltor);
        rtol = (Button)findViewById(R.id.rtol);
        rotate = (Button)findViewById(R.id.rotate);
        sample = (Button)findViewById(R.id.sample);
        zoomin = (Button)findViewById(R.id.zoomin);
        zoomout = (Button)findViewById(R.id.zoomout);

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.blink_anim);

                blink.startAnimation(animation1);
            }
        });
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                 Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.bounce);

                 bounce.startAnimation(animation1);
    }
});
        fadein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.fadein);

                fadein.startAnimation(animation1);
            }
        });
        fadeout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.fadeout);

                fadeout.startAnimation(animation1);
            }
        });
        ltor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.lefttoright);

                ltor.startAnimation(animation1);
            }
        });
        rtol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.righttoleft);

                rtol.startAnimation(animation1);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.rotate);

                rotate.startAnimation(animation1);
            }
        });

        sample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.sample_anim);

                sample.startAnimation(animation1);
            }
        });
        zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.zoomin);

                zoomin.startAnimation(animation1);
            }
        });
        zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation1 = AnimationUtils.loadAnimation(SimpleAnimation.this,R.anim.zoomout);

                zoomout.startAnimation(animation1);
            }
        });
    }
}
