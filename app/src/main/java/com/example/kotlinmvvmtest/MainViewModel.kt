package com.example.kotlinmvvmtest

import android.util.Log
import android.view.View
import androidx.databinding.ObservableField

//这里就是被绑定的单位中，实现对应的处理
class MainViewModel {

    //对应其中一个单位，绑定前的定义
    var message = ObservableField("こんにちは、世界！")


    fun onClickButton(被绑定的单位: View) {
        Log.d("被绑定的单位：", "$被绑定的单位")
        message.set("Successfully, DataBinding!")
    }
}