package com.example.bmierror;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText h,w;
    private Button bmi;
    private TextView num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        h = (EditText)findViewById(R.id.height);
        w = (EditText)findViewById(R.id.weight);
        num = (TextView)findViewById(R.id.num);
    }
    public void bmi(View view) {
        float total = (Float.parseFloat(w.getEditableText().toString()))/(Float.parseFloat(h.getEditableText().toString())*Float.parseFloat(h.getEditableText().toString()));
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MainActivity2.class);
        intent.putExtra("BMI",Float.toString(total));
        h.setText("");
        w.setText("");
        startActivity(intent);
    }
}