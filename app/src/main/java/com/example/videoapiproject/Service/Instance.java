package com.example.videoapiproject.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Instance {

    static VideoApi videoApi;

    public static VideoApi getVideoApi()
    {
        if(videoApi==null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://pixabay.com/api/videos/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            videoApi = retrofit.create(VideoApi.class);
        }
        return videoApi;
    }
}
