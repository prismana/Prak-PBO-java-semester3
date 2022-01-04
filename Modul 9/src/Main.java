import edu.latihan.*;
import edu.tugas.*;

public class Main {
    public static void main(String[] args) {

        //Latihan 9.3
        PersegiPanjang PP = new PersegiPanjang();
        System.out.println("Keliling Persegi: " + PP.keliling());
        System.out.println("Luas Persegi: " + PP.luas() + "\n");

        JajarGenjang JG = new JajarGenjang();
        System.out.println("Luas Jajar Genjang: " + JG.luas());
        System.out.println("Keliling Jajar Genjang: " + JG.keliling() + "\n");

        Lingkaran Li = new Lingkaran();
        System.out.println("Keliling Lingkaran: " + Li.keliling());
        System.out.println("Luas Lingkaran: " + Li.luas() + "\n");

        Segitiga Se = new Segitiga();
        System.out.println("Keliling Segitiga: " + Se.keliling());
        System.out.println("Luas Segitiga: " + Se.luas() + "\n");

        //Tugas 9.4
        Balok Bl = new Balok();
        System.out.println("Volume Balok: " + Bl.volume());
        System.out.println("Luas Permukaan: " + Bl.luasPermukaan());

        Kubus Ku =new Kubus();
        System.out.println("Volume Kubus: " + Ku.volume());
        System.out.println("Luas Permukaan: " + Ku.luasPermukaan());

        Kerucut Kr = new Kerucut();
        System.out.println("Volume Kerucut: " + Kr.volume());
        System.out.println("Luas Permukaan: " + Kr.luasPermukaan());

        Bola Bo = new Bola();
        System.out.println("Volume Bola: " + Bo.volume());
        System.out.println("Luas Permukaan: " + Bo.luasPermukaan());

        PrismaSegitiga PS = new PrismaSegitiga();
        System.out.println("Volume Prisma Segitiga: " + PS.volume());
        System.out.println("Luas Permukaan: " + PS.luasPermukaan());
    }
}
