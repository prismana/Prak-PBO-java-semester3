package edu.tugas;

public class Kerucut extends AbstrakSatu{
    double r = 4, phi = 3.14, alas = 3, tinggi = 8;

    @Override
    public double volume() {
        return luasPermukaan() * tinggi / 3;
    }

    @Override
    public double luasPermukaan() {
        return phi * r * r;
    }
}
