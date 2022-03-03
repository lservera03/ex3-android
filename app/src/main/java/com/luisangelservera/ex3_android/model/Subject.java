package com.luisangelservera.ex3_android.model;

import androidx.annotation.DrawableRes;

public class Subject {

    private String name;
    private int credits;
    private String description;
    @DrawableRes
    private int image;


    public Subject(String name, int credits, String description, @DrawableRes int image) {
        this.name = name;
        this.credits = credits;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getDescription() {
        return description;
    }
    
    public int getImage() {
        return image;
    }
}
