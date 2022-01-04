package edu.latihan;

public class Segitiga extends MethodAbstrak{
    double sisi = 5, tinggi = 6.7;

    public double luas(){
        return (sisi * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return sisi * 3;
    }
}
