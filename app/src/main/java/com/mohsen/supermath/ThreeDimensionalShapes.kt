package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ThreeDimensionalShapes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_dimensional_shapes)

        val sphereButton = findViewById<ImageView>(R.id.sphereButton)
        sphereButton.setOnClickListener {
            val intent = Intent(this, SphereActivity::class.java)
            startActivity(intent)
        }

        val cubeButton = findViewById<ImageView>(R.id.cubeButton)
        cubeButton.setOnClickListener {
            val intent = Intent(this, CubeActivity::class.java)
            startActivity(intent)
        }
        val pyramidButton = findViewById<ImageView>(R.id.pyramidButton)
        pyramidButton.setOnClickListener {
            val intent = Intent(this, PyramidActivity::class.java)
            startActivity(intent)
        }
    }
}