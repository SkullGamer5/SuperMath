package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class threeDimensionalShapes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_three_dimensional_shapes)

        val sphereButton = findViewById<ImageView>(R.id.sphereButton)
        sphereButton.setOnClickListener{
            val Intent = Intent(this,sphereActivity::class.java)
            startActivity(Intent)
        }
    }
}