package com.parade621.mvvm_ex.presenter.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.viewModelFactory
import com.parade621.mvvm_ex.R
import com.parade621.mvvm_ex.databinding.ActivityLottoBinding

class LottoActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLottoBinding
    private lateinit var viewModel : LottoViewModel
    private lateinit var viewModelFactory: LottoViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_lotto)

        binding.run {
            viewmodel = LottoViewModel()
            drwNo=1000
        }
    }
}