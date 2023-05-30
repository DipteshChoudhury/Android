package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val selfie = findViewById<Button>(R.id.selfie)
        val gallery = findViewById<Button>(R.id.gallery)

        selfie.setOnClickListener {
            Toast.makeText(this,"Selfie clicked.",Toast.LENGTH_SHORT).show()
        }
        gallery.setOnClickListener {
            Toast.makeText(this,"Gallery clicked.",Toast.LENGTH_SHORT).show()
        }
    }
}