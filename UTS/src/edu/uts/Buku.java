package edu.uts;

public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private int stok;

    public String getJudul() {
        return this.judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public int getTahunTerbit() {
        return this.tahunTerbit;
    }

    public int getStok() {
        return this.stok;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
