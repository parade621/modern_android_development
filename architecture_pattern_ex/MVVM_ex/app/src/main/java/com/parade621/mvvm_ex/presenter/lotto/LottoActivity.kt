package com.parade621.mvvm_ex.presenter.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.parade621.mvvm_ex.R
import com.parade621.mvvm_ex.databinding.ActivityLottoBinding

class LottoActivity : AppCompatActivity() {

    private lateinit var binding:ActivityLottoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_lotto)

        binding.run{
            viewmodel = LottoViewModel() // ViewModel 할당
            drwNo = 1000 // 조회 할 로또의 회차
        }
    }
}