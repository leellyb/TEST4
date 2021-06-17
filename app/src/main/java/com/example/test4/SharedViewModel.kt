package com.example.test4

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
//    define mutable live data object

    val message = MutableLiveData<String>()

//    fun to capture data to be shared

    fun sendmessage(text: String){
        message.value = text


    }



}