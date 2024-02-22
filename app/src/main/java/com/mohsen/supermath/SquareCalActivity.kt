package com.mohsen.supermath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SquareCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_cal)

        val pInputRadius: EditText = findViewById(R.id.pInputRadius)
        val submitPRadius: Button = findViewById(R.id.submitPRadius)
        val pAnswer: TextView = findViewById(R.id.pAnswer)

        val sInputRadius: EditText = findViewById(R.id.sInputRadius)
        val submitSRadius: Button = findViewById(R.id.submitSRadius)
        val sAnswer: TextView = findViewById(R.id.sAnswer)

        submitPRadius.setOnClickListener {
            val radius = pInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val squareP =4 * fRadius
            pAnswer.text = squareP.toString()
        }

        submitSRadius.setOnClickListener {
            val radius = sInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val squareSurface =fRadius * fRadius
            sAnswer.text = squareSurface.toString()
    }
}}