package com.elon.pokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.HiltAndroidApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}