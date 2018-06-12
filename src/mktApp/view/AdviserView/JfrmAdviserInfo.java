package mktApp.view.AdviserView;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import mktApp.bussines.MainManager;
import mktApp.entity.Adviser;
import mktApp.entity.Potential;
import mktApp.view.JfrmMainView;
import mktApp.view.JfrmSignUpPotential;

/**
 *
 * @author Diego Iturrizaga
 */
public class JfrmAdviserInfo extends javax.swing.JFrame {

    String email;
    Adviser adviser = null;
    
    public JfrmAdviserInfo(String email) {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("CRM MKT");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo3.jpg"));
        JLabel fondo= new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        iniciarComponentes();
        this.email = email;
        adviser = MainManager.getAdviserUserManager().searchAdviser(email);  
    }

    public void iniciarComponentes() {
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        jLabelLastName.setText(adviser.getLast_name());
        jLabelFirstName.setText(adviser.getFirst_name());
        jLabelEmail.setText(adviser.getEmail());
        JlabelSubtittle.setText("WELCOME" + adviser.getFirst_name());

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
        jLabelfono = new javax.swing.JLabel();
        JlabelSubtittle = new javax.swing.JLabel();
        jPanelBuscarPerfil = new javax.swing.JPanel();
        btnShowPotentials = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblShowPotentials = new javax.swing.JTable();
        btnAddPotential = new javax.swing.JButton();
        jPanelPublicarAnuncios = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jboxUbicacion2 = new javax.swing.JComboBox();
        jboxCargo2 = new javax.swing.JComboBox();
        jboxRubro2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jTextDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        JPublicarAnuncio = new javax.swing.JButton();
        jLabel1razonbuscar = new javax.swing.JLabel();
        jPanelVerAnuncios = new javax.swing.JPanel();
        btnShowAccounts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblAnuncios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("First Name: ");

        jLabel3.setText("Last Name: ");

        jLabeDireccion.setText("...");

        jLabelDireccion1.setText("Email:");

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
                    .addComponent(jLabelfono, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jLabelfono, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        btnShowPotentials.setBounds(10, 10, 180, 25);

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
        jtblShowPotentials.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblShowPotentialsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblShowPotentials);

        jPanelBuscarPerfil.add(jScrollPane2);
        jScrollPane2.setBounds(10, 70, 690, 330);

        btnAddPotential.setText("Agregar Potencial Cliente");
        btnAddPotential.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPotentialActionPerformed(evt);
            }
        });
        jPanelBuscarPerfil.add(btnAddPotential);
        btnAddPotential.setBounds(220, 10, 170, 25);

        jTabbedPaneVerPubl.addTab("Clientes Potenciales", jPanelBuscarPerfil);

        jPanelPublicarAnuncios.setLayout(null);

        jboxUbicacion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Ubicacion", "Ate", "Barranco", "Bellavista", "Breña", "Callao", "Carmen de la Legua", "Cercado de Lima", "Cercado de Lima", "Chorrillos", "Comas", "El Agustino", "Independencia", "Jesús María", "La Molina", "La Perla", "La Punta", "La Victoria", "Lince", "Los Olivos", "Magdalena del Mar", "Miraflores", "Pueblo Libre", "Puente Piedra", "Rimac", "San Borja", "San Isidro", "San Juan de Lurigancho", "San Juan de Miraflores", "San Luis", "San Martin de Porres", "San Miguel", "Santa Anita", "Santa Rosa", "Santiago de Surco", "Surquillo", "Ventanilla", "Villa El Savador", "Villa María del Triunfo" }));

        jboxCargo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione Cargo", "Analista/Asistente", "Ejecutivo Comercial", "Gerencia", "Jefe / Supervisor", "Practicante", "Tecnicos Operativos", "Formador", "Vendedor", "Otros" }));

        jboxRubro2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione un Rubro", "Administracion/Servicios Generales", "Auditoria", "Banca", "Comercial", "Comercio Exterior/Aduanas", "Compras/Logistica", "Consultoria", "Contabilidad", "Finanzas", "Hoteleria/Turismo/Restaurantes", "Ingenieria", "Investigacion y Desarrollo", "Legal", "Marketing/Publicidad", "Medios Digitales / Internet", "Recursos Humanos", "Seguridad Salud Ocupacional y Medio Ambiente", "Sistemas", "Ventas", "Otros", " " }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jboxRubro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jboxCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jboxUbicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jboxUbicacion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxCargo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jboxRubro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelPublicarAnuncios.add(jPanel5);
        jPanel5.setBounds(40, 130, 600, 40);

        jLabel4.setText("Telefono");
        jPanelPublicarAnuncios.add(jLabel4);
        jLabel4.setBounds(50, 220, 60, 15);
        jPanelPublicarAnuncios.add(jTextDescripcion);
        jTextDescripcion.setBounds(190, 60, 400, 60);

        jLabel5.setText("Razon Social:");
        jPanelPublicarAnuncios.add(jLabel5);
        jLabel5.setBounds(60, 30, 80, 15);
        jPanelPublicarAnuncios.add(jTextField2);
        jTextField2.setBounds(150, 220, 140, 20);

        jLabel6.setText("Descripcion:");
        jPanelPublicarAnuncios.add(jLabel6);
        jLabel6.setBounds(60, 60, 100, 15);

        jLabel9.setText(" Web");
        jPanelPublicarAnuncios.add(jLabel9);
        jLabel9.setBounds(50, 190, 60, 15);
        jPanelPublicarAnuncios.add(jTextField10);
        jTextField10.setBounds(150, 190, 450, 20);

        JPublicarAnuncio.setText("Publicar Anuncio");
        jPanelPublicarAnuncios.add(JPublicarAnuncio);
        JPublicarAnuncio.setBounds(450, 280, 140, 25);
        jPanelPublicarAnuncios.add(jLabel1razonbuscar);
        jLabel1razonbuscar.setBounds(190, 20, 390, 30);

        jTabbedPaneVerPubl.addTab("Hacer publicaciones", jPanelPublicarAnuncios);

        jPanelVerAnuncios.setLayout(null);

        btnShowAccounts.setText("Mostrar Cuentas");
        btnShowAccounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAccountsActionPerformed(evt);
            }
        });
        jPanelVerAnuncios.add(btnShowAccounts);
        btnShowAccounts.setBounds(70, 10, 130, 25);

        jScrollPane1.setToolTipText("");
        jScrollPane1.setAutoscrolls(true);

        jtblAnuncios.setModel(new javax.swing.table.DefaultTableModel(
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
                "Empresa", "Rubro", "Cargo", "PagWeb", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtblAnuncios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblVerMasClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtblAnuncios);

        jPanelVerAnuncios.add(jScrollPane1);
        jScrollPane1.setBounds(10, 50, 690, 360);

        jTabbedPaneVerPubl.addTab("Cuentas", jPanelVerAnuncios);

        jMenu1.setText("Archivo");

        jSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        jSalir.setText("Salir");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPaneVerPubl, javax.swing.GroupLayout.DEFAULT_SIZE, 713, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPaneVerPubl, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnShowPotentialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowPotentialsActionPerformed
        // TODO add your handling code here:
        ArrayList<Potential> P = MainManager.getPotentialUserManager().searchPotentials(email);
        
        try{
            if(P.size() == 0){
                JOptionPane.showMessageDialog(this, "Aún no hay Anuncios registrados.", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        JfrmMainView MV = new JfrmMainView();
        setVisible(false);
    }//GEN-LAST:event_jSalirActionPerformed

    private void btnShowAccountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAccountsActionPerformed
        // TODO add your handling code here:
        
        //MOSTRAR 
        
    }//GEN-LAST:event_btnShowAccountsActionPerformed

    private void jtblVerMasClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblVerMasClicked
        /*ArrayList<Anuncio> A = GestorPrincipal.getGestorUsuarioEmpresa().verMisAnuncios(empresa);
                
        int fila = jtblAnuncios.rowAtPoint(evt.getPoint());
        int colum = jtblAnuncios.columnAtPoint(evt.getPoint());
        
        if(fila>=0 && colum==3 && jtblAnuncios.isEnabled()){
            System.out.println(fila);
        }*/
    }//GEN-LAST:event_jtblVerMasClicked

    private void jtblShowPotentialsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblShowPotentialsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jtblShowPotentialsMouseClicked

    private void btnAddPotentialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPotentialActionPerformed
        // TODO add your handling code here:
        JfrmSignUpPotential P = new JfrmSignUpPotential();
        setVisible(false);
        
    }//GEN-LAST:event_btnAddPotentialActionPerformed

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
                new JfrmAdviserInfo("diego").setVisible(true);
            }
        });
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JPublicarAnuncio;
    private javax.swing.JLabel JlabelSubtittle;
    private javax.swing.JButton btnAddPotential;
    private javax.swing.JButton btnShowAccounts;
    private javax.swing.JButton btnShowPotentials;
    private javax.swing.JLabel jLabeDireccion;
    private javax.swing.JLabel jLabel1razonbuscar;
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
    private javax.swing.JLabel jLabelfono;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelBuscarPerfil;
    private javax.swing.JPanel jPanelPerfil;
    private javax.swing.JPanel jPanelPublicarAnuncios;
    private javax.swing.JPanel jPanelVerAnuncios;
    public static javax.swing.JMenuItem jSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTabbedPane jTabbedPaneVerPubl;
    private javax.swing.JTextField jTextDescripcion;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JComboBox jboxCargo2;
    private javax.swing.JComboBox jboxRubro2;
    private javax.swing.JComboBox jboxUbicacion2;
    private javax.swing.JTable jtblAnuncios;
    private javax.swing.JTable jtblShowPotentials;
    // End of variables declaration//GEN-END:variables
}
