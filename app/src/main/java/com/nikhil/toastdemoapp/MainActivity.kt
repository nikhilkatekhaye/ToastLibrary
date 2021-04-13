package com.nikhil.toastdemoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nikhil.toastlib.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var toasterMessage = ToasterMessage()
        toasterMessage.failureToast(this,"Hello Nikhil")
    }
}