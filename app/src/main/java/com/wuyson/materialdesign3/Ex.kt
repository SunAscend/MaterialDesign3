package com.wuyson.materialdesign3

import android.app.Activity
import android.content.Intent
import android.content.res.Resources
import android.util.TypedValue

inline fun <reified T:Activity> Activity.launch(){
    this.startActivity(Intent(this,T::class.java))
}

val Int.px
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    )

val Int.pxInt
    get() = TypedValue.applyDimension(
        TypedValue.COMPLEX_UNIT_DIP,
        this.toFloat(),
        Resources.getSystem().displayMetrics
    ).toInt()
