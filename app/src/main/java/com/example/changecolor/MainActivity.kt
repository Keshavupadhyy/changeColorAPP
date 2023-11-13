package com.example.changecolor

import android.graphics.Color
import android.graphics.Color.RED
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var view : View
    private lateinit var button : FloatingActionButton
    private val colors = arrayOf(Color.RED,Color.GREEN,Color.WHITE,Color.GRAY,Color.BLACK,Color.YELLOW)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        view = findViewById(R.id.view)
        button = findViewById(/* id = */ R.id.button_change)

        button.setOnClickListener {
            view.setBackgroundColor(/* color = */ colors[Random.nextInt(colors.size)])
        }
    }
}