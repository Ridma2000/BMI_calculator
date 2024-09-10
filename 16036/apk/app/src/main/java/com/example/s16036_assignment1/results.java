package com.example.s16036_assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class results extends AppCompatActivity {
    TextView textView;
    public static final String KEY = "UNIQUEKEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_results);

        textView = findViewById(R.id.resultValue);
        float bmi = getIntent().getFloatExtra("name",0);
        TextView textViewBMI = findViewById(R.id.resultValue);
        textViewBMI.setText("BMI ="+bmi+"kg/m2");

        Intent intent = getIntent();
        String data = intent.getStringExtra(KEY);
        textView.setText(data);
    }

}