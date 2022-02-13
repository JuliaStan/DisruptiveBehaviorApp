package com.example.disruptivebehaviorapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class StatsMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.stats_main)
    }
}