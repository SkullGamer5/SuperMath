package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TriangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        val triangleAboutButton = findViewById<Button>(R.id.triangleAboutButton)
        triangleAboutButton.setOnClickListener {
            val intent = Intent(this, TriangleAboutActivity::class.java)
            startActivity(intent)

        }

        val triangleFormsButton = findViewById<Button>(R.id.triangleformsButton)
        triangleFormsButton.setOnClickListener {
            val intent = Intent(this, TriangleFormsActivity::class.java)
            startActivity(intent)
        }

        val trianglecalButton = findViewById<Button>(R.id.trianglecalButton)
        trianglecalButton.setOnClickListener {
            val intent = Intent(this, TriangleCalActivity::class.java)
            startActivity(intent)
        }
    }
}