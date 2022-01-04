package com.tugas;
//this code belong to Prismana

import javax.swing.*;
import java.awt.*;

public class ComboBox {
    public static void main(String[] args) {
        JFrame f = new JFrame("Tugas 1");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(new FlowLayout()); //untuk menyusun layout di frame

        JLabel arg1 = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah");
        f.add(arg1);

        JComboBox combox = new JComboBox();
        combox.addItem("Sangat tidak setuju");
        combox.addItem("Tidak setuju");
        combox.addItem("Kurang setuju");
        combox.addItem("setuju");
        combox.addItem("Sangat setuju");

        f.add(combox);
    }
}
