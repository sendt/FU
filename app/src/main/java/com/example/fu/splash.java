package com.example.fu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splash extends AppCompatActivity {
    private TextView tv;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    tv=(TextView)findViewById(R.id.splash_txt);
    iv=(ImageView)findViewById(R.id.splash_img);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.mytransition);
        tv.startAnimation(myanim);
        //Typeface font=Typeface.createFromAsset(getAssets(), "font/odibeesans_regular.ttf");
        //tv.setTypeface(font);
        final Intent i =new Intent(this,MainActivity.class);
        Thread timerr = new Thread(){
            public  void run(){
                try{
                    sleep(2500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                        startActivity(i);
                        finish();
                }
            }
        };
        timerr.start();
    }
}
