package com.latihan;

public class Utama extends javax.swing.JFrame{
    public Utama(){
        super("belajar mengenal GUI");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Utama u = new Utama();
    }
}
