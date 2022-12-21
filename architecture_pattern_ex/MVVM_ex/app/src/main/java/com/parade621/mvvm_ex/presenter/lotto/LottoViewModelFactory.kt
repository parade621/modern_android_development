package com.parade621.mvvm_ex.presenter.lotto

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LottoViewModelFactory():ViewModelProvider.Factory{
    override fun <T: ViewModel> create(modelClass : Class<T>):T{
        if(modelClass.isAssignableFrom(LottoViewModel::class.java)){
            return LottoViewModel() as T
        }
        throw IllegalAccessException("Un")
    }
}