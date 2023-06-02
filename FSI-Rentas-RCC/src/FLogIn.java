
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Rogelio Cervantes Castellon
 */
public class FLogIn extends javax.swing.JFrame {

    Conexion cnx = new Conexion();
    ImageIcon icon = new ImageIcon(getClass().getResource("/img/icons/voidcat.png"));

    public FLogIn() {
        initComponents();
        setLocationRelativeTo(this);
        setIconImage(icon.getImage());
        setTitle("Inicio de sesión");
        
        // Se conecta a la base de datos
        if (cnx.conectar("localhost", "rentas", "root", "") == 0) {
            JOptionPane.showMessageDialog(null, "Error de conexion", "Error", 4);
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PEncabezado = new javax.swing.JPanel();
        LVOIDCAT = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TFIDUser = new javax.swing.JTextField();
        CBTypeUser = new javax.swing.JComboBox<>();
        BEntrar = new javax.swing.JButton();
        LCopyright = new javax.swing.JLabel();
        BInvitado = new javax.swing.JButton();
        PFContrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(29, 29, 29));

        PEncabezado.setBackground(new java.awt.Color(90, 0, 52));

        LVOIDCAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/voidcat_logo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(227, 227, 227));
        jLabel2.setText("Sistema de renta de viviendas");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(227, 227, 227));
        jLabel3.setText("VOIDCAT");

        javax.swing.GroupLayout PEncabezadoLayout = new javax.swing.GroupLayout(PEncabezado);
        PEncabezado.setLayout(PEncabezadoLayout);
        PEncabezadoLayout.setHorizontalGroup(
            PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LVOIDCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PEncabezadoLayout.setVerticalGroup(
            PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LVOIDCAT, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addGroup(PEncabezadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );

        TFIDUser.setBackground(new java.awt.Color(49, 49, 49));
        TFIDUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFIDUser.setForeground(new java.awt.Color(227, 227, 227));
        TFIDUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFIDUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        CBTypeUser.setBackground(new java.awt.Color(227, 227, 227));
        CBTypeUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBTypeUser.setForeground(new java.awt.Color(29, 29, 29));
        CBTypeUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Arrendatario", "Arrendador", "Administrador" }));
        CBTypeUser.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N

        BEntrar.setBackground(new java.awt.Color(227, 227, 227));
        BEntrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEntrar.setForeground(new java.awt.Color(29, 29, 29));
        BEntrar.setText("Entrar");
        BEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEntrarActionPerformed(evt);
            }
        });

        LCopyright.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        LCopyright.setForeground(new java.awt.Color(239, 0, 62));
        LCopyright.setText("Copyright VOIDCAT © 2023");

        BInvitado.setBackground(new java.awt.Color(227, 227, 227));
        BInvitado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BInvitado.setForeground(new java.awt.Color(29, 29, 29));
        BInvitado.setText("Continuar como invitado");
        BInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInvitadoActionPerformed(evt);
            }
        });

        PFContrasena.setBackground(new java.awt.Color(49, 49, 49));
        PFContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PFContrasena.setForeground(new java.awt.Color(227, 227, 227));
        PFContrasena.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(LCopyright))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BInvitado, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CBTypeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFIDUser)
                            .addComponent(CBTypeUser, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PFContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BInvitado)
                .addGap(31, 31, 31)
                .addComponent(LCopyright))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEntrarActionPerformed
        String id = TFIDUser.getText();
        String pass = PFContrasena.getText();

        if (id.equals("") || pass.equals("")) {
            JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", 2);
        } else {
            /*
            En cualquier case del switch, se crea un objeto del respectivo JFrame, se usa el id del usuario 
            obtenido en la consulta para obtener los datos necesarios dentro del JFrame usando setUser.
            Abre el JFrame correspondiente y cierra este.
            */
            switch (CBTypeUser.getSelectedIndex()) {
                case 1: // Arrendatario
                    String idtario = cnx.obtenerDato("SELECT idarrendatario FROM arrendatario WHERE idarrendatario = '" + id + "' AND passtario = '" + pass + "'");
                    if (idtario == null || idtario.equals("")) {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", 2);
                    } else {
                        FArrendatario FTario = new FArrendatario();
                        FTario.setUser(idtario);
                        FTario.setVisible(true);
                        this.dispose();
                    }
                    break;
                case 2: // Arrendador
                    String idador = cnx.obtenerDato("SELECT idarrendador FROM arrendador WHERE idarrendador = '" + id + "' AND passador = '" + pass + "'");
                    if (idador == null || idador.equals("")) {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", 2);
                    } else {
                        FArrendador FAdor = new FArrendador();
                        FAdor.setUser(idador);
                        FAdor.setVisible(true);
                        this.dispose();
                    }
                    break;
                case 3: // Administrador
                    String idadmin = cnx.obtenerDato("SELECT idadmin FROM admin WHERE idadmin = '" + id + "' AND passadmin = '" + pass + "'");
                    if (idadmin == null || idadmin.equals("")) {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", 2);
                    } else {
                        FAdministrador FAdmin = new FAdministrador();
                        FAdmin.setUser(idadmin);
                        FAdmin.setVisible(true);
                        this.dispose();
                        break;
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Datos incorrectos", "Advertencia", 2);
            }
        }


    }//GEN-LAST:event_BEntrarActionPerformed

    private void BInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInvitadoActionPerformed
        // Abre el JFrame de FInvitado y cierra este.
        FInvitado FInv = new FInvitado();
        FInv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BInvitadoActionPerformed

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
            java.util.logging.Logger.getLogger(FLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BEntrar;
    private javax.swing.JButton BInvitado;
    private javax.swing.JComboBox<String> CBTypeUser;
    private javax.swing.JLabel LCopyright;
    private javax.swing.JLabel LVOIDCAT;
    private javax.swing.JPanel PEncabezado;
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JTextField TFIDUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
