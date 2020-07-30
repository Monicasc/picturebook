package com.example.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class PictuereBook2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pictuere_book2)

        val button = findViewById<btnNext>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, PictureBook3::class.java)
            startActivity(intent)
        }


}
}