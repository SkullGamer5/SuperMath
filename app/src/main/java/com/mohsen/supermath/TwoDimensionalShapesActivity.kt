package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class TwoDimensionalShapesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_dimensional_shapes)

        val circleButton = findViewById<ImageView>(R.id.circleButton)
        circleButton.setOnClickListener {
            val intent1 = Intent(this, CircleActivity::class.java)
            startActivity(intent1)

            val squareButton = findViewById<ImageView>(R.id.squareButton)
            squareButton.setOnClickListener {
                val intent2 = Intent(this, SquareActivity::class.java)
                startActivity(intent2)
            }
            val triangleButton = findViewById<ImageView>(R.id.triangleButton)
            triangleButton.setOnClickListener {
                val intent3 = Intent(this, triangleActivity::class.java)
                startActivity(intent3)
            }
        }
    }}