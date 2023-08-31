package com.example.callscreentheme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.callscreentheme.Adapter.FragmentPagerAdapter


class OnBordingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_bording)

        var viewPager = findViewById<ViewPager>(R.id.onbordingviewpager)
        var adapter = FragmentPagerAdapter(supportFragmentManager)
        viewPager.adapter = adapter

    }
}