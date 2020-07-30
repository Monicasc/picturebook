package com.example.picturebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<btnNext>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(this, PictuereBook2::class.java)
            startActivity(intent)
        }


}
}