package com.example.notes

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val iHome = Intent(this@SplashScreen, MainActivity::class.java)

        Handler().postDelayed({
            startActivity(iHome)
            finish()
        }, 2400)
    }
}