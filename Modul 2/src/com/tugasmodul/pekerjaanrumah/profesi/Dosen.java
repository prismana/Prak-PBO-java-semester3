package com.tugasmodul.pekerjaanrumah.profesi;

public class Dosen {
    String nama, tglLahir, edu;
    int nik;

    public void tampilkanNama(String name){
        this.nama = name;
        System.out.println("Nama Dosen: " + name);
    }

    public void tampilkanPendidikan(String edu){
        this.edu = edu;
        System.out.println("Pendidikan: " + edu);
    }

    public void tampilkanTglLahir(String dateBirtdh){
        System.out.println("Tanggal lahir: " + dateBirtdh);
    }

    public void tampilkanNik(int nik){
        System.out.println("NIK: " + nik + "\n");
    }
}
