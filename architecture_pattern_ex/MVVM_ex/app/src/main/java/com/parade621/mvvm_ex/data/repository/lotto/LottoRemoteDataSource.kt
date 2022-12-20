package com.parade621.mvvm_ex.data.repository.lotto

import android.util.Log
import com.parade621.mvvm_ex.data.model.LottoEntity
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * 로또 조회 API Remote DataSource
 */
object LottoRemoteDataSource {
    private val retrofit by lazy {

        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        val client = OkHttpClient.Builder()
            .addInterceptor(logging)
            .build()

        Retrofit.Builder()
            .baseUrl("https://www.dhlottery.co.kr")
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
    private val lottoService = retrofit.create(LottoService::class.java)


    /**
     * 로또 당첨 정보 조회
     */
    fun getLottoInfo(drwNo: Int, callback: LottoRepository.GetDataCallback<LottoEntity>) {
        lottoService.getLottoInfo(drwNo).enqueue(object : Callback<LottoEntity> {
            override fun onResponse(call: Call<LottoEntity>, response: Response<LottoEntity>) {
                if (response.isSuccessful) {
                    callback.onSuccess(response.body())
                }
            }

            override fun onFailure(call: Call<LottoEntity>, t: Throwable) {
                callback.onFailure(t)
            }
        })
    }
}