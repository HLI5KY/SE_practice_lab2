package com.example.exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CounterActivity extends AppCompatActivity {
    private int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        Button add = (Button) findViewById(R.id.button_ADD);
        Button reduce = (Button) findViewById(R.id.button_REDUCE);
        Button clear = (Button) findViewById(R.id.button_CLEAR);
        TextView cnt_text = (TextView) findViewById(R.id.cnt);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt_text.setText(Integer.toString(++cnt));
            }
        });
        reduce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt_text.setText(Integer.toString(--cnt));
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cnt_text.setText("0");
                cnt = 0;
            }
        });
    }
}
