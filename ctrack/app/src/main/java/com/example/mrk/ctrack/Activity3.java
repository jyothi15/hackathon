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



public class Activity3 extends AppCompatActivity {
     private Button b1;
     private EditText b3;
     private EditText b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        b1 = (Button) findViewById(R.id.submit);
        b3 = (EditText) findViewById(R.id.email3);
        b4 = (EditText) findViewById(R.id.pass1);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity2();
            }
        });

    }

    public void OpenActivity2()
    {
        Intent intent = new  Intent(this,Activity_4.class);
        startActivity(intent);
    }
}
