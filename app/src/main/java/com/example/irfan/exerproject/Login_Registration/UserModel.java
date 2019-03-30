package com.example.irfan.exerproject.Login_Registration;

public class UserModel {
    private String address;
    private String city;
    private String email;
    private int id;
    private String name;
    private String phone;
    private String unique_id;

    public UserModel(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = i;
        this.unique_id = str;
        this.name = str2;
        this.email = str3;
        this.city = str4;
        this.address = str5;
        this.phone = str6;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int i) {
        this.id = i;
    }

    public String getUnique_id() {
        return this.unique_id;
    }

    public void setUnique_id(String str) {
        this.unique_id = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String str) {
        this.email = str;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String str) {
        this.phone = str;
    }
}
