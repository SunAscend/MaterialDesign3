package com.wuyson.materialdesign3.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wuyson.materialdesign3.databinding.ActivitySliderBinding

class SliderActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySliderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySliderBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}