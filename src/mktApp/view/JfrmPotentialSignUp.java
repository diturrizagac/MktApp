/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mktApp.view;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mktApp.bussines.MainManager;
import mktApp.entity.Potential;
import mktApp.utility.Clean;
import mktApp.view.AdviserView.JfrmAdviserInfo;

/**
 *
 * @author Diego Iturrizaga
 */
public class JfrmPotentialSignUp extends javax.swing.JFrame {
    String adviser_email_parameter;

    /**
     * Creates new form JpanRegistrarPerson
     */
    public JfrmPotentialSignUp(String email_paramter) {
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
        this.adviser_email_parameter = email_paramter;
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
        jtxfCompanyName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxfCustomerStatus = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtxfCallStatus = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxfFirstName = new javax.swing.JTextField();
        jtxfLastName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Correo : ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nombres : ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Celular : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de Compañia : ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Estado de Cliente : ");

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Estado de Llamada : ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Apellidos : ");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/business-people.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("REGISTRO DE POTENCIAL CLIENTE");

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
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfCustomerStatus)
                            .addComponent(jtxfCompanyName)
                            .addComponent(jtxfMobile)
                            .addComponent(jtxfEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                            .addComponent(jtxfCallStatus, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxfFirstName)
                            .addComponent(jtxfLastName))
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnAceptar)
                        .addGap(44, 44, 44)
                        .addComponent(btnCancelar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtxfMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxfCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfCustomerStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxfCallStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        /*Leemos los datos del cliente potencial*/
        Potential potential = new Potential();

        if (jtxfMobile.getText().length() < 9 || jtxfMobile.getText().length() > 9) {
            JOptionPane.showMessageDialog(this, "El número debe tener 9 digitos", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            potential.setEmail(jtxfEmail.getText());
            potential.setFirst_name(jtxfFirstName.getText());
            potential.setLast_name(jtxfFirstName.getText());
            potential.setMobile(jtxfMobile.getText());
            potential.setName_company(jtxfCompanyName.getText());
            potential.setEmail_adviser(adviser_email_parameter);
            potential.setCustomer_status(jtxfCustomerStatus.getText());
            potential.setCall_status(jtxfCallStatus.getText());
            
            if (potential.getEmail().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El Email no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (potential.getMobile().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El telefono no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (potential.getFirst_name().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (potential.getLast_name().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El apellido no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (potential.getName_company().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El nombre de la compañia no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            /*} else if (potential.getEmail_adviser().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El nombre del asesor no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);*/
            } else if (potential.getCustomer_status().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El estado de cliente no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (potential.getCall_status().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El estado de llamada no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                boolean status = MainManager.getPotentialUserManager().signUpPotential(potential);
                if (status == true) {
                    JOptionPane.showMessageDialog(this, "¡Usuario registrado", "Registrado", JOptionPane.INFORMATION_MESSAGE);
                    int response = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios efectuados?", "Guardar", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
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
        JfrmAdviserInfo Adv = new JfrmAdviserInfo(adviser_email_parameter);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jtxfCallStatus;
    private javax.swing.JTextField jtxfCompanyName;
    private javax.swing.JTextField jtxfCustomerStatus;
    private javax.swing.JTextField jtxfEmail;
    private javax.swing.JTextField jtxfFirstName;
    private javax.swing.JTextField jtxfLastName;
    private javax.swing.JTextField jtxfMobile;
    // End of variables declaration//GEN-END:variables
}
