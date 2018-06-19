
package mktApp.view.UpdateView;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import mktApp.view.JfrmAccountSignUp;
import mktApp.view.JfrmMainView;
import mktApp.view.JfrmPotentialSignUp;

/**
 *
 * @author DIEGO
 */
public class JfrmUpdateOptions extends javax.swing.JFrame {
    String adviser_email_parameter;
    String email_to_change;
    /**
     * Creates new form Opciones
     */
       
    public JfrmUpdateOptions(String adviser_email_parameter, String email_to_change) {
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
        this.email_to_change = email_to_change;
      
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoUsuarios = new javax.swing.ButtonGroup();
        opPotential = new javax.swing.JRadioButton();
        opAccount = new javax.swing.JRadioButton();
        btnAceptarOp = new javax.swing.JButton();
        btnCerarOp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opPotential.setBackground(new java.awt.Color(255, 255, 255));
        grupoUsuarios.add(opPotential);
        opPotential.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opPotential.setText("Cliente Potencial");
        opPotential.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        opPotential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opPotentialActionPerformed(evt);
            }
        });

        grupoUsuarios.add(opAccount);
        opAccount.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        opAccount.setText("Cuenta ");
        opAccount.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, new javax.swing.border.MatteBorder(null)));
        opAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAccountActionPerformed(evt);
            }
        });

        btnAceptarOp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAceptarOp.setText("Aceptar");
        btnAceptarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarOpActionPerformed(evt);
            }
        });

        btnCerarOp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCerarOp.setText("Atras");
        btnCerarOp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerarOpActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Postulante.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/empresa.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUE DATOS DESEAS ACTUALIZAR...?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(opPotential, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAceptarOp)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(btnCerarOp))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(opAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(opPotential, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(opAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(btnAceptarOp)
                        .addGap(18, 18, 18)
                        .addComponent(btnCerarOp))
                    .addComponent(jLabel2))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarOpActionPerformed
        if(opPotential.isSelected()){
            JfrmPotentialUpdate pot = new JfrmPotentialUpdate(adviser_email_parameter,email_to_change);
            setVisible(false);
            dispose();
           
        }
        if(opAccount.isSelected()){
            JfrmAccountUpdate acc = new JfrmAccountUpdate(adviser_email_parameter,email_to_change);
            setVisible(false);
            dispose();
           
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAceptarOpActionPerformed

    private void opAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opAccountActionPerformed

    private void opPotentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opPotentialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opPotentialActionPerformed

    private void btnCerarOpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerarOpActionPerformed
        JfrmMainView P= new JfrmMainView();
        setVisible(false);
       
      
    }//GEN-LAST:event_btnCerarOpActionPerformed

    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptarOp;
    private javax.swing.JButton btnCerarOp;
    private javax.swing.ButtonGroup grupoUsuarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton opAccount;
    private javax.swing.JRadioButton opPotential;
    // End of variables declaration//GEN-END:variables
}
