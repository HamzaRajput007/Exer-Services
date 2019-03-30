package com.example.irfan.exerproject.Models;

public class ShopsModel {
    private String address;
    private int catId1;
    private int discount_percentage;
    private int id;
    private String name;

    public ShopsModel(int i, String str, int i2, String str2, int i3) {
        this.id = i;
        this.name = str;
        this.catId1 = i2;
        this.address = str2;
        this.discount_percentage = i3;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getCatId1() {
        return this.catId1;
    }

    public void setCatId1(int i) {
        this.catId1 = i;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public int getDiscount_percentage() {
        return this.discount_percentage;
    }

    public void setDiscount_percentage(int i) {
        this.discount_percentage = i;
    }
}
