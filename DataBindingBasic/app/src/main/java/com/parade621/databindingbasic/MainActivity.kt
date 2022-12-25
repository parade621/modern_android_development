package com.parade621.databindingbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.parade621.databindingbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val factory = MyViewModelFactory(10, this)
        val myViewModel : MyViewModel by viewModels { factory }

        binding.lifecycleOwner= this
        binding.viewmodel = myViewModel

        binding.textView.text = myViewModel.counter.toString()

        binding.btn.setOnClickListener {
            myViewModel.liveCounter.value = myViewModel.liveCounter.value?.plus(1)
        }
//        myViewModel.modifiedCounter.observe(this){counter->
//            binding.textView.text = counter.toString()
//        }
//        myViewModel.modifiedCounter.observe(this){counter->
//            binding.textView.text = counter
//        }
    }
}