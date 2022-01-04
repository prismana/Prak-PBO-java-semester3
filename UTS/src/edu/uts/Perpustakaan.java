package edu.uts;

public class Perpustakaan {
    public static void main(String[] args) {
        Buku buku1 = new Buku();
        Buku buku2 = new Buku();
        Buku buku3 = new Buku();
        Buku buku4 = new Buku();

        buku1.setJudul("OO Programming Using Java");
        buku1.setPengarang("S Kendal");
        buku1.setTahunTerbit(2018);
        buku1.setStok(2);

        buku2.setJudul("Dasar Teknik Informatika");
        buku2.setPengarang("Novel Pratama");
        buku2.setTahunTerbit(2018);
        buku2.setStok(3);

        buku3.setJudul("Komputer Cerdas");
        buku3.setPengarang("Nurul Nafiyah");
        buku3.setTahunTerbit(2020);
        buku3.setStok(3);

        buku4.setJudul("Pengantar Teknologi Informasi");
        buku4.setPengarang("Muslim Ridho");
        buku4.setTahunTerbit(2017);
        buku4.setStok(5);

        System.out.println("Judul Buku = " + buku1.getJudul() + "\n"
                + "Pengarang = " + buku1.getPengarang() + "\n"
                + "Tahun Terbit = " + buku1.getTahunTerbit() + "\n"
                + "Tersedia = " + buku1.getStok() +" buku"+ "\n");
        System.out.println("Judul Buku = " + buku2.getJudul() + "\n"
                + "Pengarang = " + buku2.getPengarang() + "\n"
                + "Tahun Terbit = " + buku2.getTahunTerbit() + "\n"
                + "Tersedia = " + buku2.getStok() +" buku"+ "\n");
        System.out.println("Judul Buku = " + buku3.getJudul() + "\n"
                + "Pengarang = " + buku3.getPengarang() + "\n"
                + "Tahun Terbit = " + buku3.getTahunTerbit() + "\n"
                + "Tersedia = " + buku3.getStok() +" buku"+ "\n");
        System.out.print("Judul Buku = " + buku4.getJudul() + "\n"
                + "Pengarang = " + buku4.getPengarang() + "\n"
                + "Tahun Terbit = " + buku4.getTahunTerbit() + "\n"
                + "Tersedia = " + buku4.getStok() +" buku"+ "\n");
    }
}
