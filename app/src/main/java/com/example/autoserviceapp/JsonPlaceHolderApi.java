package com.example.autoserviceapp;

import com.example.autoserviceapp.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {
    @POST("home/login")
    Call<User> Loggin(@Body User user);


    @Headers("Content-Type: application/json")
    @POST("registration")
    Call<User> Registration(@Body User user);

    @GET("home/userList")
    Call<List<User>> getUsersList();
}