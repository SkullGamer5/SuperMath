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
            val Intent = Intent(this,PyramidAboutActivity::class.java)
            startActivity(Intent)

        }

        val pyramidFormsButton = findViewById<Button>(R.id.pyramidformsButton)
        pyramidFormsButton.setOnClickListener{
            val Intent = Intent(this,PyramidFormsActivity::class.java)
            startActivity(Intent)
        }

        val pyramidcalButton = findViewById<Button>(R.id.pyramidcalButton)
        pyramidcalButton.setOnClickListener {
            val Intent = Intent(this,PyramidCalActivity::class.java)
            startActivity(Intent)
        }
    }
}