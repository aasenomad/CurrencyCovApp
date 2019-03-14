package com.example.medicalcalculator;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class Splashscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        EasySplashScreen config = new EasySplashScreen(Splashscreen.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(30000000)
                .withBackgroundColor(Color.parseColor("#07E72"))
                .withLogo(R.mipmap.ic_launcher)
                .withHeaderText("Welcome Guest")
                .withFooterText("Copyright 2017")
                .withBeforeLogoText("Jonathan Hrang")
                .withAfterLogoText("This is easy Splash Screen");


        //

        config.getHeaderTextView().setTextColor(android.graphics.Color.WHITE);
        config.getFooterTextView().setTextColor(android.graphics.Color.WHITE);
        config.getAfterLogoTextView().setTextColor(android.graphics.Color.WHITE);
        config.getBeforeLogoTextView().setTextColor(android.graphics.Color.WHITE);


        View view = config.create();

        setContentView(view);




    }


}
