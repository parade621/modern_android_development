package com.parade621.mvc_ex.mvp.presenter

import com.parade621.mvc_ex.mvp.model.User
import com.parade621.mvc_ex.mvp.view.MvpLoginView

class LoginPresenterImpl(
    private val mvpLoginView : MvpLoginView
    ):LoginPresenter {

    // Model로 부터 데이터 취득득
   override val user: User
        get() = User()

    override fun login() {
        // View에 데이터 전달
        val userName = mvpLoginView.userName.toString()
        val password = mvpLoginView.password.toString()
        val isLoginSuccessful : Boolean = user.login(userName, password)

        mvpLoginView.onLoginResult(isLoginSuccessful)
    }

}