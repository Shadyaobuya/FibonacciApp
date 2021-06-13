package com.example.fibonacci

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnCheck=findViewById<Button>(R.id.btnCheck)
        var numb=findViewById<EditText>(R.id.etNumber)
        btnCheck.setOnClickListener {
            var choice=numb.text.toString().toInt()

            var intent=Intent(baseContext,Page2::class.java)
            intent.putExtra("choice",choice)
            startActivity(intent)
        }
    }
}