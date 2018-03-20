package com.example.ibrahimalhassan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class computer extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer);
        btn=(Button) findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(computer.this,alLaahALdahleh.class);
                startActivity(i);
            }
        });


        btn=(Button) findViewById(R.id.button0002);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(computer.this,ALtdreebALmedany.class);
                startActivity(i);
            }
        });

        btn=(Button) findViewById(R.id.button9);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(computer.this,ALkooothALdrasyh.class);
                startActivity(i);
            }
        });




    }
}
