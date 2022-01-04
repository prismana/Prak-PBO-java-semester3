package com.mainmodul;

import com.mainmodul.latihan.*;
import com.mainmodul.tugas.bangundatar.*;
import com.mainmodul.tugas.bangundatar.segitiga.*;

public class Main {
    public static void main(String[] args) {

        //Latihan
        Kendaraan.infoKendaraan();
        Mobil.infoMobil("Bensin");
        Pesawat.infoPesawat("Avtur");

        //Tugas
        BangunDatar bangun1 = new BangunDatar();
        bangun1.hitungLuas(45);
        bangun1.hitungKeliling(54);

        Persegi persegi = new Persegi();
        persegi.luasPersegi(3);

        Segitiga segi3 = new Segitiga();
        segi3.luasSegitiga(4, 7);

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.luasPersegiPanjang(12, 4.5);

        SegigitaSamaSisi segi3samSi = new SegigitaSamaSisi();
        segi3samSi.kelilingSegitigaSamaSisi(6.7);
    }
}
