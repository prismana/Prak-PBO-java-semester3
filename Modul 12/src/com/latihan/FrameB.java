package com.latihan;

import java.net.URL;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class FrameB extends javax.swing.JFrame{
    public FrameB(){
        super("Frame dan Button");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FrameB fb = new FrameB();
        JPanel jpnl = new JPanel();
        URL img = FrameB.class.getResource("razer.png");
        JButton jbtnOK = new JButton("OK");
        JButton jbtnImg = new JButton(new ImageIcon(img));
        jpnl.add(jbtnOK);
        jpnl.add(jbtnImg);
        fb.add(jpnl);
        fb.setVisible(true);
    }
}
