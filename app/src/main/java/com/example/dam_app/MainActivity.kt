package com.example.dam_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var zar_1 : ImageView
    lateinit var zar_2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button_roll)
        rollButton.setOnClickListener { rollDice() }
        zar_1 = findViewById(R.id.zar_1)
        zar_2 = findViewById(R.id.zar_2)

        val clearButton: Button = findViewById(R.id.clear_button)
        clearButton.setOnClickListener { clear_dice() }
    }

    private fun clear_dice(){
        zar_1.setImageResource(R.drawable.empty_dice)
        zar_2.setImageResource(R.drawable.empty_dice)
    }

    private fun getRandomDiceImage() : Int {
        val numar_aleatoriu = (1..6).random()

        val drawableResource = when (numar_aleatoriu){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        return drawableResource
    }

    private fun rollDice(){

        zar_1.setImageResource(getRandomDiceImage())
        zar_2.setImageResource(getRandomDiceImage())
    }

}
