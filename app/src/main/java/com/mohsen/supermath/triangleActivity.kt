package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class triangleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        val triangleAboutButton = findViewById<Button>(R.id.triangleAboutButton)
        triangleAboutButton.setOnClickListener{
            val Intent = Intent(this,TriangleAboutActivity::class.java)
            startActivity(Intent)

        }

        val triangleFormsButton = findViewById<Button>(R.id.triangleformsButton)
        triangleFormsButton.setOnClickListener{
            val Intent = Intent(this,TriangleFormsActivity::class.java)
            startActivity(Intent)
        }

        val trianglecalButton = findViewById<Button>(R.id.trianglecalButton)
        trianglecalButton.setOnClickListener{
            val Intent = Intent(this,TriangleCalActivity::class.java)
            startActivity(Intent)
        }
    }
}