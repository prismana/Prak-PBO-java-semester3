package com.latihan;

import javax.swing.*;

public class RadioButton {
    public static void main(String[] args) {
        Utama ut = new Utama();
        ut.setSize(1000, 100);

        JRadioButton[] teams = new JRadioButton[5];
        teams [0] = new JRadioButton("Sangat Tidak Setuju");
        teams [1] = new JRadioButton("Tidak Setuju");
        teams [2] = new JRadioButton("Kurang Setuju");
        teams [3] = new JRadioButton("Setuju", true);
        teams [4] = new JRadioButton("Sangat Setuju");
        JPanel panel = new JPanel();

        JLabel Pernyataan = new JLabel("Moudl Praktikum Pemrograman Berorientasi Objek jelas dan mudah.");
        panel.add(Pernyataan);

        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i < teams.length; i++){
            group.add(teams[i]);
            panel.add(teams[i]);
        }

        ut.add(panel);
        ut.setVisible(true);
    }
}
