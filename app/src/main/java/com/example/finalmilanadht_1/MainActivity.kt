package com.example.finalmilanadht_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView8 = findViewById<ImageView>(R.id.imageView8)

        imageView8.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }

        val imageView9 = findViewById<ImageView>(R.id.imageView9)

        imageView8.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
    }
}