package com.example.callscreentheme

import android.annotation.SuppressLint
import android.app.Dialog
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.example.callscreentheme.databinding.ActivityPremiumBinding



class premiumActivity : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityPremiumBinding.inflate(layoutInflater)

        if (binding.radiopro1.isChecked){

        }
        binding.radiopro1.setOnClickListener {
            binding.radiopro1.isChecked = true
            binding.radiopro2.isChecked = false
            binding.radiopro3.isChecked = false
        }
        binding.radiopro2.setOnClickListener {
            binding.radiopro1.isChecked = false
            binding.radiopro2.isChecked = true
            binding.radiopro3.isChecked = false
        }
        binding.radiopro3.setOnClickListener {
            binding.radiopro1.isChecked = false
            binding.radiopro2.isChecked = false
            binding.radiopro3.isChecked = true
        }

        binding.close.setOnClickListener {

            val dialog = Dialog(this) // "this" refers to the current context
            dialog.setContentView(R.layout.activity_premium_dialog)
            dialog.show()
        }

        setContentView(binding.root)


        }


    }
