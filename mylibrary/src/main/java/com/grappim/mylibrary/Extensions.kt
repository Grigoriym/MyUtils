package com.grappim.mylibrary

import android.app.Dialog
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar

inline fun Dialog.ifIsSHowing(body: Dialog.() -> Unit) {
    if (isShowing) {
        body()
    }
}

inline fun Snackbar.ifIsShowing(body: Snackbar.() -> Unit) {
    if (isShown) {
        body()
    }
}

operator fun ViewGroup.get(position: Int): View? = getChildAt(position)

fun Boolean.asInt(): Int {
    return if (this) 1 else 0
}

fun Int.asBoolean(): Boolean {
    return (this == 1)
}


