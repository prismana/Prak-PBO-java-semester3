package com.mainmodul.latihan;

public class Pesawat extends Kendaraan{
    public static short kapasitas = 124;
    public static String bahanBakar;

    public static void infoPesawat(String bahanBakar){
        System.out.println("Kapasitas penumpang: " + kapasitas + "\n" +
                            "Bahan bakar: " + bahanBakar + "\n");
    }
}
