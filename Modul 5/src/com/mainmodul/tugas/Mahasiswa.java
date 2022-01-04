package com.mainmodul.tugas;

public class Mahasiswa {

    String nama = "Rahdriawan", nim = "L200200301", fakultas = "FKI";
    short semester = 3;

    public Mahasiswa(){
        System.out.println("=== Output di default konstruktor ===" + "\n" + "Nama: " + nama + "\n" +
                "Nim: " + nim + "\n" +
                "Fakultas: " + fakultas + "\n" +
                "Semester: " + semester + "\n");
    }

    public Mahasiswa(String nama, String nim, String fakultas, short semester){
        this.nama = nama;
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
    }

    public void infoMahasiswa(){
        System.out.println("=== Output di parameterized konstruktor ===" + "\n" +
                "Nama: " + nama + "\n" +
                "Nim: " + nim + "\n" +
                "Fakultas: " + fakultas + "\n" +
                "Semester: " + semester + "\n");
    }
}
