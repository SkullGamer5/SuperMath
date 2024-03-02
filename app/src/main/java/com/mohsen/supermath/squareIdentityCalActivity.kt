package com.mohsen.supermath

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.pow

class squareIdentityCalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_square_identity_cal)

        val InputFirstNum: EditText = findViewById(R.id.InputFirstNum)
        val InputSecondNum: EditText = findViewById(R.id.InputSecondNum)
        val submit: Button = findViewById(R.id.submit)
        val Answer: TextView = findViewById(R.id.Answer)

        submit.setOnClickListener {
            val firstNum = InputFirstNum.text.toString()
            val fFrstNum = firstNum.toFloat()

            val secondNum = InputSecondNum.text.toString()
            val fSecondNum = secondNum.toFloat()

            val  cubeVolume = (fFrstNum+fSecondNum).pow(2)
            Answer.text = cubeVolume.toString()
        }
    }
}