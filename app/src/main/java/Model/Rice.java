package com.nguyenducthang.test.Model;

import java.io.Serializable;

public class Rice implements Serializable {
    String placeName;
    String dishName;
    int photo;
    double ratingValue;
    String ratingCount;
    String address;

    public Rice() {
    }

    public Rice(String placeName, String dishName, int photo, double ratingValue, String ratingCount, String address) {
        this.placeName = placeName;
        this.dishName = dishName;
        this.photo = photo;
        this.ratingValue = ratingValue;
        this.ratingCount = ratingCount;
        this.address = address;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public double getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(double ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getRatingCount() {
        return ratingCount;
    }

    public void setRatingCount(String ratingCount) {
        this.ratingCount = ratingCount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}