package com.grocet.model;

public class GridModel {

    private String title;
    private int imageResId;

    public GridModel(String title, int imageResId) {
        this.title = title;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public int getImageResId() {
        return imageResId;
    }
}
