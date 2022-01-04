package edu.latihan;

public abstract class MethodAbstrak {
    public abstract double luas();
    public abstract double keliling();

    public double getLuas(){
        return luas();
    }

    public double getKel(){
        return keliling();
    }
}
