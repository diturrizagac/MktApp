package mktApp.view.AdviserView;

import mktApp.view.AdviserView.JfrmAdviserInfo;
import javax.swing.*;
import mktApp.bussines.MainManager;
import mktApp.entity.Account;
import mktApp.entity.Adviser;
import mktApp.view.JfrmMainView;


/**
 *
 * @author DIEGO
 */
public class JfrmAdviserSignIn extends javax.swing.JFrame {

    /**
     * Creates new form JfrmAdviserSignIn
     */
    public JfrmAdviserSignIn() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("MARKETING DIGITAL");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/Fondo2.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxfUsuario = new javax.swing.JTextField();
        btnAceptarIS = new javax.swing.JButton();
        btnCancelarIS = new javax.swing.JButton();
        jpsfPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INICIO DE SESIÓN");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario : ");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        btnAceptarIS.setText("Aceptar");
        btnAceptarIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarISActionPerformed(evt);
            }
        });

        btnCancelarIS.setText("Cancelar");
        btnCancelarIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarISActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sesionicon.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptarIS)
                        .addGap(23, 23, 23)
                        .addComponent(btnCancelarIS))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxfUsuario)
                            .addComponent(jpsfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jpsfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptarIS)
                    .addComponent(btnCancelarIS))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarISActionPerformed
        JfrmMainView MV = new JfrmMainView();
        setVisible(false);
        // System.exit(0);
    }//GEN-LAST:event_btnCancelarISActionPerformed

    private void btnAceptarISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarISActionPerformed
        /*Obtenemos los datos*/
        String userLocal = jtxfUsuario.getText();
        String passLocal = jpsfPassword.getText();

        /*Creamos la instancia*/
        try {
            if (userLocal.length() > 11) {
                Adviser adviser = new Adviser();
                adviser.setEmail(userLocal);
                adviser.setPassword(passLocal);
                
                /*Usamos el "Gestor Asesor" para validar los datos*/
                Adviser Ad = MainManager.getAdviserUserManager().validateAdviser(userLocal);
                if (Ad != null){
                    JfrmAdviserInfo adviserInfo = new JfrmAdviserInfo(Ad.getEmail());
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario y contraseña no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception E) {
            System.out.println("Error");
        }

        
        /*try {
            if (userLocal.length() <= 8) { 
                Account account = new Account();
                account.setEmail(userLocal);
                account.setPassword(passLocal);
                //Usamos el "Gestor Cuenta" para validar los datos
                boolean state = MainManager.getAccountUserManager().signInAccount(account);
                
                if (state == true){
                    Account Acc = MainManager.getAccountUserManager().validateAccount(userLocal);
                    JfrmAdviserInfo jpanAccountInfo = new JfrmAdviserInfo(Acc.getEmail());
                    
                } else {
                    JOptionPane.showMessageDialog(this, "El usuario y contraseña no coinciden", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error");
        }*/
    }//GEN-LAST:event_btnAceptarISActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarIS;
    private javax.swing.JButton btnCancelarIS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jpsfPassword;
    public static javax.swing.JTextField jtxfUsuario;
    // End of variables declaration//GEN-END:variables
}
