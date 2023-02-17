package com.example.trafficlightapphw2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.example.trafficlightapphw2.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var red_light: ImageView
    private lateinit var yellow_light: ImageView
    private lateinit var green_light: ImageView


    private lateinit var button: Button

    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var isStop = true
        var isGo = true
        var isWait = true

        binding.button.setOnClickListener {
            currentIndex = (currentIndex + 1) % 3

            if (isStop) {
                red_light.visibility = View.VISIBLE
                yellow_light.visibility = View.INVISIBLE
                green_light.visibility = View.INVISIBLE
                button.setBackgroundColor(Color.RED)
                button.text = "STOP"

            } else if (isGo) {
                red_light.visibility = View.INVISIBLE
                yellow_light.visibility = View.INVISIBLE
                green_light.visibility = View.VISIBLE
                button.setBackgroundColor(Color.GREEN)
                button.text = "GO"

            } else {
                red_light.visibility = View.INVISIBLE
                yellow_light.visibility = View.VISIBLE
                green_light.visibility = View.INVISIBLE
                button.setBackgroundColor(Color.YELLOW)
                button.text = "WAIT"

            }
        }
    }
}

