package com.example.additionapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1=findViewById<EditText>(R.id.num1)
        val num2=findViewById<EditText>(R.id.num2)
        val result=findViewById<TextView>(R.id.result)
        val button=findViewById<Button>(R.id.calculate)

        button.setOnClickListener{
            val val1=num1.text.toString().toInt()
            val val2=num2.text.toString().toInt()
            val res=val1+val2;
            result.setText(res.toString())
        }

    }
}