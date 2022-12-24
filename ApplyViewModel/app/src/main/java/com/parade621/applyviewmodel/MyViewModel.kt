package com.parade621.applyviewmodel

import androidx.lifecycle.*

class MyViewModel( _counter: Int,
private val savedStateHandle: SavedStateHandle
): ViewModel() {

    //var counter = _counter
    //counter를 livedata로 대체
    var liveCounter: MutableLiveData<Int> = MutableLiveData(_counter)
    val modifiedCounter: LiveData<String> = Transformations.map(liveCounter){counter->
        "$counter 입니다."
    }

    var counter = savedStateHandle.get<Int>(SAVE_STATE_KEY) ?: _counter
    // 기본적으로 SAVE_STATE_KEY에서 값을 가져오지만, 그 값이 Null이면 _counter에서 가져오도록 한다.

    fun saveState(){
        /**
         * counter값을 저장하는 saveState
         */
        savedStateHandle.set(SAVE_STATE_KEY, counter)
    }

    companion object{
        private const val SAVE_STATE_KEY = "counter" // 저장과 복원에 사용할 SAVE_STATE_KEY
    }
}