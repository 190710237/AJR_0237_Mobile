package com.amadeusryanwijayasetiawan.ajr_0237.model;

public class User {
    private int id;
    private String email;
    private String password;
    private String nama;
    private String access_level;
    private String remember_token;

    public User(int id, String email, String password, String nama, String access_level, String remember_token) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nama = nama;
        this.access_level = access_level;
        this.remember_token = remember_token;
    }

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    public User() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAccess_level() {
        return access_level;
    }

    public void setAccess_level(String access_level) {
        this.access_level = access_level;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }
}
