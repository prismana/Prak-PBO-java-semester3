package com.latihan;//label

import javax.swing.*;
import java.net.URL;

public class DemoLabel {
    public static void main(String[] args) {
        Utama u = new Utama();
        u.setSize(500, 500);
        URL img = FrameB.class.getResource("razer.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        u.add(panel);
    }
}
