package com.tugasmodul.latihan;

public class BankAccount {
    public double saldo;
    public int accountNumber;

    public void cek_saldo(){
        System.out.println("Saldo sekarang: " + saldo + " Rupiah");
    }

    public void menabung(double nominalTabung){
        saldo += nominalTabung;
        System.out.println("Anda menabung sebesar " + nominalTabung + " Rupiah");
    }

    public void menarik(double jumlahTarik){
        saldo -= jumlahTarik;
        System.out.println("Anda telah menarik sebesar " + jumlahTarik + " dari saldo anda");
    }

    public void transfer(double nominalTransfer){
        saldo += nominalTransfer;
        System.out.println("Anda telah mentransfer sebesar " + nominalTransfer   + "ke saldo anda");
    }
}
