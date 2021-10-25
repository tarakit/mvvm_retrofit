package com.example.mvvmdemo.ui.home;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvmdemo.data.apiResponse.ArticleResponse;
import com.example.mvvmdemo.data.repository.ArticleRepository;

public class ArticleViewModel extends ViewModel {

    MutableLiveData<ArticleResponse> mutableLiveData;
    private ArticleRepository articleRepository;

    public void init(){
        articleRepository = ArticleRepository.newInstance();
    }

    public MutableLiveData<ArticleResponse> getArticles(){
        mutableLiveData = articleRepository.getArticles();
        return mutableLiveData;
    }
}
