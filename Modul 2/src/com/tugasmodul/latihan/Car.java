package com.tugasmodul.latihan;

public class Car {
    int gear, speed, cadence;

    public void changeGear(int gr){
        gear = gr;
    }

    public void speedUp(int spd){
        speed = spd;
    }

    public void changeCadence(int ca){
        cadence = ca;
    }

    public void printInfo(){
        System.out.println(" Cadence : " + cadence + "\n" +
                " Speed : " + speed + "\n" +
                " Gear Position : " + gear + "\n");
    }
}
