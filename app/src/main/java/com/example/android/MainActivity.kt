package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var mCount =1
    private var rollDice:TextView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollDice= findViewById<TextView>(R.id.show_count)

    }

    fun showToast(view: View) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT).show()
    }

    fun rollingDice(view: View) {
        mCount=(1..6).random()
        var textResult:TextView=findViewById(R.id.show_count)
        textResult.text=mCount.toString()

    }

}