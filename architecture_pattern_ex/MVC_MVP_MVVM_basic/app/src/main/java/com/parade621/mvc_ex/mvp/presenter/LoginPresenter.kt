package com.parade621.mvc_ex.mvp.presenter

import com.parade621.mvc_ex.mvp.model.User

interface LoginPresenter {
    val user:User

    fun login()

}