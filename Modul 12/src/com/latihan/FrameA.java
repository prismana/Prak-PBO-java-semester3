package com.latihan;

import java.awt.Container;
import javax.swing.JButton;

public class FrameA extends javax.swing.JFrame{
    public FrameA(){
        super("Frame dan Button");
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FrameA fa = new FrameA();
        Container container = fa.getContentPane();
        JButton jbton = new JButton("OK");
        container.add(jbton);
    }
}
