package com.example.loginpagedesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class ActivityDetails : AppCompatActivity() {
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
      imageView = findViewById<ImageView>(R.id.img_ID);

        Glide.with(this)
            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTCV42xXanQHknsX_ioypWPhmrHp2aL1gVZo8ghurmug&s")
        .into(imageView);
    }
}


//        Picasso.get()
//            .load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRTCV42xXanQHknsX_ioypWPhmrHp2aL1gVZo8ghurmug&s")
//            .into(imageView);