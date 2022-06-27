package com.amadeusryanwijayasetiawan.ajr_0237.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserResponse {
    private String message;

    //TODO : recheck serialized name with db

    @SerializedName("user")
    private User user;

    private String access_token;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}
