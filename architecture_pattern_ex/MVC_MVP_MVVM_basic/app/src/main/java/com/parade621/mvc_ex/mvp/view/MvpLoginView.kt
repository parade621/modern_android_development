package com.parade621.mvc_ex.mvp.view

interface MvpLoginView {
    val userName : String?
    val password : String?

    fun onLoginResult(isLoginSuccess: Boolean?)
}