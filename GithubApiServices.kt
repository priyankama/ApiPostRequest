package com.example.apicalling

import retrofit2.http.GET
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface GithubApiServices {

    @FormUrlEncoded
    @POST("posts")
    fun getData(@Field("postId") postId : String):  Observable<List<JsonFile>>

}