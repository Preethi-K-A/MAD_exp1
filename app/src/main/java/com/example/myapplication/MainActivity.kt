package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
            val layout : LinearLayout = findViewById(R.id.layout)
            val tv : TextView = findViewById(R.id.tv)
            val button2 : Button = findViewById(R.id.button2)
            val button3 : Button = findViewById(R.id.button3)
            val button4 : Button = findViewById(R.id.button4)
            var size : Float = 10f
            var x : Int = 0
            var y : Int = 0
            button2.setOnClickListener {
                tv.setTextSize(size)
                size = (size+10)%80
            }
            button3.setOnClickListener {
                when(x%3){
                    0-> tv.setTextColor(Color.BLUE)
                    1-> tv.setTextColor(Color.GREEN)
                    2-> tv.setTextColor(Color.MAGENTA)
                }
                x=x+1
            }
            button4.setOnClickListener {
                when(y%3){
                    0-> layout.setBackgroundColor(Color.RED)
                    1-> layout.setBackgroundColor(Color.GREEN)
                    2-> layout.setBackgroundColor(Color.CYAN)
                }
                y=y+1
            }
    }
}