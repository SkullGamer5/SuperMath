package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class squareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        val squareAboutButton = findViewById<Button>(R.id.squareAboutButton)
        squareAboutButton.setOnClickListener{
            val Intent = Intent(this,squareAboutActivity::class.java)
            startActivity(Intent)

        }

        val squareFormsButton = findViewById<Button>(R.id.squareformsButton)
        squareFormsButton.setOnClickListener{
            val Intent = Intent(this,squareFormsActivity::class.java)
            startActivity(Intent)
        }

        val squarecalButton = findViewById<Button>(R.id.squarecalButton)
        squarecalButton.setOnClickListener{
            val Intent = Intent(this,squareCalActivity::class.java)
            startActivity(Intent)
    }
}}