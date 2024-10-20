package com.konstantion.lab2.ui.newone

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NewOneModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is new one fragment"
    }
    val text: LiveData<String> = _text
}