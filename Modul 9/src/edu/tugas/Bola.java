package edu.tugas;

public class Bola extends AbstrakSatu{
    double r = 6, phi = 3.14;

    @Override
    public double volume() {
        return 3 * phi * r * r * r/4;
    }

    @Override
    public double luasPermukaan() {
        return 4 * phi * r * r;
    }
}
