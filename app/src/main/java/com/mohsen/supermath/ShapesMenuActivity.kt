package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ShapesMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shapes_menu)

        val threeDimensionShapes = findViewById<Button>(R.id.threeDimensionShapes)
        threeDimensionShapes.setOnClickListener {
            val intent = Intent(this, ThreeDimensionalShapes::class.java)
            startActivity(intent)
        }
        val twoDimensionShapes = findViewById<Button>(R.id.twoDimensionShapes)
        twoDimensionShapes.setOnClickListener {
            val intent = Intent(this, TwoDimensionalShapesActivity::class.java)
            startActivity(intent)
        }


    }
}