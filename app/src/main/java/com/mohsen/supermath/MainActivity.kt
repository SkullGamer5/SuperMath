package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shapesMenuButton = findViewById<Button>(R.id.shapesButton)
        shapesMenuButton.setOnClickListener{
            val Intent = Intent(this,shapesMenuActivity::class.java)
            startActivity(Intent)
        }

        val algebraMenuButton = findViewById<Button>(R.id.algebraButton)
        algebraMenuButton.setOnClickListener {
            val Intent = Intent(this, algebraMenuActivity::class.java)
            startActivity(Intent)
        }

        /*val aboutMenuButton = findViewById<Button>(R.id.aboutButton)
        aboutMenuButton.setOnClickListener {
            val Intent = Intent(this,aboutMenuActivity::class.java)
            startActivity(Intent)
        }*/
    }
}