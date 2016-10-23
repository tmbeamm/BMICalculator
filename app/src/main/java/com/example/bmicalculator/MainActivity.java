package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bmicalculator.model.Human;

import java.util.Scanner;


public class MainActivity extends AppCompatActivity {
    Human h =new Human();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et1 = (EditText)findViewById(R.id.editText);
        final EditText et2 = (EditText)findViewById(R.id.editText2);


            Button btn1 = (Button)findViewById(R.id.button);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(et1.length() == 0 || et2.length() == 0){
                        AlertDialog.Builder dbox = new  AlertDialog.Builder(MainActivity.this);
                        dbox.setTitle("ผิดพลาด");
                        dbox.setMessage("ป้อนข้อมูลไม่ครบ");
                        dbox.setPositiveButton("OK",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        dbox.show();
                    }
                    else {
                        Intent intent = new Intent(MainActivity.this, Page2.class);
                        intent.putExtra("BMI", h.calBMI(String.valueOf(et1.getText()), String.valueOf(et2.getText())));
                        intent.putExtra("BODY", h.body(String.valueOf(et1.getText()), String.valueOf(et2.getText())));
                        startActivity(intent);
                    }
                }
            });


    }
}
