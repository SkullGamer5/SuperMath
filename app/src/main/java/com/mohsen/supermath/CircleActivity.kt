package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CircleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        val circleAboutButton = findViewById<Button>(R.id.circleAboutButton)
        circleAboutButton.setOnClickListener {
            val intent = Intent(this, CircleAboutActivity::class.java)
            startActivity(intent)
        }

        val circleFormsButton = findViewById<Button>(R.id.circleformsButton)
        circleFormsButton.setOnClickListener {
            val intent = Intent(this, CircleFormsActivity::class.java)
            startActivity(intent)
        }

        val circlecalButton = findViewById<Button>(R.id.circlecalButton)
        circlecalButton.setOnClickListener {
            val intent = Intent(this, CircleCalActivity::class.java)
            startActivity(intent)
        }
    }
}