package com.mohsen.supermath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class circleCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle_cal)

        lateinit var pInputRadius: EditText
        lateinit var submitPRadius: Button
        lateinit var pAnswer: TextView
        lateinit var sInputRadius: EditText
        lateinit var submitSRadius: Button
        lateinit var sAnswer: TextView

        pInputRadius = findViewById(R.id.pInputRadius)
        submitPRadius = findViewById(R.id.submitPRadius)
        pAnswer = findViewById(R.id.pAnswer)

        sInputRadius = findViewById(R.id.sInputRadius)
        submitSRadius = findViewById(R.id.submitSRadius)
        sAnswer = findViewById(R.id.sAnswer)

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