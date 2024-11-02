package com.example.shoppingtrack

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    /*
    Global variables here
    public
    internal (inside this module)
    protected (visible in subclasses)
    private (this class only)
    */
//    textview is our app screen
    val textview : TextView by lazy {findViewById<TextView>(R.id.textview)}


//    when app is initializing
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "after:onCreate", Toast.LENGTH_SHORT).show()

        /*
        val - read-only like constants
        var - mutable
        */




//        val button : Button = findViewById<Button>(R.id.button)
//        var count = 0
//
//        button.setOnClickListener {
//            count++
//            textview.text = "Count: $count"
//        }


    }

//    when app is minimized
    override fun onPause() {
//        take action
        Toast.makeText(this, "before:onPause", Toast.LENGTH_SHORT).show()
        super.onPause()

    }

//    when app is visible (onCreate -> onStart)
    override fun onStart() {
        super.onStart()
//        take action
        Toast.makeText(this, "after:onStart", Toast.LENGTH_SHORT).show()
    }

//    when app is killed
    override fun onDestroy() {
//        take action
        Toast.makeText(this, "before:onDestroy", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}