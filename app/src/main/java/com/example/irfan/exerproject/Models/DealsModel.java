package com.example.irfan.exerproject.Models;

public class DealsModel {
    String title;
    String description;
    String dicount;
    String original_price;

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

    public String getDicount() {
        return dicount;
    }

    public void setDicount(String dicount) {
        this.dicount = dicount;
    }

    public String getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(String original_price) {
        this.original_price = original_price;
    }

    public DealsModel(String title, String description, String dicount, String original_price) {
        this.title = title;
        this.description = description;
        this.dicount = dicount;
        this.original_price = original_price;
    }
}
