package com.parade621.applyviewmodel

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner


@Suppress("UNCHECKED_CAST")
/*
class MyViewModelFactory(private val counter: Int):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel(counter) as T
        }
        throw IllegalArgumentException("ViewModel class Not Found")
    }
}*/
// 생성자로 saveStateHandle을 받을 수 있게 변경해야 한다.
class MyViewModelFactory(
    private val counter:Int,
    owner: SavedStateRegistryOwner,
    defaultArgs: Bundle? =null,
) : AbstractSavedStateViewModelFactory(owner, defaultArgs){
    override fun<T: ViewModel> create(
        key:String,
        modelClass: Class<T>,
        handler: SavedStateHandle
    ):T{
        if(modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel(counter, handler) as T
        }
        throw IllegalArgumentException("ViewModel class not found")
    }
}