package com.csd.mobileapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_LENGTH = 2000 // Splash screen duration in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Using Handler to delay the opening of the MainActivity
        Handler().postDelayed({
            // Start MainActivity after the splash screen duration
            val mainIntent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(mainIntent)
            finish() // Finish current activity
        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}
