package com.example.videoapiproject.Service;

import com.example.videoapiproject.VideoModel.Root;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Pixelbaby {

    @GET("?key=18485933-960814ba32190eaa131da2a5c")
    Call<Root> getAllImage();
}
