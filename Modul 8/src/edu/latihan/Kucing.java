package edu.latihan;

public class Kucing extends Pet{

    public void bergerak(){
        System.out.println("Menyukai ikan");
    }

    @Override
    public String perilaku() {
        return "Menyukai Ikan \nMeeow... Meeoow";
    }
}
