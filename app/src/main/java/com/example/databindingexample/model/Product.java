package com.example.databindingexample.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String title;
    private String description;
    private int image;
    private Double price;
    private int num_ratings;
    private Float rating;

    public Product() {
    }

    public Product(int id, String title, String description, int image, Double price, Float rating) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.image = image;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getNum_ratings() {
        return num_ratings;
    }

    public void setNum_ratings(int num_ratings) {
        this.num_ratings = num_ratings;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
}
