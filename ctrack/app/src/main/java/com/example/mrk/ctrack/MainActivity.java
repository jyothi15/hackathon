package com.example.mrk.ctrack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button b1;
    private Button b2;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.REGISTER);
        b2 = (Button) findViewById(R.id.LOGIN);

        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenActivity2();
                }
        });

        b2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        }

        public void OpenActivity2()
        {
            Intent intent = new  Intent(this,Activity2.class);
            startActivity(intent);
        }
        public void openActivity3(){
        Intent intent = new Intent(this,Activity3.class);
        startActivity(intent);

    }

    }