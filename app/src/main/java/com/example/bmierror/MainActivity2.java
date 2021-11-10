package com.example.bmierror;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        value = (TextView)findViewById(R.id.value);
        Intent intent =this.getIntent();
        String bmi = intent.getStringExtra("BMI");
        if(18.5<=Float.parseFloat(bmi) && Float.parseFloat(bmi)<=24){
            value.setText("你的BMI指數為"+bmi+"\n檢測結果為正常");
        }
        else{
            value.setText("你的BMI指數為"+bmi+"\n檢測結果為異常");
        }
    }

    public void back(View view) {
        MainActivity2.this.finish();
    }
}