package com.example.mvvmdemo.data.service;

import com.example.mvvmdemo.data.apiResponse.ArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ArticleService {

    @GET("articles")
    Call<ArticleResponse> getAllArticles();
}
