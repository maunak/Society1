package com.project.loginandregistration.model;

import com.google.gson.annotations.SerializedName;

public class UserData {


    @SerializedName("name")
    public String name;

    @SerializedName("email")
    public String email;

    public UserData(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
