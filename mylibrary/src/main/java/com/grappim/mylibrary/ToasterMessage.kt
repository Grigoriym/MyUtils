package com.grappim.mylibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage() {
  companion object {
    fun createToast(context: Context, message: String) {
      Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
  }
}