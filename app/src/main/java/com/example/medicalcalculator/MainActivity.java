package com.example.medicalcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    double conversionRate1 = 0.884887;
    double conversionRate2 = 19.2733;
    double conversionRate3 = 1.32520;
    double weightEntered;
    double convertedWeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        final EditText weight = (EditText) findViewById(R.id.txtWeight);
        final RadioButton ustoeuros = (RadioButton) findViewById(R.id.radustoeuros);
        final RadioButton ustopesos = (RadioButton) findViewById(R.id.radustopesos);
        final RadioButton ustoca = (RadioButton) findViewById(R.id.radustoca);
        final TextView result = (TextView) findViewById(R.id.txtResult);
        final Button convert = (Button) findViewById(R.id.btnConvert);

        convert.setOnClickListener(new View.OnClickListener()  {

            public void onClick(View v){


                weightEntered=Double.parseDouble(weight.getText().toString());
                DecimalFormat tenth = new DecimalFormat("#.#");
                if(ustoeuros.isChecked()){
                    if (0 < weightEntered && weightEntered < 100000){
                        convertedWeight = weightEntered * conversionRate1;
                        result.setText("€"+tenth.format(convertedWeight) + " Euros");


                    }else{
                        Toast.makeText(MainActivity.this,"US Dollars must be <= 100,000 and > 0", Toast.LENGTH_LONG).show();


                    }

                }

                if (ustopesos.isChecked()) {

                    if (0 < weightEntered && weightEntered < 100000) {
                        convertedWeight = weightEntered * conversionRate2;
                        result.setText("$"+tenth.format(convertedWeight) + " Pesos");

                    } else {

                        Toast.makeText(MainActivity.this, "US Dollars must be <= 100,000 and > 0", Toast.LENGTH_LONG).show();
                    }
                }

                if (ustoca.isChecked()) {

                    if (0 < weightEntered && weightEntered < 100000) {
                        convertedWeight = weightEntered * conversionRate3;
                        result.setText("$"+tenth.format(convertedWeight) + " Canadian Dollar");
                    } else {

                        Toast.makeText(MainActivity.this, "US Dollars must be <= 100,000 and > 0", Toast.LENGTH_LONG).show();
                    }
                }









            }


        });

    }
}
