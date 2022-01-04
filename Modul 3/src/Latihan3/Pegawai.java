package Latihan3;

public class Pegawai {

    String nama;
    int nip;
    double gaji;

    public void infoPegawai(String nama, int nip, double gaji){
        this.nama = nama;
        this.nip = nip;
        this.gaji = gaji;

        System.out.print("Nama: " + this.nama);
        System.out.print(" ,NIP: " + this.nip);
        System.out.println(" ,Gaji: " + this.gaji);
    }
}
