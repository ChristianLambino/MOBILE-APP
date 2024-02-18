package com.csd.mobileapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView

    private val onNavigationItemSelectedListener =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            // Handle navigation item selection here
            when (item.itemId) {
                R.id.activity_mainpage -> {
                    // Start MainActivity for the main page
                    startActivity(Intent(this, MainPage::class.java))
                    return@OnNavigationItemSelectedListener true
                }
                R.id.activity_cart -> {
                    // Start CartActivity for the cart
                    startActivity(Intent(this, Cart::class.java))
                    return@OnNavigationItemSelectedListener true
                }
                R.id.activity_components -> {
                    // Start ComponentsActivity for components
                    startActivity(Intent(this, Components::class.java))
                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_appointments -> {
                    // Start AppointmentsActivity for appointments
                    startActivity(Intent(this, Appointments::class.java))
                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.navigation)
        bottomNav.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        // Set the default selected item
        bottomNav.selectedItemId = R.id.activity_mainpage
    }
}
