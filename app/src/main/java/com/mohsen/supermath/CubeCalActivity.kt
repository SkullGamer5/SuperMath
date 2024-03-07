package com.mohsen.supermath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class CubeCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cube_cal)

        val vInputRadius: EditText = findViewById(R.id.vInputRadius)
        val submitVRadius: Button = findViewById(R.id.submitVRadius)
        val vAnswer: TextView = findViewById(R.id.vAnswer)

        val sInputRadius: EditText = findViewById(R.id.sInputRadius)
        val submitSRadius: Button = findViewById(R.id.submitSRadius)
        val sAnswer: TextView = findViewById(R.id.sAnswer)

        submitVRadius.setOnClickListener {
            val radius = vInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val cubeVolume = fRadius.pow(3)
            vAnswer.text = cubeVolume.toString()
        }

        submitSRadius.setOnClickListener {
            val radius = sInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val cubeSurface = 6 * fRadius.pow(2)
            sAnswer.text = cubeSurface.toString()
        }
    }
}