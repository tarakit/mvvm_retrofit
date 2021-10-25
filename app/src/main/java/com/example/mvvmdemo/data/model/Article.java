package com.example.mvvmdemo.data.model;

import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("_id")
    private String id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
