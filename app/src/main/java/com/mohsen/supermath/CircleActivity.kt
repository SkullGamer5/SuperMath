package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CircleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        val circleAboutButton = findViewById<Button>(R.id.circleAboutButton)
        circleAboutButton.setOnClickListener{
            val Intent = Intent(this,CircleAboutActivity::class.java)
            startActivity(Intent)
        }

        val circleFormsButton = findViewById<Button>(R.id.circleformsButton)
        circleFormsButton.setOnClickListener{
            val Intent = Intent(this,CircleFormsActivity::class.java)
            startActivity(Intent)
        }

        val circlecalButton = findViewById<Button>(R.id.circlecalButton)
        circlecalButton.setOnClickListener{
            val Intent = Intent(this,CircleCalActivity::class.java)
            startActivity(Intent)
        }
    }
}