package com.parade621.databindingbasic

import androidx.lifecycle.*

class MyViewModel( _counter : Int, private val savedStateHandle: SavedStateHandle):ViewModel() {

    val liveCounter:MutableLiveData<Int> = MutableLiveData(_counter)
    val modifiedCounter: LiveData<String> = Transformations.map(liveCounter){counter->
        "$counter 입니다."
    }

    val counter = savedStateHandle.get<Int>(SAVE_STATE_KEY) ?: _counter

    fun saveState(){
        savedStateHandle.set(SAVE_STATE_KEY, counter)
    }

    companion object{
        private const val SAVE_STATE_KEY = "counter"
    }

}