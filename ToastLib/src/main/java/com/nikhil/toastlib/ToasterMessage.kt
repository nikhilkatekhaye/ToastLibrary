package com.nikhil.toastlib

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun simpleToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}