package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube)

        val cubeAboutButton = findViewById<Button>(R.id.cubeAboutButton)
        cubeAboutButton.setOnClickListener{
            val Intent = Intent(this,cubeAboutActivity::class.java)
            startActivity(Intent)

        }

        val cubeFormsButton = findViewById<Button>(R.id.cubeformsButton)
        cubeFormsButton.setOnClickListener{
            val Intent = Intent(this,cubeFormsActivity::class.java)
            startActivity(Intent)
        }

        val cubecalButton = findViewById<Button>(R.id.cubecalButton)
        cubecalButton.setOnClickListener {
            val Intent = Intent(this,cubeCalActivity::class.java)
            startActivity(Intent)
        }
    }
}