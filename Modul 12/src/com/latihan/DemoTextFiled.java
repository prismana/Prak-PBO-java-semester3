package com.latihan;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class DemoTextFiled {
    public static void main(String[] args) {
        Utama u = new Utama();
        JLabel nama = new JLabel("Nama: ");
        JLabel password = new JLabel("Password: ");
        JTextField inputNama = new JTextField(15);
        JPasswordField inputPswd = new JPasswordField(15);
        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputPswd);
        u.add(panel);
    }
}
