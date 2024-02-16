package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class sphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)

        val sphereAboutButton = findViewById<Button>(R.id.sphereAboutButton)
        sphereAboutButton.setOnClickListener{
            val Intent = Intent(this,sphereAboutActivity::class.java)
            startActivity(Intent)
        }

        val sphereFormsButton = findViewById<Button>(R.id.sphereformsButton)
        sphereFormsButton.setOnClickListener{
            val Intent = Intent(this,sphereFormsActivity::class.java)
            startActivity(Intent)
        }

        val spherecalButton = findViewById<Button>(R.id.spherecalButton)
        spherecalButton.setOnClickListener{
            val Intent = Intent(this,sphereCalActivity::class.java)
            startActivity(Intent)
        }
    }
}