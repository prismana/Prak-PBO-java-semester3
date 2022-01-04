package com.accesmodifier.umum;

public class PublicModifier {
    public int a=2, b=5, c=9;

    public void kali(){
        int d = a * b * c;
        System.out.println("Hasil kali: " + d);
    }
    public void tambah(){
        int e = a + b + c;
        System.out.println("Hasil tambah: " + e);
    }
    public void kurang(){
        int f = a - b - c;
        System.out.println("Hasil kurang: " + f);
    }
    public void bagi(){
        int g = a / b / c;
        System.out.println("Hasil bagi: " + g);
    }
    public void mean(){
        int h = (a + b + c) / 3;
        System.out.println("Rata-rata: " + h);
    }
}
