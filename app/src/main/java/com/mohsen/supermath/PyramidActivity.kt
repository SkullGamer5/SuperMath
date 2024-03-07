package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PyramidActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyramid)

        val pyramidAboutButton = findViewById<Button>(R.id.pyramidAboutButton)
        pyramidAboutButton.setOnClickListener {
            val intent = Intent(this, PyramidAboutActivity::class.java)
            startActivity(intent)

        }

        val pyramidFormsButton = findViewById<Button>(R.id.pyramidformsButton)
        pyramidFormsButton.setOnClickListener {
            val intent = Intent(this, PyramidFormsActivity::class.java)
            startActivity(intent)
        }

        val pyramidcalButton = findViewById<Button>(R.id.pyramidcalButton)
        pyramidcalButton.setOnClickListener {
            val intent = Intent(this, PyramidCalActivity::class.java)
            startActivity(intent)
        }
    }
}