package com.nikhil.toastlib

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast


class ToasterMessage {

    fun failureToast(c: Context?, message: String?) {
        val inflater: LayoutInflater = LayoutInflater.from(c)
        val layout: View = inflater.inflate(R.layout.failure_toast, null)

        val text = layout.findViewById<View>(R.id.text) as TextView
        text.text = message

        val toast = Toast(c)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }

    fun successToast(c: Context?, message: String?) {
        val inflater: LayoutInflater = LayoutInflater.from(c)
        val layout: View = inflater.inflate(R.layout.success_toast, null)

        val text = layout.findViewById<View>(R.id.text) as TextView
        text.text = message

        val toast = Toast(c)
        toast.setGravity(Gravity.BOTTOM, 0, 50)
        toast.duration = Toast.LENGTH_LONG
        toast.view = layout
        toast.show()
    }

    fun simpleToast(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}