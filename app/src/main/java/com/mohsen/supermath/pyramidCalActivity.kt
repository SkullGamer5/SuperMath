package com.mohsen.supermath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class pyramidCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyramid_cal)

        lateinit var vInputRadius: EditText
        lateinit var vInputRadius2: EditText
        lateinit var submitVRadius: Button
        lateinit var vAnswer: TextView
        lateinit var sInputRadius: EditText
        lateinit var sInputRadius2: EditText
        lateinit var sInputRadius3: EditText
        lateinit var submitSRadius: Button
        lateinit var sAnswer: TextView

        vInputRadius = findViewById(R.id.vInputRadius)
        vInputRadius2 = findViewById(R.id.vInputRadius2)
        submitVRadius = findViewById(R.id.submitVRadius)
        vAnswer = findViewById(R.id.vAnswer)

        sInputRadius = findViewById(R.id.sInputRadius)
        sInputRadius2 = findViewById(R.id.sInputRadius2)
        sInputRadius3 = findViewById(R.id.sInputRadius3)
        submitSRadius = findViewById(R.id.submitSRadius)
        sAnswer = findViewById(R.id.sAnswer)

        submitVRadius.setOnClickListener {
            val radius = vInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val radius2 = vInputRadius2.text.toString()
            val fRadius2 = radius.toFloat()

            val  pyramidVolume = fRadius * fRadius2 / 3.0
            vAnswer.text = pyramidVolume.toString()
        }

        submitSRadius.setOnClickListener {
            val radius = sInputRadius.text.toString()
            val fRadius = radius.toFloat()

        submitSRadius.setOnClickListener {
            val radius2 = sInputRadius2.text.toString()
            val fRadius2 = radius2.toFloat()

        submitSRadius.setOnClickListener {
            val radius3 = sInputRadius3.text.toString()
            val fRadius3 = radius3.toFloat()

            val cubeSurface =(fRadius*fRadius3)*0.5+fRadius2
            sAnswer.text = cubeSurface.toString()
        }
    }
}}}