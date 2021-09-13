package com.example.apibottomsheetdialog.retrofit

import com.example.apibottomsheetdialog.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("all_sports.php")
    fun getData(): Call<MainModel>

}