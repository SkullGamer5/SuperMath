package com.mohsen.supermath

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class SquareIdentityCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_identity_cal)

        val inputFirstNum: EditText = findViewById(R.id.InputFirstNum)
        val inputSecondNum: EditText = findViewById(R.id.InputSecondNum)
        val submit: Button = findViewById(R.id.submit)
        val answer: TextView = findViewById(R.id.Answer)

        submit.setOnClickListener {
            val firstNum = inputFirstNum.text.toString()
            val fFirstNum = firstNum.toFloat()

            val secondNum = inputSecondNum.text.toString()
            val fSecondNum = secondNum.toFloat()

            val cubeVolume = (fFirstNum + fSecondNum).pow(2)
            answer.text = cubeVolume.toString()
        }
    }
}