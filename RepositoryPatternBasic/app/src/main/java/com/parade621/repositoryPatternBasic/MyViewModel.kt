package com.parade621.repositoryPatternBasic

import androidx.lifecycle.*

class MyViewModel( _counter : Int, private val savedStateHandle: SavedStateHandle, private val repositoryImpl: MyRepositoryImpl):ViewModel() {

    val counterFromRepository : LiveData<Int> = repositoryImpl.getCounter()

    fun increaseCounter(){
        repositoryImpl.increaseCounter()
    }

    val liveCounter:MutableLiveData<Int> = MutableLiveData(_counter)
    val modifiedCounter: LiveData<String> = Transformations.map(liveCounter){counter->
        "$counter 입니다."
    }

    val counter = savedStateHandle.get<Int>(SAVE_STATE_KEY) ?: _counter
    val hasChecked : MutableLiveData<Boolean> = MutableLiveData<Boolean>(false)

    fun saveState(){
        savedStateHandle.set(SAVE_STATE_KEY, counter)
    }

    companion object{
        private const val SAVE_STATE_KEY = "counter"
    }

}