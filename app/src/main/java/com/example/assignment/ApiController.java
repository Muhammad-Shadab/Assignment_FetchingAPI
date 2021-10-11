package com.example.assignment;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiController {

    private static final String url = "https://gorest.co.in/public-api/";
    private static ApiController instance;
    private static Retrofit retrofit;


    ApiController(){
        retrofit = new Retrofit.Builder().baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create()).build();
    }
    public static synchronized ApiController getInstance()
    {
        if (instance==null)
        {
            instance = new ApiController();
        }
        return instance;
    }

    ApiSet apiSet(){
        return  retrofit.create(ApiSet.class);
    }


}
