package com.example.mobsys04.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {
    @GET("posts")
    Call<List<Post>> getPost();
}
