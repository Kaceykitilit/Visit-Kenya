package com.example.visitkenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class alpha : AppCompatActivity() {
    lateinit var journey:TextView
    lateinit var start:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alpha)
        journey=findViewById(R.id.journ)
        start=findViewById(R.id.star)

        start.setOnClickListener {
            val tembea = Intent(this,MainActivitytr::class.java)
            startActivity(tembea)
        }
    }
}