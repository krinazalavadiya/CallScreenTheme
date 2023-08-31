package com.example.callscreentheme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.callscreentheme.databinding.ActivityPremiumDialogBinding

class PremiumDialogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding  = ActivityPremiumDialogBinding.inflate(layoutInflater)

        binding.close1.setOnClickListener {
               var intent = Intent(this,ScreenThemeActivity::class.java)

                startActivity(intent)
        }
        setContentView(binding.root)

    }
}