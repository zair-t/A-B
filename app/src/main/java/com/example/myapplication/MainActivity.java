package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView text;
    Button sum,minus;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.sum = findViewById(R.id.sum);
        this.minus = findViewById(R.id.minus);
        this.text = findViewById(R.id.text);
        this.ed1 = findViewById(R.id.num1);
        this.ed2 = findViewById(R.id.num2);
        sum.setOnClickListener(this);
        minus.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String t1 = ed1.getText().toString();
        String t2 = ed2.getText().toString();
        int a = Integer.parseInt(t1);
        int b = Integer.parseInt(t2);
        if(v.getId() == R.id.sum) {
            a += b;
        } else {
            a -= b;
        }
        text.setText(String.valueOf(a));
    }
}