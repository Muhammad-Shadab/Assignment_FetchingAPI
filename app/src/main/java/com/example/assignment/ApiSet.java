package com.example.assignment;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiSet {

    @GET("users")
    Call<Response> getResponse();


}
