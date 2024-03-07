package com.mohsen.supermath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class SphereCalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere_cal)

        val vInputRadius: EditText = findViewById(R.id.vInputRadius)
        val submitVRadius: Button = findViewById(R.id.submitVRadius)
        val vAnswer: TextView = findViewById(R.id.vAnswer)

        val sInputRadius: EditText = findViewById(R.id.sInputRadius)
        val submitSRadius: Button = findViewById(R.id.submitSRadius)
        val sAnswer: TextView = findViewById(R.id.sAnswer)

        submitVRadius.setOnClickListener {
            val radius = vInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val sphereVolume = (4.0 / 3.0) * Math.PI * fRadius.pow(3)
            vAnswer.text = sphereVolume.toString()
        }

        submitSRadius.setOnClickListener {
            val radius = sInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val sphereSurface = 4 * Math.PI * fRadius.pow(2)
            sAnswer.text = sphereSurface.toString()
        }
    }
}
