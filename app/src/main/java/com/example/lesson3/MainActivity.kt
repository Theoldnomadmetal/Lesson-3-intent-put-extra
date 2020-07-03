package com.example.lesson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val trueLogin = "Deadharmonic"
    val truePass = "12345"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginMain = findViewById<EditText>(R.id.LogMainET)
        val passMain = findViewById<EditText>(R.id.PassMainET)
        val butmainlog = findViewById<Button>(R.id.ButMainLog)
        val butmainreg = findViewById<Button>(R.id.ButMainReg)


        butmainreg.setOnClickListener {
            val intent2 =Intent(applicationContext, SeconActivity :: class.java)
            startActivity(intent2)
        }
        butmainlog.setOnClickListener {
            val logintext = LogMainET.text.toString()
            val passtext = PassMainET.text.toString()

            if (logintext == trueLogin && passtext == truePass){
                val intent = Intent(applicationContext, ThirdActivity ::class.java)
                startActivity(intent)}
            else {
                Toast.makeText(applicationContext, "Логин не найден,зарегистрируйтесь!", Toast.LENGTH_LONG).show()

            }
            


        }
    }
}