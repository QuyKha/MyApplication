package com.example.myapplication;

import java.io.Serializable;

public class Food implements Serializable {
    private String title;
    private String description;
    private String prices;
    private int img;

    public Food(String title, String description, String prices, int img) {
        this.title = title;
        this.description = description;
        this.prices = prices;
        this.img = img;
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

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
