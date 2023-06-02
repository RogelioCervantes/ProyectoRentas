import java.awt.Color;
import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Rogelio Cervantes Castellon
 */
public class FInvitado extends javax.swing.JFrame {

    Conexion cnx;
    ImageIcon foto;
    String idviv;
    ImageIcon icon = new ImageIcon(getClass().getResource("/img/icons/voidcat.png"));

    LocalDate fechaLocal = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaFormateada = fechaLocal.format(formato);
    
    public FInvitado() {
        initComponents();
        setIconImage(icon.getImage());
        setTitle("Solicitud");
        
        LFecha.setText(fechaFormateada);
        SPInv.getViewport().setBackground(new Color(29, 29, 29));
        TInvitado.setRowHeight(64);

        cnx = new Conexion();
        // Se conecta a la base de datos y usa los datos de una consulta para mostrarlos en la JTable TInvitado.
        if (cnx.conectar("localhost", "rentas", "root", null) == 1) {
            String sql = "SELECT idvivienda, fotoviv, tipo, detalles, nombreador, fotoador "
                    + "FROM vivienda, arrendador "
                    + "WHERE arrendador_idarrendador = idarrendador "
                    + "ORDER BY idvivienda";
            cnx.entablar(sql, TInvitado);
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PFondo = new javax.swing.JPanel();
        TPInvitado = new javax.swing.JTabbedPane();
        PInicio = new javax.swing.JPanel();
        SPInv = new javax.swing.JScrollPane();
        TInvitado = new javax.swing.JTable();
        LFotoViv = new javax.swing.JLabel();
        TADetalles = new javax.swing.JTextArea();
        LFotoAdor = new javax.swing.JLabel();
        LNombreAdor = new javax.swing.JLabel();
        LTipo = new javax.swing.JLabel();
        PRegistro = new javax.swing.JPanel();
        TFNombre = new javax.swing.JTextField();
        CBSexo = new javax.swing.JComboBox<>();
        LFotoReg = new javax.swing.JLabel();
        BFoto = new javax.swing.JButton();
        BRegistrar = new javax.swing.JButton();
        PFContrasena = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        LVOIDCAT = new javax.swing.JLabel();
        Header1 = new javax.swing.JLabel();
        LEncabezado = new javax.swing.JLabel();
        LFecha = new javax.swing.JLabel();
        LVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        PFondo.setBackground(new java.awt.Color(49, 49, 49));

        TPInvitado.setBackground(new java.awt.Color(29, 29, 29));
        TPInvitado.setForeground(new java.awt.Color(227, 227, 227));
        TPInvitado.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        PInicio.setBackground(new java.awt.Color(49, 49, 49));

        TInvitado.setBackground(new java.awt.Color(29, 29, 29));
        TInvitado.setForeground(new java.awt.Color(227, 227, 227));
        TInvitado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TInvitado.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TInvitado.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TInvitado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TInvitadoMousePressed(evt);
            }
        });
        SPInv.setViewportView(TInvitado);

        LFotoViv.setBackground(new java.awt.Color(29, 29, 29));
        LFotoViv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto de la vivienda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LFotoViv.setOpaque(true);

        TADetalles.setBackground(new java.awt.Color(29, 29, 29));
        TADetalles.setColumns(20);
        TADetalles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TADetalles.setForeground(new java.awt.Color(227, 227, 227));
        TADetalles.setRows(5);
        TADetalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles de la vivienda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LFotoAdor.setBackground(new java.awt.Color(29, 29, 29));
        LFotoAdor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoAdor.setOpaque(true);

        LNombreAdor.setBackground(new java.awt.Color(29, 29, 29));
        LNombreAdor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LNombreAdor.setForeground(new java.awt.Color(227, 227, 227));
        LNombreAdor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del arrendador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LNombreAdor.setOpaque(true);

        LTipo.setBackground(new java.awt.Color(29, 29, 29));
        LTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LTipo.setForeground(new java.awt.Color(227, 227, 227));
        LTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de vivienda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LTipo.setOpaque(true);

        javax.swing.GroupLayout PInicioLayout = new javax.swing.GroupLayout(PInicio);
        PInicio.setLayout(PInicioLayout);
        PInicioLayout.setHorizontalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPInv, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PInicioLayout.createSequentialGroup()
                        .addComponent(LNombreAdor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LFotoAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LFotoViv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TADetalles, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
                .addContainerGap())
        );
        PInicioLayout.setVerticalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SPInv)
                    .addGroup(PInicioLayout.createSequentialGroup()
                        .addGroup(PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LFotoAdor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LNombreAdor, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TADetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LFotoViv, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        TPInvitado.addTab("Inicio", PInicio);

        PRegistro.setBackground(new java.awt.Color(49, 49, 49));

        TFNombre.setBackground(new java.awt.Color(29, 29, 29));
        TFNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TFNombre.setForeground(new java.awt.Color(227, 227, 227));
        TFNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        TFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNombreActionPerformed(evt);
            }
        });

        CBSexo.setBackground(new java.awt.Color(227, 227, 227));
        CBSexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CBSexo.setForeground(new java.awt.Color(29, 29, 29));
        CBSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Hombre", "Mujer" }));
        CBSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N

        LFotoReg.setBackground(new java.awt.Color(29, 29, 29));
        LFotoReg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoReg.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LFotoReg.setOpaque(true);

        BFoto.setBackground(new java.awt.Color(227, 227, 227));
        BFoto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BFoto.setForeground(new java.awt.Color(29, 29, 29));
        BFoto.setText("Subir foto");
        BFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFotoActionPerformed(evt);
            }
        });

        BRegistrar.setBackground(new java.awt.Color(227, 227, 227));
        BRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BRegistrar.setForeground(new java.awt.Color(29, 29, 29));
        BRegistrar.setText("Solicitar registro");
        BRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegistrarActionPerformed(evt);
            }
        });

        PFContrasena.setBackground(new java.awt.Color(29, 29, 29));
        PFContrasena.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PFContrasena.setForeground(new java.awt.Color(227, 227, 227));
        PFContrasena.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        javax.swing.GroupLayout PRegistroLayout = new javax.swing.GroupLayout(PRegistro);
        PRegistro.setLayout(PRegistroLayout);
        PRegistroLayout.setHorizontalGroup(
            PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRegistroLayout.createSequentialGroup()
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(LFotoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                            .addComponent(CBSexo, 0, 634, Short.MAX_VALUE)
                            .addComponent(TFNombre)
                            .addComponent(PFContrasena))))
                .addContainerGap(323, Short.MAX_VALUE))
        );
        PRegistroLayout.setVerticalGroup(
            PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PRegistroLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(TFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PFContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LFotoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PRegistroLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(BFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(BRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        TPInvitado.addTab("Registro", PRegistro);

        jPanel1.setBackground(new java.awt.Color(90, 0, 52));

        LVOIDCAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LVOIDCAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/voidcat_logo.png"))); // NOI18N

        Header1.setBackground(new java.awt.Color(90, 0, 52));
        Header1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Header1.setForeground(new java.awt.Color(227, 227, 227));
        Header1.setText("Sistema de renta de viviendas");

        LEncabezado.setBackground(new java.awt.Color(90, 0, 53));
        LEncabezado.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LEncabezado.setForeground(new java.awt.Color(227, 227, 227));
        LEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEncabezado.setText("Solicitante");

        LFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LFecha.setForeground(new java.awt.Color(227, 227, 227));
        LFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 227, 227)), "Fecha de hoy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LVolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/volver1.png"))); // NOI18N
        LVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LVolverMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LVolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LVolverMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LVolverMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LVOIDCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LEncabezado)
                    .addComponent(Header1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LVOIDCAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(LFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Header1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LEncabezado)
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LVolver)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout PFondoLayout = new javax.swing.GroupLayout(PFondo);
        PFondo.setLayout(PFondoLayout);
        PFondoLayout.setHorizontalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPInvitado)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPInvitado))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TInvitadoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TInvitadoMousePressed
        /*
        Segun el renglon que se seleccione en el JTable, los datos dentro de ese 
        renglon se mostraran en los campos correspondientes fuera del mismo.
        */
        
        int ren = TInvitado.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TInvitado.getModel();

        if (ren >= 0) {
            idviv = modelo.getValueAt(ren, 0).toString();
            LFotoViv.setIcon((ImageIcon) modelo.getValueAt(ren, 1));
            LTipo.setText(modelo.getValueAt(ren, 2).toString());
            TADetalles.setText(modelo.getValueAt(ren, 3).toString());
            LNombreAdor.setText(modelo.getValueAt(ren, 4).toString());
            LFotoAdor.setIcon(new ImageIcon(cnx.escalarImagen(((ImageIcon) modelo.getValueAt(ren, 5)).getImage(), 86, 86)));
        }
    }//GEN-LAST:event_TInvitadoMousePressed

    private void BFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFotoActionPerformed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            foto = new ImageIcon(archivo.getPath());
            LFotoReg.setIcon(new ImageIcon(cnx.escalarImagen(foto.getImage(), 128, 128)));
        }
    }//GEN-LAST:event_BFotoActionPerformed

    private void BRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegistrarActionPerformed
        /*
        Toma los datos dentro de los campos en el panel de registro y el id de la 
        vivienda seleccionada del JTable para, usando la clase Solicitud, insertar 
        los datos en la tabla solicitudes de la base de datos.
        */
        
        if (TFNombre.getText().equals("") || CBSexo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos.\nVuelva a intentarlo.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            String nom = TFNombre.getText();
            String pass = PFContrasena.getText();
            String sex = CBSexo.getSelectedItem().toString();
            String viv = idviv;
            ImageIcon pic = foto;

            Solicitud sol = new Solicitud(nom, sex, viv, pass, pic);
            if (sol.insertar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Solicitud enviada", "Solicitud", JOptionPane.INFORMATION_MESSAGE);
                TFNombre.setText("");
                PFContrasena.setText("");
                CBSexo.setSelectedIndex(0);
                LFotoReg.setIcon(null);
            } else {
                JOptionPane.showMessageDialog(null, "Registro faliido", "Fallo", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_BRegistrarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

    private void TFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNombreActionPerformed

    private void LVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LVolverMouseClicked

    }//GEN-LAST:event_LVolverMouseClicked

    private void LVolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LVolverMouseEntered
        LVolver.setIcon(new ImageIcon(getClass().getResource("/img/icons/volver2.png")));
    }//GEN-LAST:event_LVolverMouseEntered

    private void LVolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LVolverMouseExited
        LVolver.setIcon(new ImageIcon(getClass().getResource("/img/icons/volver1.png")));
    }//GEN-LAST:event_LVolverMouseExited

    private void LVolverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LVolverMousePressed
        LVolver.setIcon(new ImageIcon(getClass().getResource("/img/icons/volver3.png")));
        FLogIn login = new FLogIn();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LVolverMousePressed

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
            java.util.logging.Logger.getLogger(FInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FInvitado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FInvitado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BFoto;
    private javax.swing.JButton BRegistrar;
    private javax.swing.JComboBox<String> CBSexo;
    private javax.swing.JLabel Header1;
    private javax.swing.JLabel LEncabezado;
    private javax.swing.JLabel LFecha;
    private javax.swing.JLabel LFotoAdor;
    private javax.swing.JLabel LFotoReg;
    private javax.swing.JLabel LFotoViv;
    private javax.swing.JLabel LNombreAdor;
    private javax.swing.JLabel LTipo;
    private javax.swing.JLabel LVOIDCAT;
    private javax.swing.JLabel LVolver;
    private javax.swing.JPasswordField PFContrasena;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PInicio;
    private javax.swing.JPanel PRegistro;
    private javax.swing.JScrollPane SPInv;
    private javax.swing.JTextArea TADetalles;
    private javax.swing.JTextField TFNombre;
    private javax.swing.JTable TInvitado;
    private javax.swing.JTabbedPane TPInvitado;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
