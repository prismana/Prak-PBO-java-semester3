package com.tugas;

import java.awt.Color;

public class MenuColor extends javax.swing.JFrame {
    public MenuColor() {
        super("Tugas 2");
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Merah = new javax.swing.JCheckBoxMenuItem();
        Kuning = new javax.swing.JCheckBoxMenuItem();
        Hijau = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Ubah Warna");

        Merah.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        Merah.setSelected(true);
        Merah.setText("Merah");
        Merah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MerahActionPerformed(evt);
            }
        });
        jMenu1.add(Merah);

        Kuning.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, 0));
        Kuning.setSelected(true);
        Kuning.setText("Kuning");
        Kuning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KuningActionPerformed(evt);
            }
        });
        jMenu1.add(Kuning);

        Hijau.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, 0));
        Hijau.setSelected(true);
        Hijau.setText("Hijau");
        Hijau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HijauActionPerformed(evt);
            }
        });
        jMenu1.add(Hijau);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void MerahActionPerformed(java.awt.event.ActionEvent evt) {
        this.getContentPane().setBackground(Color.red);
    }

    private void KuningActionPerformed(java.awt.event.ActionEvent evt) {
        this.getContentPane().setBackground(Color.yellow);
    }

    private void HijauActionPerformed(java.awt.event.ActionEvent evt) {
        this.getContentPane().setBackground(Color.green);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuColor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JCheckBoxMenuItem Hijau;
    private javax.swing.JCheckBoxMenuItem Kuning;
    private javax.swing.JCheckBoxMenuItem Merah;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration
}
