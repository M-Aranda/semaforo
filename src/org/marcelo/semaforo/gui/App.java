package org.marcelo.semaforo.gui;

import java.awt.Graphics;
import java.awt.Color;



public class App extends javax.swing.JFrame {

    public App() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Semaforo con hilo");
        this.setResizable(false);
        txtAmarrillo.setEnabled(false);
        txtRojo.setEnabled(false);
        txtVerde.setEnabled(false);
 
        
        
        
        paint(lblSemRojo.getGraphics());

        
        

    }
    
        
        public void paint(Graphics g){
            super.paintComponents(g);
            g.fillOval(25, 25, 30, 30);
            g.setColor(Color.yellow);
            
            g.fillOval(25, 110, 30, 30);
            g.setColor(Color.green);
            
            g.fillOval(25, 245, 30, 30);
            g.setColor(Color.red);
            
        }

    


    private class HiloControlador extends Thread {

        private int cont;

        @Override
        public void run() {
            while (true) {

                cont = 0;
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

                cont = 0;

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

        lblSemRojo.setBackground(new java.awt.Color(204, 0, 0));
        lblSemRojo.setForeground(new java.awt.Color(255, 0, 0));
        lblSemRojo.setText("R");

        lblSemAmarillo.setBackground(new java.awt.Color(255, 255, 0));
        lblSemAmarillo.setText("A");

        lblSemVerde.setBackground(new java.awt.Color(0, 255, 0));
        lblSemVerde.setText("V");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSemAmarillo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSemRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblRojo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSemVerde)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblVerde))
                            .addComponent(txtAmarrillo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addComponent(lblAmarillo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRojo)
                    .addComponent(lblSemRojo))
                .addGap(49, 49, 49)
                .addComponent(lblSemAmarillo)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAmarrillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmarillo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVerde))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblSemVerde)
                        .addGap(36, 36, 36)))
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
    private javax.swing.JLabel lblSemAmarillo;
    private javax.swing.JLabel lblSemRojo;
    private javax.swing.JLabel lblSemVerde;
    private javax.swing.JLabel lblVerde;
    private javax.swing.JTextField txtAmarrillo;
    private javax.swing.JTextField txtRojo;
    private javax.swing.JTextField txtVerde;
    // End of variables declaration//GEN-END:variables
}
