package com.example.mvvmdemo.data.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.example.mvvmdemo.data.apiResponse.ArticleResponse;
import com.example.mvvmdemo.data.service.ArticleService;
import com.example.mvvmdemo.data.service.RetrofitService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ArticleRepository {

    private String TAG = ArticleRepository.class.getSimpleName();
    private static ArticleRepository articleRepository;
    private ArticleService articleService;

    public static ArticleRepository newInstance(){
        if (articleRepository == null){
            articleRepository = new ArticleRepository();
        }
        return articleRepository;
    }

    public ArticleRepository() {
        articleService = RetrofitService.createService(ArticleService.class);
    }

    public MutableLiveData<ArticleResponse> getArticles(){
        MutableLiveData<ArticleResponse> liveData = new MutableLiveData<>();
        articleService.getAllArticles().enqueue(new Callback<ArticleResponse>() {
            @Override
            public void onResponse(Call<ArticleResponse> call, Response<ArticleResponse> response) {
//                Log.d(TAG, "onResponse: "+ Success);
                if(response.isSuccessful())
                    // TODO fix error here
                    liveData.setValue(response.body());
//                    liveData.postValue(response.body());
            }

            @Override
            public void onFailure(Call<ArticleResponse> call, Throwable t) {
                Log.d(TAG, "onFailure: "+ t.getMessage());
                liveData.setValue(null);
            }
        });
        return liveData;
    }
}
