package com.example.lesson3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        val textprofileview = findViewById<TextView>(R.id.ThirdLogTV)

        val etProfileinfo = intent.getStringExtra("regInfo")

        textprofileview.text = etProfileinfo



    }
}