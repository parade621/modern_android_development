package com.parade621.repositoryPatternBasic

import androidx.lifecycle.LiveData

interface MyRepository {
    fun getCounter(): LiveData<Int>
    fun increaseCounter()
}