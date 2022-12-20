package com.parade621.mvvm_ex.data.model

import com.google.gson.annotations.SerializedName

/**
 * 로또 정보 데이터 클래스.
 */

data class LottoEntity(
    @field:SerializedName("totSellamnt")
    val totSellamnt: Long? = null,

    @field:SerializedName("returnValue")
    val returnValue: Long? = null,

    @field: SerializedName("drwNoData")
    val drwNoData: String? = null,

    @field: SerializedName("firstWinamnt")
    val firstWinamnt: Long? = null,

    @field: SerializedName("firstPrzwnerCo")
    val firstPrzwnerCo: Int? = null,

    @field: SerializedName("firstAccumamnt")
    val firstAccumamnt: Long? = null,

    @field: SerializedName("drwNo")
    val drwNo: Int? = null,

    @field: SerializedName("bnusNo")
    val bnusNo: Int? = null,

    @field: SerializedName("drwNo6")
    val drwNo6: Int? = null,

    @field: SerializedName("drwNo5")
    val drwNo5: Int? = null,

    @field: SerializedName("drwNo4")
    val drwNo4: Int? = null,

    @field: SerializedName("drwNo3")
    val drwNo3: Int? = null,

    @field: SerializedName("drwNo2")
    val drwNo2: Int? = null,

    @field: SerializedName("drwNo1")
    val drwNo1: Int? = null
)