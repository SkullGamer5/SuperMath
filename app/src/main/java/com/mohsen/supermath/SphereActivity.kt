package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)

        val sphereAboutButton = findViewById<Button>(R.id.sphereAboutButton)
        sphereAboutButton.setOnClickListener {
            val intent = Intent(this, SphereAboutActivity::class.java)
            startActivity(intent)
        }

        val sphereFormsButton = findViewById<Button>(R.id.sphereformsButton)
        sphereFormsButton.setOnClickListener {
            val intent = Intent(this, SphereFormsActivity::class.java)
            startActivity(intent)
        }

        val spherecalButton = findViewById<Button>(R.id.spherecalButton)
        spherecalButton.setOnClickListener {
            val intent = Intent(this, SphereCalActivity::class.java)
            startActivity(intent)
        }
    }
}