package com.example.bmicalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        String p1 = intent.getStringExtra("BMI");
        String p2 = intent.getStringExtra("BODY");
        TextView tv1 = (TextView)findViewById(R.id.textView5);
        tv1.setText(p1);
        TextView tv2 = (TextView)findViewById(R.id.textView8);
        tv2.setText(p2);
    }
}
