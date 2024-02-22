package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShapesMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shapes_menu)

        val threeDimensionShapes = findViewById<Button>(R.id.threeDimensionShapes)
        threeDimensionShapes.setOnClickListener{
            val intent = Intent(this,threeDimensionalShapes::class.java)
            startActivity(intent)
        }
        val twoDimensionShapes = findViewById<Button>(R.id.twoDimensionShapes)
        twoDimensionShapes.setOnClickListener{
            val intent = Intent(this,TwoDimensionalShapesActivity::class.java)
            startActivity(intent)
        }


    }
}