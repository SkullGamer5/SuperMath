package com.mohsen.supermath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class sphereCalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere_cal)

        lateinit var vInputRadius: EditText
        lateinit var submitVRadius: Button
        lateinit var vAnswer: TextView
        lateinit var sInputRadius: EditText
        lateinit var submitSRadius: Button
        lateinit var sAnswer: TextView

        vInputRadius = findViewById(R.id.vInputRadius)
        submitVRadius = findViewById(R.id.submitVRadius)
        vAnswer = findViewById(R.id.vAnswer)

        sInputRadius = findViewById(R.id.sInputRadius)
        submitSRadius = findViewById(R.id.submitSRadius)
        sAnswer = findViewById(R.id.sAnswer)

        submitVRadius.setOnClickListener {
            val radius = vInputRadius.text.toString()
            val fRadius = radius.toFloat()

            val sphereVolume = (4.0/3.0)*Math.PI*fRadius.pow(3)
            vAnswer.text = sphereVolume.toString()
        }
    }
}
