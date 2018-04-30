package org.marcelo.semaforo.gui;

import java.awt.Graphics;
import java.awt.Color;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        inicializarCaracterisitcasDeComponentes();

    }

    public void inicializarCaracterisitcasDeComponentes() {
        this.setLocationRelativeTo(null);
        this.setTitle("Semaforo");
        this.setResizable(false);
        txtAmarrillo.setEnabled(false);
        txtRojo.setEnabled(false);
        txtVerde.setEnabled(false);

        txtSemR.setBackground(Color.red);
        txtSemA.setBackground(Color.yellow);
        txtSemV.setBackground(Color.green);
        txtSemR.setEditable(false);
        txtSemA.setEditable(false);
        txtSemV.setEditable(false);

        paint(txtSemV.getGraphics());

    }

    public void paint(Graphics g) {
        super.paintComponents(g);
        g.fillOval(25, 15, 2, 2);
        g.setColor(Color.red);

        g.fillOval(25, 50, 65, 65);
        g.setColor(Color.yellow);

        g.fillOval(25, 125, 65, 65);
        g.setColor(Color.green);

        g.fillOval(25, 245, 65, 65);
        g.setColor(Color.black);


        g.drawLine(20, 40, 20, 320);

        g.drawLine(95, 40, 95, 320);

        g.drawLine(20, 40, 95, 40);

        g.drawLine(95, 320, 20, 320);

    }

    private class HiloControlador extends Thread {

        private int cont;

        @Override
        public void run() {
            while (true) {

                cont = 7;
                while (true) {

                    if (cont == 0) {
                        txtSemV.setText(String.valueOf(0));
                        break;
                    }

                    cont -= 1;

                    txtSemV.setText(String.valueOf(cont));
                    try {

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }

                }

                cont = 2;

                while (true) {

                    if (cont == 0) {
                        txtSemA.setText(String.valueOf(0));
                        break;
                    }

                    cont -= 1;

                    txtSemA.setText(String.valueOf(cont));
                    try {

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }

                }

                cont = 6;

                txtSemR.setForeground(Color.white);
                while (true) {

                    if (cont == 0) {
                        txtSemR.setText(String.valueOf(0));
                        break;
                    }

                    cont -= 1;

                    txtSemR.setText(String.valueOf(cont));
                    try {

                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {

                    }

                }
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtRojo = new javax.swing.JTextField();
        txtAmarrillo = new javax.swing.JTextField();
        txtVerde = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        lblRojo = new javax.swing.JLabel();
        lblAmarillo = new javax.swing.JLabel();
        lblVerde = new javax.swing.JLabel();
        txtSemR = new javax.swing.JTextField();
        txtSemA = new javax.swing.JTextField();
        txtSemV = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtRojo.setText("5");

        txtAmarrillo.setText("1");

        txtVerde.setText("6");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        lblRojo.setText("seg");

        lblAmarillo.setText("seg");

        lblVerde.setText("seg");

        txtSemR.setBackground(new java.awt.Color(255, 0, 0));
        txtSemR.setForeground(new java.awt.Color(255, 0, 0));
        txtSemR.setText("R");
        txtSemR.setAutoscrolls(false);
        txtSemR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        txtSemA.setBackground(new java.awt.Color(255, 255, 0));
        txtSemA.setText("A");
        txtSemA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 0), 2));

        txtSemV.setBackground(new java.awt.Color(0, 255, 0));
        txtSemV.setForeground(new java.awt.Color(255, 255, 255));
        txtSemV.setText("V");
        txtSemV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 51), 2));
        txtSemV.setCaretColor(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(txtSemR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSemV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSemA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRojo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmarrillo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVerde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRojo)
                    .addComponent(lblAmarillo)
                    .addComponent(lblVerde))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRojo)
                    .addComponent(txtSemR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmarrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmarillo)
                    .addComponent(txtSemA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVerde)
                    .addComponent(txtSemV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnIniciar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        btnIniciar.setEnabled(false);
        HiloControlador hc = new HiloControlador();
        hc.start();

    }//GEN-LAST:event_btnIniciarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel lblAmarillo;
    private javax.swing.JLabel lblRojo;
    private javax.swing.JLabel lblVerde;
    private javax.swing.JTextField txtAmarrillo;
    private javax.swing.JTextField txtRojo;
    private javax.swing.JTextField txtSemA;
    private javax.swing.JTextField txtSemR;
    private javax.swing.JTextField txtSemV;
    private javax.swing.JTextField txtVerde;
    // End of variables declaration//GEN-END:variables
}
