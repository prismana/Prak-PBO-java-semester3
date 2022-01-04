package edu.tugas;

public class PrismaSegitiga extends AbstrakSatu{
    double alas = 3.6, tinggiPrisma = 4.5, tinggi = 5;

    @Override
    public double volume() {
        return luasPermukaan() * tinggi;
    }

    @Override
    public double luasPermukaan() {
        return alas * tinggi / 2;
    }
}
