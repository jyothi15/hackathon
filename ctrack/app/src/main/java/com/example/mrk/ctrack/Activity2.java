package com.example.mrk.ctrack;

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


public class Activity2 extends AppCompatActivity {

    private Button b12;
    private TextView b3;
    private TextView b13;
    private TextView b4;
    private TextView b5;
    private TextView b6;
    private EditText b7;
    private EditText b8;
    private EditText b9;
    private EditText b10;
    private EditText b11;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        b12 = (Button) findViewById(R.id.button1);
        b13 = (TextView) findViewById(R.id.name);
        b3 = (TextView) findViewById(R.id.email3);
        b4 = (TextView) findViewById(R.id.pass);
        b5 = (TextView) findViewById(R.id.addr);
        b6 = (TextView) findViewById(R.id.phone);
        b7 = (EditText) findViewById(R.id.name2);
        b8 = (EditText) findViewById(R.id.email4);
        b9 = (EditText) findViewById(R.id.addr1);
        b10 = (EditText) findViewById(R.id.pass2);
        b11 = (EditText) findViewById(R.id.phone1);


        b12.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity5();
            }
        });


    }

    public void OpenActivity5()
    {
        Intent intent = new  Intent(this,MainActivity.class);
        startActivity(intent);
    }
}