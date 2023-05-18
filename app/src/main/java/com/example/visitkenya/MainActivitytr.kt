package com.example.visitkenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.ktx.Firebase

class MainActivitytr : AppCompatActivity() {

    lateinit var butt5:Button
    lateinit var butt1:Button
    lateinit var butt2:Button
    lateinit var butt3:Button
    lateinit var butt4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activitytr)

        butt5=findViewById(R.id.button5)
        butt1=findViewById(R.id.button1)
        butt2=findViewById(R.id.button2)
        butt3=findViewById(R.id.button3)
        butt4=findViewById(R.id.button4)


        butt1.setOnClickListener {
            val tembea = Intent(this@MainActivitytr,mara::class.java)
            startActivity(tembea)
        }
        butt2.setOnClickListener {
            val ogopa = Intent(this@MainActivitytr,Mombasa::class.java)
            startActivity(ogopa)
        }
        butt3.setOnClickListener {
            val shika = Intent(this@MainActivitytr,FortJesus::class.java)
            startActivity(shika)
        }
        butt4.setOnClickListener {
            val waka = Intent(this@MainActivitytr,Giraffecenter::class.java)
            startActivity(waka)
        }
        butt5.setOnClickListener {
            val mimi = Intent(this@MainActivitytr,Nairobi::class.java)
            startActivity(mimi)
        }

    }
}