package com.parade621.mvvm_ex.presenter.lotto

import androidx.databinding.BaseObservable
import androidx.databinding.Observable
import androidx.databinding.ObservableField
import com.parade621.mvvm_ex.data.model.LottoEntity
import com.parade621.mvvm_ex.data.repository.lotto.LottoRepository

class LottoViewModel : BaseObservable() {

    //View에 표현 될, 로또 당첨 정보 문자열
    val lottoInfo = ObservableField<String>()

    /**
     * 로또 정보 조회
     * @param drwNo 회차
     */
    fun getLottoInfo(drwNo: Int) {
        LottoRepository.getLottoInfo(drwNo, object : LottoRepository.GetDataCallback<LottoEntity> {
            override fun onSuccess(data: LottoEntity?) {
                data?.let {
                    val results = "${it.drwNo}회차 당첨번호 : " +
                            "${it.drwtNo1}, ${it.drwtNo2}, ${it.drwtNo3}, ${it.drwtNo4}, ${it.drwtNo5}, ${it.drwtNo6} + ${it.bnusNo}"
                    lottoInfo.set(results)
                }
            }

            override fun onFailure(throwable: Throwable) {
                throwable.printStackTrace()
            }
        })
    }
}
