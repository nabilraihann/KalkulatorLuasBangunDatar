package com.example.kalkulatorluasbangundatar;

public class Segitiga {
    public String hitungLuas(double alas, double tinggi) {
        String hasilLuas;

        double luas = (alas * tinggi) / 2;

        hasilLuas = String.valueOf(luas);

        return hasilLuas + " m2";
    }
}
