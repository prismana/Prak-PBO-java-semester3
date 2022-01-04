import com.mainmodul.latihan.*;
import com.mainmodul.tugas.Mahasiswa;

public class Main {
    public static void main(String[] args) {

        //Id
        Id identitas = new Id();

        //Buku
        Buku buku1 = new Buku("Terbitlah terang", "Prismana");
        Buku buku2 = new Buku("Gelapnya malam kamis", 2019, 4);
        Buku buku3 = new Buku("Nothing to Lose", 89.500);

        Buku buku4 = new Buku("Tereliye", "ya Tereliye");
        Buku buku5 = new Buku("Habis jumat, sabtu", 2015, 27);
        Buku buku6 = new Buku("Chernobyl", 139.500);

        Buku buku7 = new Buku("Batu Karang yang Tak Keras", "Prismana");
        Buku buku8 = new Buku("Aikyroby Vol 2", 2001, 2);
        Buku buku9 = new Buku("How to Make Drone", 289.500);
        Buku buku10 = new Buku("Eat That Frog", 67.800);

        //Tugas - Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("Rahdriawan", "L200200031", "FKI", (short) 3);
        mhs2.infoMahasiswa();
    }
}
