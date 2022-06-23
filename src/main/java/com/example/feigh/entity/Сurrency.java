package com.example.feigh.entity;

public class Сurrency {
private String name;
private double meaning;

    public Сurrency() {
    }

    public Сurrency(String name, double meaning) {
        this.name = name;
        this.meaning = meaning;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMeaning() {
        return meaning;
    }

    public void setMeaning(double meaning) {
        this.meaning = meaning;
    }
}
