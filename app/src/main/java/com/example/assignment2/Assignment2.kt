package com.example.assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Assignment2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment2)
        EditText = findViewById(R.id.age)
        EditText = findViewById(R.id.weight)
        EditText = findViewById(R.id.height)
        Button = findViewById(R.id.btnSubmit)



    }
}