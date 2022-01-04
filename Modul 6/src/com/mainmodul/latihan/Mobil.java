package com.mainmodul.latihan;

public class Mobil extends Kendaraan{
    public static short jumlahKursi = 4;
    public static String bahanBakar;

    public static void infoMobil(String bahanBakar){
        System.out.println("Jumlah kursi mobil: " + jumlahKursi + "\n" +
                            "Bahan bakar: " + bahanBakar + "\n");
    }
}
