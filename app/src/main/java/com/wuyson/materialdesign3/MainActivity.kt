package com.wuyson.materialdesign3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.wuyson.materialdesign3.databinding.ActivityMainBinding
import com.wuyson.materialdesign3.ui.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn2Button.setOnClickListener {
            launch<ButtonsActivity>()
        }

        binding.btn2Fab.setOnClickListener {
            launch<FabActivity>()
        }

        binding.btn2Card.setOnClickListener {
            launch<CardsActivity>()
        }

        binding.btn2BottomSheet.setOnClickListener {
            launch<BottomSheetActivity>()
        }

        binding.btn2Slider.setOnClickListener {
            launch<SliderActivity>()
        }
    }
}