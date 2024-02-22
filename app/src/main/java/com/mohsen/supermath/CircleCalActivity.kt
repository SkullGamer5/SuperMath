package com.mohsen.supermath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CircleCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_cal)

        val pInputRadius: EditText = findViewById(R.id.pInputRadius)
        val submitPRadius: Button = findViewById(R.id.submitPRadius)
        val pAnswer: TextView = findViewById(R.id.pAnswer)

        val sInputRadius: EditText = findViewById(R.id.sInputRadius)
        val submitSRadius: Button = findViewById(R.id.submitSRadius)
        val sAnswer: TextView = findViewById(R.id.sAnswer)

        submitPRadius.setOnClickListener {
            val radius = pInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val circleP =2 * Math.PI * fRadius
            pAnswer.text = circleP.toString()
        }

        submitSRadius.setOnClickListener {
            val radius = sInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val circleSurface = Math.PI * fRadius * fRadius
            sAnswer.text = circleSurface.toString()
    }
}
}