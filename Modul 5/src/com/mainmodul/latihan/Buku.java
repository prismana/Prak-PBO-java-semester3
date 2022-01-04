package com.mainmodul.latihan;

public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;

    public Buku(String judulBuku, String namaPengarang){
        this.judulBuku = judulBuku;
        this.namaPengarang = namaPengarang;
        System.out.println("Judul buku: " + judulBuku + "\n" +
                            "Nama Pengarang: " + namaPengarang+ "\n");
    }

    public Buku(String judulBuku, int tahunTerbit, int cetakanKe){
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        System.out.println("Judul buku: " + judulBuku + "\n" +
                            "Tahun terbit: " + tahunTerbit+"\n"+
                            "Cetakan ke: "+cetakanKe+"\n");
    }

    public Buku(String judulBuku, double hargaJual){
        this.judulBuku = judulBuku;
        this.hargaJual = hargaJual;
        System.out.println("Judul buku: " + judulBuku + "\n" +
                            "Harga jual: " + hargaJual + "\n");
    }
}
