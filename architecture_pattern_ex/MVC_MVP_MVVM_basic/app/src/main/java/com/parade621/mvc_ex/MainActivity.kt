 package com.parade621.mvc_ex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.parade621.mvc_ex.databinding.ActivityMainBinding
import com.parade621.mvc_ex.mvc.controller.MvcLoginActivity
import com.parade621.mvc_ex.mvp.view.MvpLoginActivity
import com.parade621.mvc_ex.mvvm.view.MvvmLoginActivity

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
        binding.mvpBtn.setOnClickListener {
            val intent = Intent(this, MvpLoginActivity::class.java)
            startActivity(intent)
        }
        binding.mvvmBtn.setOnClickListener {
            val intent = Intent(this, MvvmLoginActivity::class.java)
            startActivity(intent)
        }

    }
}