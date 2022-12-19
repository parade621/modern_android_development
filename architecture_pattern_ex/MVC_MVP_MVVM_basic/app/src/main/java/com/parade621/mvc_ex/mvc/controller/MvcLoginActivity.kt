package com.parade621.mvc_ex.mvc.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.parade621.mvc_ex.R
import com.parade621.mvc_ex.databinding.ActivityMvcLoginBinding
import com.parade621.mvc_ex.mvc.model.User

class MvcLoginActivity : AppCompatActivity() {

    private val binding : ActivityMvcLoginBinding by lazy{
        ActivityMvcLoginBinding.inflate(layoutInflater)
    }
    private lateinit var user : User

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        // 레이아웃 처리
        setContentView(binding.root)

        user = User()

        // 프레젠테이션 로직
       binding.included.loginBtn.setOnClickListener {
            val isLoginSuccessful = user.login(
                binding.included.etUserName.text.toString(),
                binding.included.etPassword.text.toString(),
            )

            if(isLoginSuccessful){
                Toast.makeText(this@MvcLoginActivity, "${user.userName} Login Succesful", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this@MvcLoginActivity, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}