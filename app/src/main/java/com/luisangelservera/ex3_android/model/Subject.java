package com.luisangelservera.ex3_android.model;

public class Subject {

    private String name;
    private int credits;
    private String description;


    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
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
}
