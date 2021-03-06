/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mktApp.view.UpdateView;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mktApp.bussines.MainManager;
import mktApp.entity.Account;
import mktApp.entity.Potential;
import mktApp.utility.Clean;
import mktApp.view.AdviserView.JfrmAdviserInfo;


/**
 *
 * @author DIEGO
 */
public class JfrmAccountTranslateSignUp extends javax.swing.JFrame {
    String  adviser_email_parameter;
    String email_to_change;
    Potential potential;
    /**
     * Creates new form JfrmAccountTranslateSignUp
     */
    public JfrmAccountTranslateSignUp(String adviser_email_parameter, String email_to_translate) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MARKETING DIGITAL");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo3.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setVisible(true);
        this.adviser_email_parameter = adviser_email_parameter;
        potential = MainManager.getPotentialUserManager().searchPotential(email_to_translate);
        jtxfEmail.setText(potential.getEmail());
        jtxfFirstName.setText(potential.getFirst_name());
        jtxfLastName.setText(potential.getLast_name());
        jtxfMobile.setText(potential.getMobile());
        jlblCompanyName.setText(potential.getName_company());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxfEmail = new javax.swing.JTextField();
        jtxfMobile = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxfCombo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxfPayMethod = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxfFirstName = new javax.swing.JTextField();
        jtxfLastName = new javax.swing.JTextField();
        jlblCompanyName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombre de Contacto :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Empresa : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Telefono : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Combo : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Método de Pago :");

        btnAceptar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apellido de Contacto :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business-people.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("TRANSFERENCIA A CUENTA");

        jlblCompanyName.setBackground(new java.awt.Color(51, 51, 51));
        jlblCompanyName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jlblCompanyName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxfPayMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxfMobile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                                    .addComponent(jtxfCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtxfLastName, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtxfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                            .addComponent(jtxfFirstName, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel1))
                                    .addComponent(jlblCompanyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(btnAceptar)
                        .addGap(109, 109, 109)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtxfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jtxfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jlblCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxfMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfPayMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(57, 57, 57))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        Account account = new Account();
        
        if(jtxfMobile.getText().length() < 9 || jtxfMobile.getText().length() > 9){
            JOptionPane.showMessageDialog(this, "El número debe tener 9 digitos", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            account.setEmail(jtxfEmail.getText());
            account.setFirst_name(jtxfFirstName.getText());
            account.setLast_name(jtxfLastName.getText());
            account.setName_account(potential.getName_company());
            account.setEmail_adviser(adviser_email_parameter);
            account.setMobile(jtxfMobile.getText());
            account.setName_combo(jtxfCombo.getText());
            account.setPay_method(jtxfPayMethod.getText());
            if (account.getEmail().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El Email no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (account.getMobile().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El telefono no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (account.getFirst_name().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (account.getLast_name().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El apellido no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (account.getName_account().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El nombre de la compañia no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (account.getName_combo().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El nombre del combo no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (account.getPay_method().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El método de pago no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean status = MainManager.getAccountUserManager().signUpAccount(account);
                if (status == true) {
                    JOptionPane.showMessageDialog(this, "¡Usuario registrado", "Registrado", JOptionPane.INFORMATION_MESSAGE);
                    int response = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios efectuados?", "Guardar", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        boolean statusPotential = MainManager.getPotentialUserManager().removePotential(potential);
                        boolean status_response = MainManager.getDatabaseManager().guardarCambios();
                        JfrmAdviserInfo Ad = new JfrmAdviserInfo(adviser_email_parameter);
                        this.dispose();
                    } else if (response == JOptionPane.NO_OPTION) {
                        Clean C = new Clean();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo registrar al Usuario, verifique que no esté ya registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        JfrmAdviserInfo Adv = new JfrmAdviserInfo(adviser_email_parameter);
        setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlblCompanyName;
    private javax.swing.JTextField jtxfCombo;
    private javax.swing.JTextField jtxfEmail;
    private javax.swing.JTextField jtxfFirstName;
    private javax.swing.JTextField jtxfLastName;
    private javax.swing.JTextField jtxfMobile;
    private javax.swing.JTextField jtxfPayMethod;
    // End of variables declaration//GEN-END:variables
}
