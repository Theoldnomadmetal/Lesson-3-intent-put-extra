package com.example.lesson3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SeconActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val regText = findViewById<EditText>(R.id.LogSecET)
        val regPass = findViewById<EditText>(R.id.PassSecET)
        val regButton = findViewById<Button>(R.id.ButGo)

        regButton.setOnClickListener {
            val regInfo = regText.text.toString()
            val passInfo = regPass.text.toString()

            val intent3 = Intent(applicationContext, ThirdActivity::class.java)

            intent3.putExtra("regInfo", regInfo)
            startActivity(intent3)
        }

    }
}