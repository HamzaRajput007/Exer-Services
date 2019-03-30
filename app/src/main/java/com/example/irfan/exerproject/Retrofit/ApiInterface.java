package com.example.irfan.exerproject.Retrofit;

import com.example.irfan.exerproject.Retrofit.Models.RegisterResponse;
import com.example.irfan.exerproject.Retrofit.Models.UserModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("exerClient/login.php")
    Call<UserModel> mUserResponse(@Query("user_email") String mUserEmail, @Query("user_password") String mUserPassword);

    @GET("exerClient/register.php")
    Call<RegisterResponse> mRegisterResponse(@Query("user_email") String mUserEmail, @Query("user_password") String mUserPassword,
                                             @Query("user_name") String mUserName);
}
