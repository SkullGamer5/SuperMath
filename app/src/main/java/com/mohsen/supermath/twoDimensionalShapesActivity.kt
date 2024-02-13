package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class twoDimensionalShapesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_dimensional_shapes)

        val circleButton = findViewById<ImageView>(R.id.circleButton)
        circleButton.setOnClickListener{
            val Intent = Intent(this,circleActivity::class.java)
            startActivity(Intent)
        }
    }
}