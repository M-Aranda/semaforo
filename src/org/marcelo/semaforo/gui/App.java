package org.marcelo.semaforo.gui;

import java.awt.Graphics;
import java.awt.Color;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Semaforo con hilo");
        this.setResizable(false);

    }

    private class HiloControlador extends Thread {

        private int cont;

        @Override
        public void run() {
            while(true){
                
            
            
            cont=0;
            while (true) {
                

                if (cont == 6) {
                    lblSemVerde.setText(String.valueOf(0));
                    break;
                }

                cont++;

                lblSemVerde.setText(String.valueOf(cont));
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }

            }

            cont = 0;

            while (true) {

                if (cont == 1) {
                    lblSemAmarillo.setText(String.valueOf(0));
                    break;
                }

                cont++;

                lblSemAmarillo.setText(String.valueOf(cont));
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }

            }

            cont=0;
            
            while (true) {

                if (cont == 5) {
                    lblSemRojo.setText(String.valueOf(0));
                    break;
                }

                cont++;

                lblSemRojo.setText(String.valueOf(cont));
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException ex) {

                }

            }
            }

        }

    }

//    public void paint(Graphics g) {
//        try {
//            g.setColor(Color.GREEN);
//            g.drawOval(50, 50, 50, 50);
//
//        } catch (Exception e) {
//            //haz nada
//        }
//
//    }
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lblSemRojo = new javax.swing.JLabel();
        lblSemAmarillo = new javax.swing.JLabel();
        lblSemVerde = new javax.swing.JLabel();

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

        lblSemRojo.setText("Rojo");

        lblSemAmarillo.setText("Amarillo");

        lblSemVerde.setText("Verde");

        jLayeredPane1.setLayer(lblSemRojo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblSemAmarillo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(lblSemVerde, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblSemVerde)
                    .addComponent(lblSemAmarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSemRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(lblSemRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSemAmarillo)
                .addGap(69, 69, 69)
                .addComponent(lblSemVerde))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtVerde, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(txtAmarrillo)
                    .addComponent(txtRojo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRojo)
                    .addComponent(lblAmarillo)
                    .addComponent(lblVerde))
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRojo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmarrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAmarillo))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVerde)))
                    .addComponent(jLayeredPane1))
                .addGap(18, 18, 18)
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
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLabel lblAmarillo;
    private javax.swing.JLabel lblRojo;
    private javax.swing.JLabel lblSemAmarillo;
    private javax.swing.JLabel lblSemRojo;
    private javax.swing.JLabel lblSemVerde;
    private javax.swing.JLabel lblVerde;
    private javax.swing.JTextField txtAmarrillo;
    private javax.swing.JTextField txtRojo;
    private javax.swing.JTextField txtVerde;
    // End of variables declaration//GEN-END:variables
}
