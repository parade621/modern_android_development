package com.parade621.repositoryPatternBasic

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner

@Suppress("UNCHECKED_CAST")
class MyViewModelFactory(
    private val counter:Int,
    private val repositoryImpl: MyRepositoryImpl,
    owner: SavedStateRegistryOwner,
    defaultArgs: Bundle? = null,
):AbstractSavedStateViewModelFactory(owner, defaultArgs) {
    override fun<T: ViewModel> create(
        key:String,
        modelClass: Class<T>,
        handler: SavedStateHandle
    ):T{
        if(modelClass.isAssignableFrom(MyViewModel::class.java)){
            return MyViewModel(counter,handler,repositoryImpl) as T
        }
        throw IllegalArgumentException("ViewModel class not found")
    }
}