package com.example.callscreentheme

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.callscreentheme.databinding.ActivitySaveCallThemeBinding


class SaveCallThemeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var binding = ActivitySaveCallThemeBinding.inflate(layoutInflater)

        binding.btnsave.setOnClickListener {

            var intent = Intent(this, CallScreeningActivity::class.java)
            startActivity(intent)

        }

        binding.back.setOnClickListener {
            onBackPressed()
        }


        binding.premium.setOnClickListener {
            val intent = Intent(this, premiumActivity::class.java)
            startActivity(intent)
        }

        setContentView(binding.root)
    }

}