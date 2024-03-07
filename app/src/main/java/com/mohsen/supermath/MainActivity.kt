package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shapesMenuButton = findViewById<Button>(R.id.shapesButton)
        shapesMenuButton.setOnClickListener {
            val intent = Intent(this, ShapesMenuActivity::class.java)
            startActivity(intent)
        }

        val algebraMenuButton = findViewById<Button>(R.id.algebraButton)
        algebraMenuButton.setOnClickListener {
            val intent = Intent(this, AlgebraMenuActivity::class.java)
            startActivity(intent)
        }

        /*val aboutMenuButton = findViewById<Button>(R.id.aboutButton)
        aboutMenuButton.setOnClickListener {
            val Intent = Intent(this,aboutMenuActivity::class.java)
            startActivity(Intent)
        }*/
    }
}