package com.wuyson.materialdesign3.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import com.wuyson.materialdesign3.R
import com.wuyson.materialdesign3.databinding.ActivityFabBinding

class FabActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFabBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFabBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.exFab.setOnClickListener {
            val view = it as ExtendedFloatingActionButton
            if (view.isExtended){
                view.shrink()
            }else{
                view.extend()
            }
        }
    }
}