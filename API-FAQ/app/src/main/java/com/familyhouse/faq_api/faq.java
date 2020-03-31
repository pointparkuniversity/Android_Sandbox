package com.familyhouse.faq_api;


import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Body;
import retrofit2.http.POST;

interface Faq {

    //Get and Posts located here
    @GET("/posts/")
    Call<ResponseBody> getPosts(@Body RequestBody requestBody);

    @GET("/users/")
    Call<ResponseBody> getUsers(@Body RequestBody requestBody);

    @POST("/users/")
    Call<ResponseBody> postUser(@Body RequestBody requestBody);

}
