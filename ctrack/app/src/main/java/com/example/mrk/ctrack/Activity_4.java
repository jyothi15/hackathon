package com.example.mrk.ctrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_4 extends AppCompatActivity {

     private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        b1 = (Button) findViewById(R.id.history);
        b2 = (Button) findViewById(R.id.locate);
        b3 = (Button) findViewById(R.id.medicine);
        b4 = (Button) findViewById(R.id.panic);
        b5 = (Button) findViewById(R.id.contact);
        b6 = (Button) findViewById(R.id.complaint);

        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity2();
            }
        });

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity1();
            }
        });

        b3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity3();
            }
        });

        b4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity8();
            }
        });
        b5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity9();
            }
        });
        b6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity10();
            }
        });
    }



    public void OpenActivity1()
    {
        Intent intent = new  Intent(this,activity6.class);
        startActivity(intent);
    }
    public void OpenActivity10()
    {
        Intent intent = new  Intent(this,Activity10.class);
        startActivity(intent);
    }
    public void OpenActivity9()
    {
        Intent intent = new  Intent(this,Activity9.class);
        startActivity(intent);
    }

    public void OpenActivity8()
    {
        Intent intent = new  Intent(this,activity8.class);
        startActivity(intent);
    }

    public void OpenActivity2()
    {
        Intent intent = new  Intent(this,activity5.class);
        startActivity(intent);
    }

    public void OpenActivity3()
    {
        Intent intent = new  Intent(this,activity7.class);
        startActivity(intent);
    }
}
