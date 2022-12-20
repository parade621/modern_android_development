package com.parade621.mvvm_ex.data.repository.lotto

import com.parade621.mvvm_ex.data.model.LottoEntity
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Retrofit Interface
 */
interface LottoService {

    /**
     * 로또 정보 조회
     */
    @GET("/common.do?method=getLottoNumber")
    fun getLottoInfo(@Query("drwNo") drwNo: Int): Call<LottoEntity>
}