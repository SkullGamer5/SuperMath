package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SquareActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square)

        val squareAboutButton = findViewById<Button>(R.id.squareAboutButton)
        squareAboutButton.setOnClickListener{
            val intent = Intent(this,SquareAboutActivity::class.java)
            startActivity(intent)

        }

        val squareFormsButton = findViewById<Button>(R.id.squareformsButton)
        squareFormsButton.setOnClickListener{
            val intent = Intent(this,SquareFormsActivity::class.java)
            startActivity(intent)
        }

        val squareCalButton = findViewById<Button>(R.id.squarecalButton)
        squareCalButton.setOnClickListener{
            val intent = Intent(this,SquareCalActivity::class.java)
            startActivity(intent)
    }
}}