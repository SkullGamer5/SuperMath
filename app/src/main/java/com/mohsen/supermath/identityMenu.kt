package com.mohsen.supermath

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class identityMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_identity_menu)

        val squareIdentityButton = findViewById<Button>(R.id.squareIdentityButton)
        squareIdentityButton.setOnClickListener{
            val Intent = Intent(this,shapesMenuActivity::class.java)
            startActivity(Intent)
        }
    }
}