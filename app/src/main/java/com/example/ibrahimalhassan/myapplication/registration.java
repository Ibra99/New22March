package com.example.ibrahimalhassan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registration extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        btn=(Button) findViewById(R.id.button01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(registration.this, amadatalqabol.class);
                startActivity(i);
            }
        });
        btn=(Button) findViewById(R.id.button0002);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(registration.this,alhdfooaladafh.class);
                startActivity(i);
            }
        });

        btn=(Button) findViewById(R.id.button03);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(registration.this,alfsalMnAlgamah.class);
                startActivity(i);
            }
        });

        btn=(Button) findViewById(R.id.button04);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(registration.this,Atgdyrat.class);
                startActivity(i);
            }
        });




        btn=(Button) findViewById(R.id.button05);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(registration.this,athwellMnKleeh.class);
                startActivity(i);
            }
        });


    }
}