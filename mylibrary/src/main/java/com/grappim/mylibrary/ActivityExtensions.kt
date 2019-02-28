package com.grappim.mylibrary

import android.app.Activity
import android.content.Intent
import android.util.DisplayMetrics
import android.widget.Toast
import androidx.core.content.ContextCompat

fun Activity.toastShort(message: String) {
    runOnUiThread { Toast.makeText(this, message, Toast.LENGTH_SHORT).show() }
}

fun Activity.toastLong(message: String) {
    runOnUiThread { Toast.makeText(this, message, Toast.LENGTH_LONG).show() }
}

fun Activity.callTo(clazz: Class<out Activity>) {
    startActivity(Intent(this, clazz))
}

fun Activity.screenWidth(): Int {
    val metrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    return metrics.widthPixels
}

fun Activity.screenHeight(): Int {
    val metrics = DisplayMetrics()
    windowManager.defaultDisplay.getMetrics(metrics)
    return metrics.heightPixels
}

fun Activity.color(resId: Int): Int {
    return ContextCompat.getColor(this, resId)
}