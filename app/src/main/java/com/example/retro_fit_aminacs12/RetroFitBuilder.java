package com.example.retro_fit_aminacs12;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitBuilder {

    public RetroFitBuilder() {
    }

    private static DoApi instance;
    public static DoApi getInstance(){
        if(instance == null){
            instance = initInstance();
        }
        return instance;
    }

    private static DoApi initInstance() {
        return new Retrofit
                .Builder()
                .baseUrl("https://www.boredapi.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(DoApi.class);
    }
}