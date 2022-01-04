import Latihan2.LocalVariabel2;
import Latihan3.Pegawai;
import PekerjaanRumah.Nilai;

public class Main {

    public static void main(String[] args) {

        //Latihan1 & 2: Local Variabel
        LocalVariabel2 a = new LocalVariabel2();

        a.HitungUsia();
        a.BeratBadan();

        //Latihan 3: Pegawai
        Pegawai polisi = new Pegawai();
        Pegawai dokter = new Pegawai();
        Pegawai guru = new Pegawai();
        Pegawai perawat = new Pegawai();
        Pegawai koki = new Pegawai();

        polisi.infoPegawai("nuggie", 909090,8000000);
        dokter.infoPegawai("Allan", 2930423, 16000000);
        guru.infoPegawai("Yogie", 9032523, 6000000);
        perawat.infoPegawai("Siska",9023523, 9500000);
        koki.infoPegawai("Prismana", 903264346, 90000000);

        //Pekerjaan Rumah
        Nilai x = new Nilai();

        x.infoNilaiTotal();
    }
}
