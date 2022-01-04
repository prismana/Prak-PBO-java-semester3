package edu.latihan;

public class Elang extends Pet{
    @Override
    public String perilaku() {
        return "Kecepatan terbang mencapai Mach 1";
    }

    public void jalan(){
        System.out.println("Elang Terbang\n");
    }
}
