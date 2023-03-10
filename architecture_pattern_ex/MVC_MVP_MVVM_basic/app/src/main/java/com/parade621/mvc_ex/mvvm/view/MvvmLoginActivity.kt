package com.parade621.mvc_ex.mvvm.view

import android.database.Observable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.parade621.mvc_ex.databinding.ActivityMvvmLoginBinding
import com.parade621.mvc_ex.mvvm.viewmodel.LoginViewModel

class MvvmLoginActivity : AppCompatActivity() {

    private val binding:ActivityMvvmLoginBinding by lazy{
        ActivityMvvmLoginBinding.inflate(layoutInflater)
    }
    private lateinit var loginViewModel : LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.included.loginBtn.setOnClickListener {
            loginViewModel.login(
                binding.included.etUserName.text.toString(),
                binding.included.etPassword.text.toString(),
            )
        }
        loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)
        loginViewModel.isLoginSuccessfulFlag.observe(this, loginObserver)
    }

    // 데이터 바인딩
    private val loginObserver = Observer<Boolean> { isLoginSuccessful->
        if(isLoginSuccessful){
            Toast.makeText(this@MvvmLoginActivity, loginViewModel.userName +"Login Sucessful",
            Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this@MvvmLoginActivity, "Login Failed",
                Toast.LENGTH_SHORT).show()
        }
    }
}