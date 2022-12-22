package com.parade621.applyviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.parade621.applyviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding:ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        var counter = 100
        binding.textView.text = counter.toString()

        binding.btn.setOnClickListener {
            counter += 1
            binding.textView.text = counter.toString()
        }
    }
}