package com.example.snowflakesk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.snow.Snowflakes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // заменим разметку на нашу View
        //setContentView(R.layout.activity_main)
        setContentView(Snowflakes(this))
    }
}