package com.mainmodul.tugas.bangundatar;

public class PersegiPanjang extends BangunDatar{
    int panjang;
    double lebar;

    public void luasPersegiPanjang(int panjang, double lebar){
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + luas + " cm^2" + "\n");
    }
}
