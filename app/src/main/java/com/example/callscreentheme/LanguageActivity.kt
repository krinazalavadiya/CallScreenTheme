package com.example.callscreentheme

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.callscreentheme.Fragment.Fragment1
import com.example.callscreentheme.Fragment.Fragment2
import com.example.callscreentheme.Fragment.Fragment3
import com.example.callscreentheme.databinding.ActivityLanguageBinding
import com.example.callscreentheme.databinding.ActivityPremiumBinding
import com.example.callscreentheme.databinding.NeonlistitemBinding

class LanguageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var Binding = ActivityLanguageBinding.inflate(layoutInflater)



        Binding.radio1.setOnClickListener {
            Binding.radio1.isChecked = true
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.radio2.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = true
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.radio3.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = true
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.radio4.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = true
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = false
        }

        Binding.radio5.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = true
            Binding.radio6.isChecked = false
        }

        Binding.radio6.setOnClickListener {
            Binding.radio1.isChecked = false
            Binding.radio2.isChecked = false
            Binding.radio3.isChecked = false
            Binding.radio4.isChecked = false
            Binding.radio5.isChecked = false
            Binding.radio6.isChecked = true
        }
        setContentView(Binding.root)


        Binding.languagearrow1.setOnClickListener {

                var position = 6

                val intent = Intent(this, OnBordingActivity::class.java)
                startActivity(intent)
            when (position) {
                0 -> {

                }

                1 -> {

                }

                else -> {


                }
            }
        }



        }
    }

