package com.example.pratical1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.count_up)
        countButton.setOnClickListener { countUp() }
    }
    private fun rollDice() {
        val randomInt = Random.nextInt(6)+1
        val randomInt2 = Random.nextInt(6)+1
        val randomInt3 = Random.nextInt(6)+1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText2.text = randomInt2.toString()

        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText3.text = randomInt3.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else {

            var resultInt = resultText.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()
            var resultInt3 = resultText3.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
            if (resultInt2 < 6) {
                resultInt2++
                resultText2.text = resultInt2.toString()
            }
            if (resultInt3 < 6) {
                resultInt3++
                resultText3.text = resultInt3.toString()
            }

        }
    }
}


