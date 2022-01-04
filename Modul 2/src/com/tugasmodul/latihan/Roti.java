package com.tugasmodul.latihan;

public class Roti {
    String warna, rasa;
    int berat;
    double harga;

    public void beriWarna(String warnaRoti){
        warna = warnaRoti;
    }

    public void beriRasa(String beriRasa){
        rasa = beriRasa;
    }

    public void timbangBerat(int beratRoti){
        berat = beratRoti;
    }

    public void hargaJual(double hargaRoti){
        harga = hargaRoti;
    }

    public void rotiInfo(){
        System.out.println(
                "Warna roti: " + warna + "\n" +
                "Rasa roti: " + rasa + "\n" +
                "Berat roti: " + berat + "\n" +
                "Harga roti: " + harga + "\n");
    }
}
