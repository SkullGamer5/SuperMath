package com.mohsen.supermath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class triangleCalActivity : AppCompatActivity() {

    private lateinit var pInputRadius: EditText
    private lateinit var p1InputRadius: EditText
    private lateinit var p2InputRadius: EditText
    private lateinit var submitPRadius: Button
    private lateinit var pAnswer: TextView
    private lateinit var sInputRadius: EditText
    private lateinit var s1InputRadius: EditText
    private lateinit var submitSRadius: Button
    private lateinit var sAnswer: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle_cal)

        // Initialize the views
        pInputRadius = findViewById(R.id.pInputRadius)
        p1InputRadius = findViewById(R.id.p1InputRadius)
        p2InputRadius = findViewById(R.id.p2InputRadius)
        submitPRadius = findViewById(R.id.submitPRadius)
        pAnswer = findViewById(R.id.pAnswer)

        sInputRadius = findViewById(R.id.sInputRadius)
        s1InputRadius = findViewById(R.id.s1InputRadius)
        submitSRadius = findViewById(R.id.submitSRadius)
        sAnswer = findViewById(R.id.sAnswer)

        // Set click listeners for the buttons
        submitPRadius.setOnClickListener {
            val radius = pInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val radius1 = p1InputRadius.text.toString()
            val fRadius1 = radius1.toFloat()

            val radius2 = p2InputRadius.text.toString()
            val fRadius2 = radius2.toFloat()

            val triangleP = fRadius + fRadius1 + fRadius2
            pAnswer.text = triangleP.toString()
        }

        submitSRadius.setOnClickListener {
            val radius = sInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val radius1 = s1InputRadius.text.toString()
            val fRadius1 = radius1.toFloat()

            val triangleSurface = (fRadius * fRadius1) / 2.0
            sAnswer.text = triangleSurface.toString()
        }
    }
}