import edu.latihan.*;
import edu.tugas.*;

public class Main {
    public static void main(String[] args) {
        //Latihan
        Kucing cat = new Kucing();
        cat.beriNama("TOM");
        System.out.println(cat.panggilNama());
        System.out.println(cat.perilaku());

        Anjing dog = new Anjing();
        dog.beriNama("BULL");
        System.out.println(dog.panggilNama());
        System.out.println(dog.perilaku());

        Elang eagle = new Elang();
        eagle.beriNama("JACK");
        System.out.println(eagle.panggilNama());
        System.out.println(eagle.perilaku());
        eagle.jalan();


        //Tugas
        System.out.println("Data Customer");
        CustomerData CD0 = new CustomerData("Prismana", "Sragen", "Dokter", 90000000, "13/12/01");
        CustomerData CD1 = new CustomerData("Prawira", "Wonogiri", "Okupasi", 5600000, "13/12/01");
        CustomerData CD2 = new CustomerData("Syifaul", "Karanganyar", "Peogrammer", 40000000, "13/12/01");
        CustomerData CD3 = new CustomerData("Seno", "Madiun", "Petani", 8000000, "13/12/01");
        CustomerData CD4 = new CustomerData("Zanny", "Mantingan", "Peternak", 4900000, "13/12/01");
        CustomerData CD5 = new CustomerData("Diego", "Ngawi", "Pemadam", 9600000, "13/12/01");
        CustomerData CD6 = new CustomerData("Aji", "Solo", "Polisi", 9700000, "13/12/01");
        CustomerData CD7 = new CustomerData("Intan", "Kudus", "Pilot", 8000000, "13/12/01");
        CustomerData CD8 = new CustomerData("Isnaini", "Boyolali", "Perawat", 7600000, "13/12/01");
        CustomerData CD9 = new CustomerData("Mareta", "Bali", "Guru", 6000000, "13/12/01");

        CD0.infoCustomer();
        CD1.infoCustomer();
        CD2.infoCustomer();
        CD3.infoCustomer();
        CD4.infoCustomer();
        CD5.infoCustomer();
        CD6.infoCustomer();
        CD7.infoCustomer();
        CD8.infoCustomer();
        CD9.infoCustomer();

        System.out.println("\nData Rasio Bank");
        Bank b = new Bank();
        BankPribadi bP = new BankPribadi();
        BankUmum bu = new BankUmum();
        BankPasar bp = new BankPasar();
        BankSyariah bs = new BankSyariah();
        System.out.println("Bank: " + b.rasioBunga(9) + " %");
        System.out.println("Bank Pribadi: " + bP.rasioBunga(5.3) + "%");
        System.out.println("Bank Umum: " + bu.rasioBunga(3.4) + "%");
        System.out.println("Bank Pasar: " + bp.rasioBunga(5.8) + "%");
        System.out.println("Bank Syariah: " + bs.rasioBunga(2.4) + "%");

    }
}
