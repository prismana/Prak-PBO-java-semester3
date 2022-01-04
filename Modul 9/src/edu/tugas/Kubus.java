package edu.tugas;

public class Kubus extends AbstrakSatu{
    double sisi = 5;

    @Override
    public double volume() {
        return sisi * 3;
    }

    @Override
    public double luasPermukaan() {
        return sisi * 2;
    }
}
