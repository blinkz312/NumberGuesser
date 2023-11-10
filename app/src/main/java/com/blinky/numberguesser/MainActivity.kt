package com.blinky.numberguesser

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Calling button method
        val button = findViewById<Button>(R.id.guessBtn)
        //Set on click listener for the button
        button.setOnClickListener {
            buttonPressed()
        }
    }
        //Creating button for button pressed
        private fun buttonPressed() {
            //Method to find view from activity_main
            val result = findViewById<TextView>(R.id.result)
            val userAnsEditText = findViewById<EditText>(R.id.answer)
            val userAnsText = userAnsEditText.text.toString()

            val answerCorrect = "Congrats, you have correctly guessed the number"
            val answerWrong = "Sorry,you have guessed the wrong number"
            val answerEmpty = "Please enter a number"

            if (userAnsText.isEmpty()) {
                result.text = answerEmpty
            } else {
                val userAnsInt = userAnsText.toInt()
                //This variable will display the answer
                //Making random numbers from 1 to 10
                val randomValues = Random.nextInt(1, 11)
                //Adding a condition to check if user answer matches the random answer
                when (userAnsInt) {
                    null -> result.text = answerEmpty
                    randomValues -> result.text = answerCorrect
                    else -> result.text = answerWrong
                }
            }
        }
        }
