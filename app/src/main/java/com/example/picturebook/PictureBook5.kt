package com.example.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PictureBook5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book5)

        val button = findViewById<btnprevious>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, PictureBook5::class.java)
            startActivity(intent)
        }
    }
}