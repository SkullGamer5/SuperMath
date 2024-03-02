package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class squareIdentityActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_identity)

        val squareIdentityButton1 = findViewById<Button>(R.id.squareIdentityButton1)
        squareIdentityButton1.setOnClickListener{
            val Intent = Intent(this,squareIdentityFormsActivity::class.java)
            startActivity(Intent)
        }

        val squareIdentityButton2 = findViewById<Button>(R.id.squareIdentityButton2)
        squareIdentityButton2.setOnClickListener{
            val Intent = Intent(this,squareIdentityCalActivity::class.java)
            startActivity(Intent)
        }
    }
}