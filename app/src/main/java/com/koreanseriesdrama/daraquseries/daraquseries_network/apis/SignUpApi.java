package com.koreanseriesdrama.daraquseries.daraquseries_network.apis;

import com.koreanseriesdrama.daraquseries.daraquseries_network.model.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface SignUpApi {

    @GET("signup")
    Call<User> signUp(@Query("api_secret_key") String key,
                      @Query("email") String email, @Query("password") String password, @Query("name") String name);

}
