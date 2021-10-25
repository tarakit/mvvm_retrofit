package com.example.mvvmdemo.ui.home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.mvvmdemo.R;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    private ArticleViewModel articleViewModel;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialized Views
//        initView();

        // Initialized View Models
        articleViewModel = ViewModelProviders.of(this).get(ArticleViewModel.class);
        articleViewModel.init();

        // TODO : Client's Request to see all Articles
        articleViewModel.getArticles().observe(this, articleResponse -> {
            Log.d(TAG, "onCreate: "+ articleResponse.getArticleList().toString());
//            setDataToRecyclerView(articleResponse.getArticleList());
        });
    }

//    private void initView() {
//        recyclerView = findViewById(R.id.idasdf);
//    }

//    private void setDataToRecyclerView(List<Article> articleList) {
//
//        recyclerview.setAdapter(adapter);
//    }
//
//    private void handleOnButtonRemoveClicked(){
//        articleViewModel.updateArticle().observer(){
//
//        };
//    }
}