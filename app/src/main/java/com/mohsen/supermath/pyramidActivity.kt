package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pyramidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyramid)

        val pyramidAboutButton = findViewById<Button>(R.id.pyramidAboutButton)
        pyramidAboutButton.setOnClickListener{
            val Intent = Intent(this,pyramidAboutActivity::class.java)
            startActivity(Intent)

        }

        val pyramidFormsButton = findViewById<Button>(R.id.pyramidformsButton)
        pyramidFormsButton.setOnClickListener{
            val Intent = Intent(this,pyramidFormsActivity::class.java)
            startActivity(Intent)
        }

        val pyramidcalButton = findViewById<Button>(R.id.pyramidcalButton)
        pyramidcalButton.setOnClickListener {
            val Intent = Intent(this,pyramidCalActivity::class.java)
            startActivity(Intent)
        }
    }
}