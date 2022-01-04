package Latihan2;

public class LocalVariabel2 {

    int usia = 19;

    public void HitungUsia(){
        int usia = 0, tahunLahir = 2001, tahunSekarang = 2021;

        usia = tahunSekarang - tahunLahir;

        System.out.println("Usia: " + usia + " Tahun");
    }

    public void BeratBadan(){
        double beratLahir = 3.1, beratBadan;

        beratBadan = beratLahir + (usia/2);

        System.out.println("Berat badan: " + beratBadan + " Kg");
    }
}
