package com.mohsen.supermath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class triangleCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle_cal)

        lateinit var pInputRadius: EditText
        lateinit var p1InputRadius: EditText
        lateinit var p2InputRadius: EditText
        lateinit var submitPRadius: Button
        lateinit var pAnswer: TextView
        lateinit var sInputRadius: EditText
        lateinit var s1InputRadius: EditText
        lateinit var submitSRadius: Button
        lateinit var sAnswer: TextView

        pInputRadius = findViewById(R.id.pInputRadius)
        p1InputRadius = findViewById(R.id.p1InputRadius)
        p2InputRadius = findViewById(R.id.p2InputRadius)
        submitPRadius = findViewById(R.id.submitPRadius)
        pAnswer = findViewById(R.id.pAnswer)

        sInputRadius = findViewById(R.id.sInputRadius)
        s1InputRadius = findViewById(R.id.s1InputRadius)
        submitSRadius = findViewById(R.id.submitSRadius)
        sAnswer = findViewById(R.id.sAnswer)

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