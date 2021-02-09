package com.example.apptrail_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class CalcolatriceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcolatrice);
        ImageButton canon = (ImageButton) findViewById(R.id.canon);
        ImageButton nikon =  (ImageButton) findViewById(R.id.nikon);
        ImageButton sony =  (ImageButton) findViewById(R.id.sony);

        canon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });


        nikon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });


        sony.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }
    public void calcolatrice2(View view)

    {
        Intent intent = new Intent(this, CalcolatriceActivity2.class);
        startActivity(intent);
    }

}