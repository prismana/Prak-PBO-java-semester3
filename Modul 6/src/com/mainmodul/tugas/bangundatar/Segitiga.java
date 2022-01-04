package com.mainmodul.tugas.bangundatar;

public class Segitiga extends BangunDatar{
    double alas, tinggi;

    public void luasSegitiga(double alas, double tinggi){
        luas = (alas * tinggi) /2;
        System.out.println("Luas Segitiga: " + luas + " cm^2" + "\n");
    }
}
