package com.example.medicalcalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splashscreen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen1);

        Thread mythread = new Thread(){
            @Override

            public void run(){

                try {

                    sleep(3000);
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } catch (InterruptedException e) {

                    e.printStackTrace();



                }
            }








        };

            mythread.start();




    }
}
