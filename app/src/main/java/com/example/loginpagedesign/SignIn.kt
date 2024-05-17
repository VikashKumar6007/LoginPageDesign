package com.example.loginpagedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SignIn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        var signIn = findViewById<TextView>(R.id.signIn)
        var user_password = findViewById<TextView>(R.id.user_password)
        var user_email = findViewById<TextView>(R.id.user_email)
        var et_name = findViewById<TextView>(R.id.et_name)
        var btn_sign_up = findViewById<Button>(R.id.btn_sign_up)
        signIn.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            if(user_password.text.isEmpty()){
                Toast.makeText(this,"Please Enter your mobile number",Toast.LENGTH_LONG).show()
            }

            if (user_email.text.isEmpty()){
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_LONG).show()

            }
            if (et_name.text.isEmpty()){
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_LONG).show()

            }
            if (user_password.text.isEmpty()){
                Toast.makeText(this, "Please Enter your Password", Toast.LENGTH_LONG).show()
            }


        }

    }
}