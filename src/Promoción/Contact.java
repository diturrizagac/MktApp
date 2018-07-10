/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Promoción;

import Ventanas.Interfaz;


/**
 *
 * @author CARLOS
 */
public class Contact extends javax.swing.JFrame {
    String adviser_email_parameter;

    /**
     * Creates new form Contact
     */
    public Contact(String adviser_email) {
        initComponents();
        this.setLocationRelativeTo(null);
        transparenciaBotones();
        adviser_email_parameter = adviser_email;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        send = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        send.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        send.setForeground(new java.awt.Color(255, 255, 255));
        send.setText("ENVIAR");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        getContentPane().add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(645, 392, 100, 80));

        exit.setText("ATRAS");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Felix Titling", 1, 90)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ARGO");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 80));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NEW WORLD, NEW STYLE");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 440, -1));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 440, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image2/marketing-secrets.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 440, -1));

        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, 440, 120));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("MENSAJE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TELEFONO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CORREO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/wallpaper.wiki-New-york-city-wallpapers-full-hd-wallpaper-search-PIC-WPC002428-758x474.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        Interfaz obj=new Interfaz(adviser_email_parameter);
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
       Interfaz obj=new Interfaz(adviser_email_parameter);
       dispose();
    }//GEN-LAST:event_sendActionPerformed

    public void transparenciaBotones(){
          
        exit.setOpaque(false);
        exit.setContentAreaFilled(false); 
        exit.setBorderPainted(false);
        
        send.setOpaque(false);
        send.setContentAreaFilled(false); 
        send.setBorderPainted(false);
    
  
    
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JButton send;
    // End of variables declaration//GEN-END:variables
}
