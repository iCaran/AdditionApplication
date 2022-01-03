package com.example.additionapplication

import android.annotation.SuppressLint
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar()?.hide(); //hide the title bar

         */
        supportActionBar?.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM)
        supportActionBar?.setCustomView(R.layout.action_bar_layout)

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN); //show the activity in full screen
        setContentView(R.layout.activity_main)

        val num1=findViewById<EditText>(R.id.num1)
        val num2=findViewById<EditText>(R.id.num2)
        val result=findViewById<TextView>(R.id.result)
        val button=findViewById<Button>(R.id.calculate)

        button.setOnClickListener{
            val val1=num1.text.toString().toInt()
            val val2=num2.text.toString().toInt()
            val res=val1+val2;
            result.setText("Sum of "+val1+" and "+val2+" is "+res.toString())
        }

    }
}