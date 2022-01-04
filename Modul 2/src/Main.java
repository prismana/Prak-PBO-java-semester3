import com.tugasmodul.latihan.*;
import com.tugasmodul.pekerjaanrumah.profesi.*;
import com.tugasmodul.pekerjaanrumah.hewan.*;

public class Main {

    public static void main(String[] args) {
        //Roti
        Roti roti = new Roti();
        roti.beriWarna("Hitam");
        roti.beriRasa("Stroberi");
        roti.timbangBerat(7);
        roti.hargaJual(90000);
        roti.rotiInfo();

        Roti roti2 = new Roti();
        roti2.beriWarna("Pink");
        roti2.beriRasa("Coklat");
        roti2.timbangBerat(2);
        roti2.hargaJual(6000);
        roti2.rotiInfo();

        Roti roti3 = new Roti();
        roti3.beriWarna("Merah");
        roti3.beriRasa("Pisang");
        roti3.timbangBerat(8);
        roti3.hargaJual(670000);
        roti3.rotiInfo();
        System.out.println("--------------------------------");

        //Car
        Car car1 = new Car();
        Car car2 = new Car();

        car1.changeCadence(50);
        car1.speedUp(20);
        car1.changeGear(2);
        car1.printInfo();

        car2.changeCadence(30);
        car2.speedUp(10);
        car2.changeGear(1);
        car2.printInfo();
        System.out.println("--------------------------------");

        //Kucing
        Kucing cat = new Kucing();
        cat.furColor = "Pink";
        cat.age = 10;
        cat.meong();
        cat.umur();
        System.out.println("--------------------------------");

        //Bank Account
        System.out.println("Piggy Bank\n");
        BankAccount account = new BankAccount();
        account.saldo = 4000000;
        account.cek_saldo();
        account.menabung(90000);
        account.menarik(1000000);

        account.cek_saldo();

        System.out.println("--------------------------------");

        //Hewan
        Hewan.animalInfo("Harimau", 4, "Daging", "Karnivora");
        Hewan.animalInfo("Kerbau", 4, "Rumput", "Karnivora");

        //Karyawan
        Karyawan k = new Karyawan();
        k.tampilkanNama("Anis");
        k.tampilkanAlamat("Boyolali");
        k.tampilkanJabatan("Staff");
        k.tampilkanGaji(98444444);

        //Dosen
        Dosen dosen = new Dosen();
        dosen.tampilkanNama("Kurnia");
        dosen.tampilkanTglLahir("15 January 1994");
        dosen.tampilkanPendidikan("S1 Teknik Kimia");
        dosen.tampilkanNik(731231862);

        //Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        mhs.tampilkanNama("Rahdriawan Prismana");
        mhs.tampilkanAlamat("sragen");
        mhs.tampilkanNim("L200200031");
        mhs.tampilkanSemester(3);
    }
}
