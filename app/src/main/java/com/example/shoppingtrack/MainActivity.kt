package com.example.shoppingtrack

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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


    //    onCreate = main (automatically calls this first)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val - read-only like constants
        var - mutable
        */


        val button : Button = findViewById<Button>(R.id.button)

        var count = 0

//        textview.apply {
//            text = getString(R.string.greeting)
//
//        }

        button.setOnClickListener {
            count++
            textview.text = "Count: $count"
        }


    }
}