/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClientUser;

import javax.swing.JOptionPane;
import mktApp.bussines.MainManager;
import mktApp.entity.Account;
import mktApp.entity.Adviser;
import mktApp.utility.Clean;


/**
 *
 * @author CARLOS
 */
public class Registro extends javax.swing.JFrame {
    String email_parameter;
    /**
     * Creates new form Registro
     */
    public Registro(String email_parameter) {
        initComponents();
        this.email_parameter = email_parameter;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtLastName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtRole = new javax.swing.JTextField();
        btnEmpezar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jtxtUsuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField = new javax.swing.JPasswordField();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("A conquistar el mundo...!!");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellidos:");

        jLabel5.setText("Cargo");

        btnEmpezar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnEmpezar.setText("EMPEZAR");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        jLabel6.setText("Correo:");

        jLabel7.setText("Contraseña:");

        btnAtras.setText("ATRÁS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtRole, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addComponent(jtxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpezar, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        
        Adviser adviser = new Adviser();
        
        adviser.setEmail(jtxtUsuario.getText());
        if(jPasswordField.getText().length() >= 6){
            adviser.setPassword(jPasswordField.getText());
            adviser.setFirst_name(jtxtFirstName.getText());
            adviser.setRole_job(jtxtRole.getText());
            adviser.setLast_name(jtxtLastName.getText());
            if (adviser.getEmail().trim().equals("") == true) {
                JOptionPane.showMessageDialog(this, "El Email no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (adviser.getPassword().trim().equals("") == true) {
                    JOptionPane.showMessageDialog(this, "La clave no puede estar vacia", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (adviser.getFirst_name().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (adviser.getLast_name().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "El apellido no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (adviser.getRole_job().trim().equals("") == true) {
                        JOptionPane.showMessageDialog(this, "El cargo no puede estar vacío", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                 /*Si pasamos todas las validaciones, lo registramos*/
                boolean status = MainManager.getAccount_AdviserUserManager().signUpAdviser(adviser);
                if (status == true) {
                    JOptionPane.showMessageDialog(this, "¡Usuario registrado", "Registrado", JOptionPane.INFORMATION_MESSAGE);
                    int response = JOptionPane.showConfirmDialog(this, "¿Desea guardar los cambios efectuados?", "Guardar", JOptionPane.YES_NO_OPTION);
                    if (response == JOptionPane.YES_OPTION) {
                        boolean status_response = MainManager.getDatabaseManager().guardarCambios();
                        PerfilUser pu = new PerfilUser(adviser.getEmail());
                        this.dispose();
                    } else if (response == JOptionPane.NO_OPTION) {
                        Clean C = new Clean();
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo registrar al Usuario, verifique que no esté ya registrado.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else {
            JOptionPane.showMessageDialog(this, "La contraseña debe tener 6 a mas digitos","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        LoginClient lc = new LoginClient(email_parameter);
        lc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jtxtFirstName;
    private javax.swing.JTextField jtxtLastName;
    private javax.swing.JTextField jtxtRole;
    private javax.swing.JTextField jtxtUsuario;
    // End of variables declaration//GEN-END:variables
}
