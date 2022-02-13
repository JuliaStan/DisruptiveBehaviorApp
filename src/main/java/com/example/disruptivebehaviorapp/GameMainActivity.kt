package com.example.disruptivebehaviorapp

import android.os.Bundle
import android.os.PersistableBundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

class GameMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.game_main)
    }
}