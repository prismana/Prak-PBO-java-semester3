package edu.latihan;

public class Pet {
    private String nama;

    public void beriNama(String beriNama){
        this.nama = beriNama;
    }

    public String panggilNama() {
        return this.nama;
    }

    public String perilaku(){
        return "Hewan Penurut";
    }
}
