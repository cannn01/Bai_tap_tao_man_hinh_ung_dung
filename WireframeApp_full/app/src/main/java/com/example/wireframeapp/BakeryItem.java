package com.example.wireframeapp;

public class BakeryItem {
    private String name;
    private int imageRes;

    public BakeryItem(String name, int imageRes) {
        this.name = name;
        this.imageRes = imageRes;
    }

    public String getName() { return name; }
    public int getImageRes() { return imageRes; }
}
