package com.example.leetcode.page.home.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 *    author : zz
 *    e-mail : 1140143252@qq.com
 *    date   : 2022/1/19 18:18
 */
object HomeClient {
    private const val BASE_URL = ""

    private val okHttpClient = OkHttpClient.Builder()
        .callTimeout(30, TimeUnit.SECONDS)
        .build()

    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    val homeService: HomeService = retrofit.create(HomeService::class.java)
}