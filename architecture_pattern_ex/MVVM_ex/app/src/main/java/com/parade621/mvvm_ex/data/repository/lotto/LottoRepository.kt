package com.parade621.mvvm_ex.data.repository.lotto

import com.parade621.mvvm_ex.data.model.LottoEntity

/**
 * 로또 데이터 리파지토리
 *
 * DataSource로 부터 Model을 가져오는 것을 추상화하는 역할
 */
object LottoRepository {

    private val remoteDataSource = LottoRemoteDataSource

    /**
     * 로또 당첨 정보 조회
     */
    fun getLottoInfo(drwNo: Int, callback: GetDataCallback<LottoEntity>) {
        remoteDataSource.getLottoInfo(drwNo, callback)
    }

    /**
     * 데이터 조회 콜백
     */
    interface GetDataCallback<T> {
        fun onSuccess(data: T?)
        fun onFailure(throwable: Throwable)

    }
}