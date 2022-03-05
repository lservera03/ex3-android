package com.luisangelservera.ex3_android.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

public class Subject {

    @StringRes
    private int name;
    private int credits;
    @StringRes
    private int description;
    @DrawableRes
    private int image;


    public Subject(@StringRes int name, int credits, @StringRes int description, @DrawableRes int image) {
        this.name = name;
        this.credits = credits;
        this.description = description;
        this.image = image;
    }

    public int getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public int getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
