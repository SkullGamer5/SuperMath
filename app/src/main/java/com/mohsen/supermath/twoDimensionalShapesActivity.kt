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
        circleButton.setOnClickListener {
            val Intent = Intent(this, circleActivity::class.java)
            startActivity(Intent)}

        val squareButton = findViewById<ImageView>(R.id.squareButton)
        squareButton.setOnClickListener {
            val intent = Intent(this, squareActivity::class.java)
            startActivity(intent)
            }
        val triangleButton = findViewById<ImageView>(R.id.triangleButton)
        triangleButton.setOnClickListener {
            val iNtent = Intent(this, triangleActivity::class.java)
            startActivity(iNtent)
            }

    }
}