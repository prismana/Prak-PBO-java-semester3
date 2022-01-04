package edu.latihan;

public class JajarGenjang extends MethodAbstrak{
    double alas = 4.0, tinggi = 5.4, sisi1 = 8.0, sisi2 = 4.0;

    public double luas(){
        return alas * tinggi;
    }

    public double keliling(){
        return alas + tinggi + sisi2 + sisi1;
    }
}
