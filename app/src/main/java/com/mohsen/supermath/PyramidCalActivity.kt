package com.mohsen.supermath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PyramidCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pyramid_cal)

        val vInputRadius: EditText = findViewById(R.id.vInputRadius)
        val vInputRadius2: EditText = findViewById(R.id.vInputRadius2)
        val submitVRadius: Button = findViewById(R.id.submitVRadius)
        val vAnswer: TextView = findViewById(R.id.vAnswer)

        val sInputRadius: EditText = findViewById(R.id.sInputRadius)
        val sInputRadius2: EditText = findViewById(R.id.sInputRadius2)
        val sInputRadius3: EditText = findViewById(R.id.sInputRadius3)
        val submitSRadius: Button = findViewById(R.id.submitSRadius)
        val sAnswer: TextView = findViewById(R.id.sAnswer)

        submitVRadius.setOnClickListener {
            val radius = vInputRadius.text.toString()
            val fRadius = radius.toFloat()

            vInputRadius2.text.toString()
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