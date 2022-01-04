package com.tugasmodul.pekerjaanrumah.profesi;

public class Karyawan {
    String name, alamat, jabatan;
    double gaji;

    public void tampilkanNama(String name){
        this.name = name;
        System.out.println("Nama Karyawan: " + name);
    }

    public void tampilkanJabatan(String jabatan){
        this.jabatan = jabatan;
        System.out.println("Jabatan: " + jabatan);
    }

    public void tampilkanAlamat(String alamat){
        this.alamat = alamat;
        System.out.println("Alamat: " + alamat);
    }

    public void tampilkanGaji(double gaji){
        this.gaji = gaji;
        System.out.println("Gaji: " + gaji + "\n");
    }
}
