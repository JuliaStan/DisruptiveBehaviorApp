package com.example.disruptivebehaviorapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val goToGameMain: Button = findViewById(R.id.goToGameMain)
        goToGameMain.setOnClickListener {
            startActivity(Intent(this, GameMainActivity::class.java))
        }

        val goToStatistics: Button = findViewById(R.id.goToStatistics)
        goToStatistics.setOnClickListener {
            startActivity(Intent(this, StatsMain::class.java))
        }
    }
}