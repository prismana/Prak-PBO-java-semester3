package com.tugasmodul.pekerjaanrumah.profesi;

public class Mahasiswa {
    String nama, nim, alamat;
    int semester;

    public void tampilkanNama(String nama){
        this.nama = nama;
        System.out.println("Nama Mahasiswa: " + nama);
    }

    public void tampilkanNim(String nim){
        this.nim = nim;
        System.out.println("NIM: " + nim);
    }

    public void tampilkanAlamat(String alamat){
        this.alamat = alamat;
        System.out.println("Alamat: " + alamat);
    }

    public void tampilkanSemester(int semester){
        this.semester = semester;
        System.out.println("Semester: " + semester + "\n");
    }
}
