package mktApp.view.AdviserView;

import Promoción.Contact;
import Promoción.Mailing;
import Ventanas.Interfaz;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mktApp.bussines.MainManager;
import mktApp.entity.Account;
import mktApp.entity.Adviser;
import mktApp.entity.Potential;
import mktApp.view.UpdateView.JfrmAccountTranslateSignUp;
import mktApp.view.JfrmMainView;
import mktApp.view.JfrmPotentialSignUp;
import mktApp.view.JfrmAccountSignUp;
import mktApp.view.UpdateView.JfrmUpdateOptions;

/**
 *
 * @author DIEGO
 */
public class JfrmAdviserInfo extends javax.swing.JFrame {
    
    String adviser_email;
    Adviser adviser = null;
    
    /**
     * Creates new form JfrmAdviserInfo
     */

    public JfrmAdviserInfo(String email) {
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
        
        this.adviser_email = email;
        adviser = MainManager.getAdviserUserManager().searchAdviser(email);  
        iniciarComponentes();
    }

    public void iniciarComponentes() {
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        jLabelLastName.setText(adviser.getLast_name());
        jLabelFirstName.setText(adviser.getFirst_name());
        jLabelEmail.setText(adviser.getEmail());
        JlabelSubtittle.setText("Welcome  " + adviser.getFirst_name());
        jLabelRole.setText(adviser.getRole_job());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneVerPubl = new javax.swing.JTabbedPane();
        jPanelPerfil = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabeDireccion = new javax.swing.JLabel();
        jLabelDireccion1 = new javax.swing.JLabel();
        jLabelFirstName = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelRole = new javax.swing.JLabel();
        JlabelSubtittle = new javax.swing.JLabel();
        jPanelBuscarPerfil = new javax.swing.JPanel();
        btnShowPotentials = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblShowPotentials = new javax.swing.JTable();
        btnAddPotential = new javax.swing.JButton();
        jPanelPublicarAnuncios = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtxfPotentialEmailToTranslate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxfEmailToUpdate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnPotentialToAccount = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jPanelVerAnuncios = new javax.swing.JPanel();
        btnShowAccounts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblShowAccounts = new javax.swing.JTable();
        btnAddAccount = new javax.swing.JButton();
        btnGoWeb = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre :");

        jLabel3.setText("Apellido : ");

        jLabeDireccion.setText("Cargo : ");

        jLabelDireccion1.setText("Correo :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabeDireccion)
                    .addComponent(jLabelDireccion1))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelRole, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap(298, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabeDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelRole, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        JlabelSubtittle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanelPerfilLayout = new javax.swing.GroupLayout(jPanelPerfil);
        jPanelPerfil.setLayout(jPanelPerfilLayout);
        jPanelPerfilLayout.setHorizontalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(JlabelSubtittle, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPerfilLayout.setVerticalGroup(
            jPanelPerfilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPerfilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JlabelSubtittle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        jTabbedPaneVerPubl.addTab("Asesor", jPanelPerfil);

        jPanelBuscarPerfil.setLayout(null);

        btnShowPotentials.setText("Mostrar Potenciales Clientes");
        btnShowPotentials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowPotentialsActionPerformed(evt);
            }
        });
        jPanelBuscarPerfil.add(btnShowPotentials);
        btnShowPotentials.setBounds(10, 10, 200, 32);

        jtblShowPotentials.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Teléfono", "Empresa", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtblShowPotentials);

        jPanelBuscarPerfil.add(jScrollPane2);
        jScrollPane2.setBounds(10, 50, 690, 350);

        btnAddPotential.setText("Agregar Potencial Cliente");
        btnAddPotential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPotentialActionPerformed(evt);
            }
        });
        jPanelBuscarPerfil.add(btnAddPotential);
        btnAddPotential.setBounds(220, 10, 180, 32);

        jTabbedPaneVerPubl.addTab("Clientes Potenciales", jPanelBuscarPerfil);

        jPanelPublicarAnuncios.setLayout(null);

        jLabel4.setText("Correo :");
        jPanelPublicarAnuncios.add(jLabel4);
        jLabel4.setBounds(90, 210, 60, 16);
        jPanelPublicarAnuncios.add(jtxfPotentialEmailToTranslate);
        jtxfPotentialEmailToTranslate.setBounds(260, 70, 230, 24);

        jLabel5.setText("Correo de cliente potencial : ");
        jPanelPublicarAnuncios.add(jLabel5);
        jLabel5.setBounds(90, 60, 180, 40);
        jPanelPublicarAnuncios.add(jtxfEmailToUpdate);
        jtxfEmailToUpdate.setBounds(260, 210, 230, 24);

        jLabel6.setText("PASAR DE POTENCIAL A CUENTA");
        jPanelPublicarAnuncios.add(jLabel6);
        jLabel6.setBounds(40, 20, 200, 30);

        jLabel9.setText("ACTUALIZAR DATOS ");
        jPanelPublicarAnuncios.add(jLabel9);
        jLabel9.setBounds(40, 170, 190, 16);

        btnPotentialToAccount.setText("Pasar Cuenta");
        btnPotentialToAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotentialToAccountActionPerformed(evt);
            }
        });
        jPanelPublicarAnuncios.add(btnPotentialToAccount);
        btnPotentialToAccount.setBounds(530, 30, 140, 80);

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanelPublicarAnuncios.add(btnUpdate);
        btnUpdate.setBounds(530, 190, 140, 80);

        jTabbedPaneVerPubl.addTab("Actualización de Datos", jPanelPublicarAnuncios);

        jPanelVerAnuncios.setLayout(null);

        btnShowAccounts.setText("Mostrar Cuentas");
        btnShowAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAccountsActionPerformed(evt);
            }
        });
        jPanelVerAnuncios.add(btnShowAccounts);
        btnShowAccounts.setBounds(10, 10, 130, 32);

        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        jtblShowAccounts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Empresa", "Correo", "Telefono", "Combo", "Metodo de Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblShowAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblVerMasClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblShowAccounts);

        jPanelVerAnuncios.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 690, 360);

        btnAddAccount.setText("Agregar Nueva Cuenta");
        btnAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAccountActionPerformed(evt);
            }
        });
        jPanelVerAnuncios.add(btnAddAccount);
        btnAddAccount.setBounds(170, 10, 190, 32);

        btnGoWeb.setText("Enviar Link ");
        btnGoWeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoWebActionPerformed(evt);
            }
        });
        jPanelVerAnuncios.add(btnGoWeb);
        btnGoWeb.setBounds(510, 10, 160, 32);

        jTabbedPaneVerPubl.addTab("Cuentas de Clientes", jPanelVerAnuncios);

        jMenu1.setText("Opciones");

        jSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jSalir.setText("Cerrar Sesión");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneVerPubl)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPaneVerPubl, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        JfrmMainView MV = new JfrmMainView();
        setVisible(false);
    }//GEN-LAST:event_jSalirActionPerformed

    private void jtblVerMasClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblVerMasClicked

    }//GEN-LAST:event_jtblVerMasClicked

    private void btnShowAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAccountsActionPerformed
        // TODO add your handling code here:
        ArrayList<Account> Acc = MainManager.getAccountUserManager().searchAccounts(adviser_email);
        
        try{
            if(Acc.size() == 0){
                JOptionPane.showMessageDialog(this, "Aún no hay Cuentas registrados.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                Account account = null;
                for(int i=0; i<Acc.size(); i++){
                    account = Acc.get(i);
                    jtblShowAccounts.getModel().setValueAt(account.getName_account(), i, 0);
                    jtblShowAccounts.getModel().setValueAt(account.getEmail(), i, 1);
                    jtblShowAccounts.getModel().setValueAt(account.getMobile(), i, 2);
                    jtblShowAccounts.getModel().setValueAt(account.getName_combo(), i, 3);
                    jtblShowAccounts.getModel().setValueAt(account.getPay_method(), i, 4);
                }
            }
        }catch(Exception E){
        }
    }//GEN-LAST:event_btnShowAccountsActionPerformed

    private void btnAddPotentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPotentialActionPerformed
        // TODO add your handling code here:
        JfrmPotentialSignUp P = new JfrmPotentialSignUp(adviser_email);
        setVisible(false);

    }//GEN-LAST:event_btnAddPotentialActionPerformed

    private void btnShowPotentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPotentialsActionPerformed
        // TODO add your handling code here:
        ArrayList<Potential> P = MainManager.getPotentialUserManager().searchPotentials(adviser_email);

        try{
            if(P.size() == 0){
                JOptionPane.showMessageDialog(this, "Aún no hay Cliebtes pontenciales registrados.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                Potential potential = null;
                for(int i=0; i<P.size(); i++){
                    potential = P.get(i);
                    jtblShowPotentials.getModel().setValueAt(potential.getFirst_name(), i, 0);
                    jtblShowPotentials.getModel().setValueAt(potential.getLast_name(), i, 1);
                    jtblShowPotentials.getModel().setValueAt(potential.getMobile(), i, 2);
                    jtblShowPotentials.getModel().setValueAt(potential.getName_company(), i, 3);
                    jtblShowPotentials.getModel().setValueAt(potential.getEmail(), i, 4);
                }
            }
        }catch(Exception E){
        }
    }//GEN-LAST:event_btnShowPotentialsActionPerformed

    private void btnAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAccountActionPerformed
        // TODO add your handling code here:
        JfrmAccountSignUp Acc = new JfrmAccountSignUp(adviser_email);
        setVisible(false);
    }//GEN-LAST:event_btnAddAccountActionPerformed

    private void btnPotentialToAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotentialToAccountActionPerformed
        // TODO add your handling code here:
        String email_to_translate = jtxfPotentialEmailToTranslate.getText();
        JfrmAccountTranslateSignUp trans = new JfrmAccountTranslateSignUp(adviser_email,email_to_translate);
        setVisible(false);
    }//GEN-LAST:event_btnPotentialToAccountActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String email_to_change = jtxfEmailToUpdate.getText();
        JfrmUpdateOptions update = new JfrmUpdateOptions(adviser_email,email_to_change);
        setVisible(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnGoWebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoWebActionPerformed
        // TODO add your handling code here:
        Interfaz IU = new Interfaz(adviser_email);
        dispose();
    }//GEN-LAST:event_btnGoWebActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelSubtittle;
    private javax.swing.JButton btnAddAccount;
    private javax.swing.JButton btnAddPotential;
    private javax.swing.JButton btnGoWeb;
    private javax.swing.JButton btnPotentialToAccount;
    private javax.swing.JButton btnShowAccounts;
    private javax.swing.JButton btnShowPotentials;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabeDireccion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelDireccion1;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBuscarPerfil;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelPublicarAnuncios;
    private javax.swing.JPanel jPanelVerAnuncios;
    public static javax.swing.JMenuItem jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPaneVerPubl;
    private javax.swing.JTable jtblShowAccounts;
    private javax.swing.JTable jtblShowPotentials;
    private javax.swing.JTextField jtxfEmailToUpdate;
    private javax.swing.JTextField jtxfPotentialEmailToTranslate;
    // End of variables declaration//GEN-END:variables
}
