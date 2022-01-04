package edu.tugas;

public class Balok extends AbstrakSatu{
    double panjang = 5, lebar = 4, tinggi = 7.4;

    @Override
    public double volume() {
        return panjang * lebar * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return panjang * lebar;
    }
}
