package com.blinky.numberguesser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val userAns:Int = findViewById<EditText>(R.id.answer).toString().toInt()

        val randomValues = Random.nextInt(1,10)
        if(userAns == randomValues){

        }
        }
    }