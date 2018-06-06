package com.mcandroid.higherorlower

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_correct_guess.*

class CorrectGuessActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correct_guess)

        playAgain()
        exitGame()
    }

    fun playAgain() {
        btnPlayAgain.setOnClickListener{
            val intent = Intent("com.mcandroid.higherorlower.MainActivity")
            startActivity(intent)
        }
    }

    fun exitGame() {
        btnExit.setOnClickListener{
            this.finishAffinity()
        }
    }
}
