package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class circleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        val circleAboutButton = findViewById<Button>(R.id.circleAboutButton)
        circleAboutButton.setOnClickListener{
            val Intent = Intent(this,circleAboutActivity::class.java)
            startActivity(Intent)
        }

        val circleFormsButton = findViewById<Button>(R.id.circleformsButton)
        circleFormsButton.setOnClickListener{
            val Intent = Intent(this,circleFormsActivity::class.java)
            startActivity(Intent)
        }

        val circlecalButton = findViewById<Button>(R.id.circlecalButton)
        circlecalButton.setOnClickListener{
            val Intent = Intent(this,circleCalActivity::class.java)
            startActivity(Intent)
        }
    }
}