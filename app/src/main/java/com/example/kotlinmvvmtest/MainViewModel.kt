package com.example.kotlinmvvmtest

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField

class MainViewModel {
    var message = ObservableField("こんにちは、世界！")
    fun onClickButton(v: View) {
        Log.d("mopi", "$v")
        message.set("Successfully, DataBinding!")
    }
}