package com.example.wireframeapp;

public class BakeryItem {
    private String name;
    private int imageResId;

    public BakeryItem(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}
