package com.example.apibottomsheetdialog.retrofit

import com.example.apibottomsheetdialog.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    // all_sports.php
    @GET("data.php")
    fun getData(): Call<MainModel>

}