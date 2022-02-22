package com.apripandu.infocovid_19.api

import com.apripandu.infocovid_19.model.IndonesiaResponse
import com.apripandu.infocovid_19.model.ProvinceResponse
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET ("casenumber.json")
    fun getIndonesia(): Call<ArrayList<IndonesiaResponse>>

    @GET ("casenumberprovince.json")
    fun getProvince(): Call<ArrayList<ProvinceResponse>>
}