package com.example.autoserviceapp.retrofitInterfaceAPI;

import com.example.autoserviceapp.model.Order;
import com.example.autoserviceapp.model.User;
import com.example.autoserviceapp.model.Vehicle;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface JsonPlaceHolderApi {
    @Headers("Content-Type: application/x-www-form-urlencoded")
    @FormUrlEncoded
    @POST("home/login")
    Call<Integer> Login(@Field("email") String email,@Field("password") String password);

    @Headers("Content-Type: application/json")
    @POST("registration")
    Call<User> Registration(@Body User user);

    @Headers("Content-Type: application/json")
    @GET("home/userList")
    Call<List<User>> getUsersList();

    @Headers("Content-Type: application/json")
    @GET("home/userDetails/{id}")
    Call<User> getUserDetails(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("home/orderDetails/{id}")
    Call<Order> getOrderDetails(@Path("id") int id);

    @Headers("Content-Type: application/json")
    @GET("home/userDetailsName/{name}")
    Call<User> getUserDetailsByName(@Path("name") String username);

    @Headers("Content-Type: application/json")
    @POST("home/createOrder")
    Call<Order> createOrder(@Body Order order);

    @Headers("Content-Type: application/json")
    @POST("home/deleteUser")
    Call<User> deleteUser(@Body User user);

    @Headers("Content-Type: application/json")
    @PUT("home/updateUser")
    Call<User> updateUser(@Body User user);

    @Headers("Content-Type: application/json")
    @GET("home/vehicleList")
    Call<List<Vehicle>> getVehicleList();

    @Headers("Content-Type: application/json")
    @POST("home/createVehicle")
    Call<Vehicle> createVehicle(@Body Vehicle vehicle);

    @Headers("Content-Type: application/json")
    @GET("home/orderList")
    Call<List<Order>> getOrderList();

    @Headers("Content-Type: application/json")
    @POST("home/updateOrder")
    Call<Order> updateOrder(@Body Order order);
}
