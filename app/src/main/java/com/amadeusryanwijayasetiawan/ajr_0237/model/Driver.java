package com.amadeusryanwijayasetiawan.ajr_0237.model;public class Driver {
    private String nama, email;
    private String status;

    public Driver(String nama, String email, String status) {
        this.nama = nama;
        this.email = email;
        this.status = status;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
