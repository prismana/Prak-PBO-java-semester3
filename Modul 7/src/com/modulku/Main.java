package com.modulku;
import com.modulku.latihan.*;

public class Main {
    public static void main(String[] args) {

        //5 Objek manager
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        Manager manager3 = new Manager();
        Manager manager4 = new Manager();
        Manager manager5 = new Manager();

        manager1.setName("Ellen");
        manager2.setAge(23);
        manager3.setSalary(8900000);
        manager4.setWorkTime(8.5f);
        manager5.setSalary(3);

        System.out.println("Manager 1 bernama: " + manager1.getName());
        System.out.println("Manager 2 berusia: " + manager2.getAge() + " Tahun");
        System.out.println("Manager 3 bergaji: " + manager3.getSalary() + " Rupiah");
        System.out.println("Waktu kerja Manager 4: " + manager4.getWorkTime() + " Jam");
        System.out.println("Gaji Manager 5: " + manager5.getSalary());

        //Objek Karyawan
        Karyawan karyawan1 = new Karyawan();

        karyawan1.setName("Ani");
        karyawan1.setAge(31);
        karyawan1.setSalary(9200000);

        System.out.println(karyawan1.getName() + " Berumur: " +
                            karyawan1.getAge() + " dan mendapat gaji: " +
                            karyawan1.getSalary());
    }
}
