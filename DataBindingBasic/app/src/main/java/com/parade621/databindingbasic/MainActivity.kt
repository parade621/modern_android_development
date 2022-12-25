package com.parade621.databindingbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.parade621.databindingbasic.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val factory = MyViewModelFactory(100, this)
        val myViewModel = ViewModelProvider(this, factory).get(MyViewModel::class.java)
        binding.textView.text = myViewModel.counter.toString()

        binding.btn.setOnClickListener {
            myViewModel.liveCounter.value = myViewModel.liveCounter.value?.plus(1)
        }
        myViewModel.modifiedCounter.observe(this){counter->
            binding.textView.text = counter.toString()
        }
    }
}