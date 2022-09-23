package com.example.kalkulatorluasbangundatar;

public class Persegi {
    public String hitungLuas(double sisi) {
        String hasilLuas;

        double luas = Math.pow(sisi, 2);

        hasilLuas = String.valueOf(luas);

        return hasilLuas + " m2";
    }
}
