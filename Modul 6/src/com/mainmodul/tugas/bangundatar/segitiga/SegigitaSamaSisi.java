package com.mainmodul.tugas.bangundatar.segitiga;

import com.mainmodul.tugas.bangundatar.Segitiga;

public class SegigitaSamaSisi extends Segitiga {
    double sisi;

    public void kelilingSegitigaSamaSisi(double sisi){
        keliling = 3 * sisi;
        System.out.println("Keliling Segitiga sama sisi: " + keliling + " cm" + "\n");
    }
}
