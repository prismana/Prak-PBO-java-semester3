package PekerjaanRumah;

public class Nilai {

    int nilaiUTS = 97, nilaiUAS = 99, nilaiTugas = 89;
    double nilaiTotal;

    //convert integer ke double
    double a = nilaiUTS;
    double b = nilaiTugas;
    double c = nilaiUAS;

    public double hitungNilaiTotal(){
        return nilaiTotal = (a + b + c) / 3;
    }

    public void infoNilaiTotal(){
        System.out.println("Nilai Total: " + hitungNilaiTotal());
    }
}
