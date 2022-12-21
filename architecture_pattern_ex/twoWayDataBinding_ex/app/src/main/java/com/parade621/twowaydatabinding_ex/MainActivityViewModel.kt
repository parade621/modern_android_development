package com.parade621.twowaydatabinding_ex

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel

class MainActivityViewModel:ViewModel() {

    var text = MutableLiveData<String>()

    val editText = MutableLiveData<String>()

    init{
        text.value = "init"
    }

    override fun onChanged()
}