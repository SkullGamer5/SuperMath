package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class algebraMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_algebra_menu)

        val identityButton = findViewById<Button>(R.id.identityButton)
        identityButton.setOnClickListener{
            val intent = Intent(this,identityMenu::class.java)
            startActivity(intent)
        }
    }
}