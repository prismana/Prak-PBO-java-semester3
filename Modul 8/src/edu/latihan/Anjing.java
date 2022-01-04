package edu.latihan;

public class Anjing extends Pet{

    public void makanan(){
        System.out.println("Makan daging");
    }

    @Override
    public String perilaku() {
        return "Wof Wof \nSuka bermain lempar tangkap";
    }
}
