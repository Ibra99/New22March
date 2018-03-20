package com.example.ibrahimalhassan.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ALtdreebALmedany extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_altdreeb_almedany);
        btn=(Button) findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ALtdreebALmedany.this, DleeelALtdreepALmedany.class);
                startActivity(i);



            }
        });


        btn=(Button) findViewById(R.id.button5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ALtdreebALmedany.this,taqyeemjahahtadribyah.class);
                startActivity(i);
            }
        });


        btn=(Button) findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ALtdreebALmedany.this,kotatadreeb.class);
                startActivity(i);
            }
        });


        btn=(Button) findViewById(R.id.button7);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ALtdreebALmedany.this,hodhor.class);
                startActivity(i);
            }
        });



        btn=(Button) findViewById(R.id.button8);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(ALtdreebALmedany.this,mubashra.class);
                startActivity(i);
            }
        });



    }

}
