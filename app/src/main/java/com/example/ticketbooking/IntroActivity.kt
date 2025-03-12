package com.example.ticketbooking

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ticketbooking.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize View Binding
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Button click listener to navigate to MainActivity
        binding.btnStart.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
