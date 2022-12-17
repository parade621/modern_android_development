 package com.parade621.mvc_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.parade621.mvc_ex.databinding.ActivityMainBinding
import com.parade621.mvc_ex.mvc.controller.MvcLoginActivity

 class MainActivity : AppCompatActivity() {

    private val binding : ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.mvcBtn.setOnClickListener {
            val intent = Intent(this, MvcLoginActivity::class.java)
            startActivity(intent)
        }

    }
}