package com.example.loginpagedesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Home : AppCompatActivity() {
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var itemList :ArrayList<Details>
//    private lateinit var itemDetails: ItemDetails
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)





    val myCardView = findViewById<CardView>(R.id.card_view1)
    myCardView.setOnClickListener{
        val intent = Intent(this,ActivityDetails::class.java)
        startActivity(intent)
    }
    }
}