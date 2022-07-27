package com.wuyson.materialdesign3.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.wuyson.materialdesign3.R
import com.wuyson.materialdesign3.databinding.ActivityBottomSheetBinding
import com.wuyson.materialdesign3.pxInt
import com.wuyson.materialdesign3.util.WindowPreferencesManager


class BottomSheetActivity : AppCompatActivity() {
    private lateinit var binding:ActivityBottomSheetBinding
    private lateinit var bottomSheetDialog:BottomSheetDialog

    @SuppressLint("RestrictedApi", "VisibleForTests")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityBottomSheetBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val windowPreferencesManager = WindowPreferencesManager(this)
        //dialog
        bottomSheetDialog = BottomSheetDialog(this)
//        bottomSheetDialog.setCancelable(false)
        bottomSheetDialog.setContentView(R.layout.dialog_bottom_sheet)
//        windowPreferencesManager.applyEdgeToEdgePreference(bottomSheetDialog.window)
        bottomSheetDialog.behavior.run {
            disableShapeAnimations()
            peekHeight = 157.pxInt
        }

        binding.dialog.setOnClickListener {
            bottomSheetDialog.show()
        }

        val behavior = BottomSheetBehavior.from(binding.bottomSheetInternal)
        behavior.run {
//            disableShapeAnimations()
            peekHeight = 157.pxInt
//            expandedOffset = 100.pxInt
            isFitToContents = true
            addBottomSheetCallback(createBottomSheetCallback())
        }

        binding.expand.setOnClickListener {
            behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

        binding.collapse.setOnClickListener {
            behavior.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }

    private fun createBottomSheetCallback():BottomSheetBehavior.BottomSheetCallback{
        return object :BottomSheetBehavior.BottomSheetCallback(){
            override fun onStateChanged(bottomSheet: View, newState: Int) {
                when(newState){
                    BottomSheetBehavior.STATE_COLLAPSED->{}
                    BottomSheetBehavior.STATE_EXPANDED->{}
                    BottomSheetBehavior.STATE_DRAGGING->{}
                    BottomSheetBehavior.STATE_HALF_EXPANDED->{}
                    BottomSheetBehavior.STATE_HIDDEN->{}
                    BottomSheetBehavior.STATE_SETTLING->{}
                }
            }

            override fun onSlide(bottomSheet: View, slideOffset: Float) {
                Log.e("TAG", "onSlide: $slideOffset")
            }
        }
    }
}