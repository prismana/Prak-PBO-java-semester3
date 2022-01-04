package com.mainmodul.tugas.bangundatar;

public class Persegi extends BangunDatar{
    double sisi;

    public void luasPersegi(double sisi){
        luas = sisi * sisi;
        System.out.println("Luas persegi: " + luas + " cm^2" + "\n");
    }
}
