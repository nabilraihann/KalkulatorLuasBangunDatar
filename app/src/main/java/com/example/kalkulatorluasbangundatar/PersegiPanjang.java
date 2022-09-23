package com.example.kalkulatorluasbangundatar;

public class PersegiPanjang {
    public String hitungLuas(double panjang, double lebar) {
        String hasilLuas;

        double luas = panjang * lebar;

        hasilLuas = String.valueOf(luas);

        return hasilLuas + " m2";
    }
}
