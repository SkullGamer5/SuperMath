package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)

        val cubeAboutButton = findViewById<Button>(R.id.cubeAboutButton)
        cubeAboutButton.setOnClickListener{
            val intent = Intent(this,CubeAboutActivity::class.java)
            startActivity(intent)

        }

        val cubeFormsButton = findViewById<Button>(R.id.cubeformsButton)
        cubeFormsButton.setOnClickListener{
            val intent = Intent(this,CubeFormsActivity::class.java)
            startActivity(intent)
        }

        val cubeCalButton = findViewById<Button>(R.id.cubecalButton)
        cubeCalButton.setOnClickListener {
            val intent = Intent(this,CubeCalActivity::class.java)
            startActivity(intent)
        }
    }
}