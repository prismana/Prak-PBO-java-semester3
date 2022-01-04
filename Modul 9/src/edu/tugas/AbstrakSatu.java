package edu.tugas;

public abstract class AbstrakSatu {
    public abstract double volume();
    public abstract double luasPermukaan();

    public double getVolume(){
        return volume();
    }

    public double getluasPermukaan(){
        return luasPermukaan();
    }
}
