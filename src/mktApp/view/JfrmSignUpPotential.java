/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mktApp.view;

import entidad.Persona;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import negocio.GestorPrincipal;
import util.Limpiar;
import util.UtilFecha;
import vista.JfrmPortadaP;

/**
 *
 * @author Diego Iturrizaga
 */
public class JfrmSignUpPotential extends javax.swing.JFrame {

    /**
     * Creates new form JpanRegistrarPerson
     */
    public JfrmSignUpPotential() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Agencia de Empleos");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo3.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
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
        jtxfDni = new javax.swing.JTextField();
        jtxfNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxfApPaterno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxfApMaterno = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jtxfDireccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPassword1 = new javax.swing.JPasswordField();
        jPassword2 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

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

        jtxfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxfEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de Compañia : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre de Compañia :");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel5))
                                    .addGap(33, 33, 33))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtxfApMaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxfApPaterno, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxfNombres, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxfDni, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPassword1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jtxfEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jPassword2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                    .addComponent(jtxfDireccion)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(btnAceptar)
                        .addGap(44, 44, 44)
                        .addComponent(btnCancelar)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPassword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtxfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfApMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxfDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxfEmailActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        {
            /*Leemos los datos del alumno*/
            Persona persona = new Persona();

            persona.setEmail(jtxfEmail.getText());
            if (jPassword1.getText().length() >= 6) {
                if (jPassword1.getText().equalsIgnoreCase(jPassword2.getText())) {
                    persona.setPassword(jPassword2.getText());

                } else {
                    JOptionPane.showMessageDialog(this, "Las claves no coinciden",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }

                persona.setDni(jtxfDni.getText());
                if (jtxfDni.getText().length() < 8 || jtxfDni.getText().length() > 8) {
                    JOptionPane.showMessageDialog(this, "DNI debe tener 8 digitos", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    persona.setNombre(jtxfNombres.getText());
                    persona.setApPaterno(jtxfApPaterno.getText());
                    persona.setApMaterno(jtxfApMaterno.getText());
                    persona.setDireccion(jtxfDireccion.getText());
                    if (jMasc.isSelected()) {
                        persona.setSexo("Masculino");
                    } else if (Jfem.isSelected()) {
                        persona.setSexo("Femenino");
                    } else {
                        persona.setSexo("");
                    }
                    persona.setNacimiento(UtilFecha.obtenerFecha(jDia.getValue().toString(), jMes.getValue().toString(), jAnio.getValue().toString()));
                    persona.setCivil(jCivil.getSelectedItem().toString());
                    /*Validamos los datos, usamos la versión resumida del "if-else" anidado*/
                    if (persona.getEmail().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "El Email no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (persona.getPassword().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "LA clave no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (persona.getNombre().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (persona.getApPaterno().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "El apellido paterno no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (persona.getApMaterno().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "El apellido Materno no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (persona.getDireccion().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "LA direccion no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
                    } else if (persona.getSexo().trim().equals("") == true) {
                        System.out.println("Tiene que marcar el sexo");
                    } else {
                        /*Si pasamos todas las validaciones, lo registramos*/
                        boolean estado = GestorPrincipal.getGestorUsuarioPersona().registrarPersona(persona);
                        if (estado == true) {
                            JOptionPane.showMessageDialog(this, "¡Usuario registrado con éxito!", "Registrado", JOptionPane.INFORMATION_MESSAGE);
                            int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios efectuados?", "Guardar", JOptionPane.YES_NO_OPTION);
                            if (respuesta == JOptionPane.YES_OPTION) {
                                boolean estad = GestorPrincipal.getGestorBaseDeDatos().guardarCambios();
                                JfrmPerfilPersona p = new JfrmPerfilPersona(persona.getDni());
                                dispose();
                            } else if (respuesta == JOptionPane.NO_OPTION) {
                                Limpiar L = new Limpiar();
                                

                            }
                            
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo registrar al Usuario, verifique que no esté ya registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(this, "La contraseña debe tener 6 a mas digitos",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        JfrmPortadaP P = new JfrmPortadaP();
        setVisible(false);
        dispose();
        //JfrmOpciones.jPanel1.setVisible(true);
        
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JfrmSignUpPotential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfrmSignUpPotential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfrmSignUpPotential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfrmSignUpPotential.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfrmSignUpPotential().setVisible(true);
            }
        });
    }

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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPassword1;
    private javax.swing.JPasswordField jPassword2;
    private javax.swing.JTextField jtxfApMaterno;
    private javax.swing.JTextField jtxfApPaterno;
    private javax.swing.JTextField jtxfDireccion;
    private javax.swing.JTextField jtxfDni;
    private javax.swing.JTextField jtxfEmail;
    private javax.swing.JTextField jtxfNombres;
    // End of variables declaration//GEN-END:variables
}
