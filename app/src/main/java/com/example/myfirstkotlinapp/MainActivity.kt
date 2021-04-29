package com.example.myfirstkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ages = findViewById<TextView>(R.id.age);
        val birthday = findViewById<EditText>(R.id.b_day);
        val button = findViewById<Button>(R.id.submit);

        button.setOnClickListener {
            val current_year = Calendar.getInstance().get(Calendar.YEAR);
            ages.text = "Age :"+(current_year - birthday.text.toString().toInt());

        }




    }

}