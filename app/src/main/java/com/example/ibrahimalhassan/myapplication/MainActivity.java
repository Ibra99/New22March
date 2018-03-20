package com.example.ibrahimalhassan.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   // private static int SPLASH_TIME_OUT=-4000;

    Button btn;
    TextureView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
//new Handler().postDelayed(new Runnable() {
  //  @Override
    //public void run() {
 //       Intent homeIntent=new Intent(MainActivity.this,HomeActivity.class);
   //     startActivity(homeIntent);
     //   finish();
  // }
//}//,SPLASH_TIME_OUT);
        btn=(Button) findViewById(R.id.start);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,registration.class);
                startActivity(i);
            }
        });

        btn=(Button) findViewById(R.id.computer);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,computer.class);
                startActivity(i);
            }
        });

        btn=(Button) findViewById(R.id.affair);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,affairs.class);
                startActivity(i);
            }
        });

                btn=(Button) findViewById(R.id.dean);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,deanship.class);
                startActivity(i);
            }
        });

        btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "share";
                String shareSub = "your subject here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                myIntent.putExtra(Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(myIntent, "share using"));

            }
        });
        }



    }

