package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SquareIdentityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_identity)

        val squareIdentityButton1 = findViewById<Button>(R.id.squareIdentityButton1)
        squareIdentityButton1.setOnClickListener {
            val intent = Intent(this, SquareIdentityFormsActivity::class.java)
            startActivity(intent)
        }

        val squareIdentityButton2 = findViewById<Button>(R.id.squareIdentityButton2)
        squareIdentityButton2.setOnClickListener {
            val intent = Intent(this, SquareIdentityCalActivity::class.java)
            startActivity(intent)
        }
    }
}