package com.parade621.repositoryPatternBasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.parade621.repositoryPatternBasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val myRepositoryImpl = MyRepositoryImpl(10)


        val factory = MyViewModelFactory(10, myRepositoryImpl, this)
        val myViewModel : MyViewModel by viewModels { factory }

        binding.lifecycleOwner= this
        binding.viewmodel = myViewModel

        binding.textView.text = myViewModel.counter.toString()

        binding.btn.setOnClickListener {
            //myViewModel.liveCounter.value = myViewModel.liveCounter.value?.plus(1)
            myViewModel.increaseCounter()
        }
    }
}