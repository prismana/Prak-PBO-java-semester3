package edu.tugas;

public class CustomerData {
    String nama, alamat, pekerjaan, tanggalLahir;
    float gaji;

    public CustomerData(String nama, String alamat, String pekerjaan, float gaji, String tanggalLahir){
        this.nama = nama;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
        this.tanggalLahir = tanggalLahir;
        this.gaji = gaji;
    }

    public void infoCustomer(){
        System.out.println("Nama: " + nama + ", " +
                "Alamat: " + alamat + ", " +
                "Pekerjaan: " + pekerjaan + ", " +
                "Tanggal Lahir: " + tanggalLahir + ", " +
                "Gaji: " + gaji);
    }
}
