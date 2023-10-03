package com.example.exercise;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonJmp = (Button) findViewById(R.id.button_jmp);
        Button buttonCnt = (Button) findViewById(R.id.button_cnt);
        buttonJmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final AlertDialog.Builder normalDialog =
                        new AlertDialog.Builder(MainActivity.this);
                normalDialog.setTitle("jump to second page?");
                normalDialog.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent gayPage = new Intent("com.example.exercise.ACTION_START");
                        gayPage.addCategory("com.example.exercise.category.gayPage");
                        startActivity(gayPage);
                    }
                });
                normalDialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                normalDialog.show();
            }
        });
        buttonCnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent counterPage = new Intent("com.example.exercise.ACTION_START");
                counterPage.addCategory("com.example.exercise.category.couterPage");
                startActivity(counterPage);
            }
        });
    }
}