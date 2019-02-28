package com.grappim.mylibrary

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.core.content.ContextCompat

fun Context.getColotCompat(color: Int) = ContextCompat.getColor(this, color)

inline val Context.inflater: LayoutInflater
  get() = LayoutInflater.from(this)

fun Context.inflateLayout(@LayoutRes layoutId: Int, parent: ViewGroup? = null, attachToRoot: Boolean = false): View =
    LayoutInflater.from(this).inflate(layoutId, parent, attachToRoot)

inline val Context.connectivityManager: ConnectivityManager?
  get() = getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager

fun Context.inflate(res: Int, parent: ViewGroup? = null): View {
  return LayoutInflater.from(this).inflate(res, parent, false)
}

inline fun <reified T : Activity> Context?.startActivity() =
    this?.startActivity(Intent(this, T::class.java))