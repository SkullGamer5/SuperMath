package com.mohsen.supermath

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class IdentityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identity_menu)

        val squareIdentityButton = findViewById<Button>(R.id.squareIdentityButton)
        squareIdentityButton.setOnClickListener {
            val intent = Intent(this, SquareIdentityActivity::class.java)
            startActivity(intent)
        }
    }
}