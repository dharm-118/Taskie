package com.raywenderlich.android.taskie.networking

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.POST
import okhttp3.Call as Call

interface RemoteApiService{

    @POST("/api/register")
    fun registerUser(@Body request : RequestBody):retrofit2.Call<ResponseBody>
}