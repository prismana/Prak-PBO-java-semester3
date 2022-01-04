package com.mainmodul.latihan;

public class Kendaraan {
    public static String merk = "Toyota", bahanBakar = "Fosil";
    public static int tahunProduksi = 2004;

    public static void infoKendaraan(){
        System.out.println("Merk kendaraan: " + merk + "\n" +
                        "Bahan bakar: " + bahanBakar + "\n" +
                        "Tahun produksi: " + tahunProduksi + "\n");
    }

}
