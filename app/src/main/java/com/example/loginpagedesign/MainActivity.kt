package com.example.loginpagedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn_ListView : Button = findViewById(R.id.btn_ListView)


    var btn_sign_in :Button= findViewById(R.id.btn_sign_in)
        var  et_email = findViewById<TextView>(R.id.et_email)
        var et_password = findViewById<TextView>(R.id.et_password)

        var sign_up = findViewById<TextView>(R.id.sign_up)


//        for list view
        btn_ListView.setOnClickListener {
            val intent = Intent(this, ListView::class.java)
            startActivity(intent)
        }

        sign_up.setOnClickListener {
            val intent = Intent(this,SignIn::class.java)
            startActivity(intent)
        }

        btn_sign_in.setOnClickListener {

            val dilogeBuilder = AlertDialog.Builder(this@MainActivity)
            dilogeBuilder.setMessage("Are you sure want to exit the app !")
            dilogeBuilder.setTitle("Title is here ")
            dilogeBuilder.setCancelable(false)
            dilogeBuilder.setPositiveButton("yes"){_,_ ->
                finish()
            }
            dilogeBuilder.setNegativeButton("No"){_,_ ->
                Toast.makeText(this@MainActivity , "Clicked No",Toast.LENGTH_LONG).show()
            }
            dilogeBuilder.setNeutralButton("Cancle"){_,_ ->
                Toast.makeText(this@MainActivity , "Clicked No",Toast.LENGTH_LONG).show()
            }
            val alertDialogBox = dilogeBuilder.create()
            alertDialogBox.show()


            if (et_email.text.isEmpty()){
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_LONG).show()

            }
            if (et_password.text.isEmpty()){
                Toast.makeText(this, "Please Enter your Password", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,Home::class.java)
                startActivity(intent)
//                 finish()
            }

        }

    }
}