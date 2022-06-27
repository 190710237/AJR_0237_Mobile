package com.amadeusryanwijayasetiawan.ajr_0237.model;public class Promo {
    private String kode_promo;
    private String keterangan;
    private int diskon;

    public Promo(String kode_promo, String keterangan, int diskon) {
        this.kode_promo = kode_promo;
        this.keterangan = keterangan;
        this.diskon = diskon;
    }

    public String getKode_promo() {
        return kode_promo;
    }

    public void setKode_promo(String kode_promo) {
        this.kode_promo = kode_promo;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public int getDiskon() {
        return diskon;
    }

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    public static Promo[] listPromo = {
            new Promo("WE10", "Weekly", 10),
            new Promo("KJT20", "Promo Kejutan", 20)
    };
}
