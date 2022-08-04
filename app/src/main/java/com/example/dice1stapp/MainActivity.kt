package com.example.dice1stapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button= findViewById<Button>(R.id.button)
        var button2= findViewById<Button>(R.id.button2)
        var textofdice= findViewById<TextView>(R.id.textView)
        button.setOnClickListener {
            // FOR EXIT APP
//            moveTaskToBack(true)
//            finishAffinity()
//            exitProcess(-1)

            // FOR TOAST MESSAGE
            var toast= Toast.makeText(this, "Dice! Rolled", Toast.LENGTH_LONG )
            var tt= Dice()
            textofdice.text=tt.roll().toString()
        }
        button2.setOnClickListener {
            finishAffinity() // exit
        }
    }
    class Dice {
        fun roll(): Int{
            return (1..9).random()
        }
    }
}
