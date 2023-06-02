
import java.awt.Color;
import java.io.File;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * @author Rogelio Cervantes Castellon
 */
public class FAdministrador extends javax.swing.JFrame {

    ArrayList<ArrayList<String>> datos = new ArrayList();
    ArrayList<String> series = new ArrayList();

    String usuario;
    GraficaXY chart;
    Conexion cnx;
    ImageIcon foto;
    ImageIcon icon = new ImageIcon(getClass().getResource("/img/icons/voidcat.png"));

    LocalDate fechaLocal = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaFormateada = fechaLocal.format(formato);

    public FAdministrador() {
        initComponents();
        setLocationRelativeTo(this);
        setIconImage(icon.getImage());
        setTitle("Administrador");
        limpiarTabla(TPagos);

        SPTario.getViewport().setBackground(new Color(29, 29, 29));
        SPAdor.getViewport().setBackground(new Color(29, 29, 29));
        SPViv.getViewport().setBackground(new Color(29, 29, 29));
        SPCon.getViewport().setBackground(new Color(29, 29, 29));
        SPPago.getViewport().setBackground(new Color(29, 29, 29));
        SPGrafica.getViewport().setBackground(new Color(29, 29, 29));

        TGrafica.setRowHeight(64);
        TTario.setRowHeight(64);
        TAdores.setRowHeight(64);
        TVivienda.setRowHeight(64);
        TContratos.setRowHeight(48);
        TPagos.setRowHeight(48);
        LFecha.setText(fechaFormateada);

        cnx = new Conexion();
        if (cnx.conectar("localhost", "rentas", "root", null) == 1) {
            actualizarTodo();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD", "Error", 4);
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PFondo = new javax.swing.JPanel();
        PEncabezado = new javax.swing.JPanel();
        LEncabezado = new javax.swing.JLabel();
        LFecha = new javax.swing.JLabel();
        LVOIDCAT = new javax.swing.JLabel();
        Header1 = new javax.swing.JLabel();
        LAdmin = new javax.swing.JLabel();
        LClave = new javax.swing.JLabel();
        LVolver = new javax.swing.JLabel();
        TPAdmin = new javax.swing.JTabbedPane();
        PArrendatarios = new javax.swing.JPanel();
        SPTario = new javax.swing.JScrollPane();
        TTario = new javax.swing.JTable();
        LFotoArrendatario = new javax.swing.JLabel();
        BFotoArrendatario = new javax.swing.JButton();
        TFNombreArrendatario = new javax.swing.JTextField();
        TFEstatus = new javax.swing.JTextField();
        CBSexoArrendatario = new javax.swing.JComboBox<>();
        BInsertarArrendatario = new javax.swing.JButton();
        BActualizarArrendatario = new javax.swing.JButton();
        BEliminarArrendatario = new javax.swing.JButton();
        BReporteArrendatario = new javax.swing.JButton();
        LClaveArrendatario = new javax.swing.JLabel();
        PFPassTario = new javax.swing.JPasswordField();
        PArrendadores = new javax.swing.JPanel();
        SPAdor = new javax.swing.JScrollPane();
        TAdores = new javax.swing.JTable();
        LFotoArrendador = new javax.swing.JLabel();
        BFotoAdor = new javax.swing.JButton();
        TFNombreArrendador = new javax.swing.JTextField();
        TFDireccion = new javax.swing.JTextField();
        TFContacto = new javax.swing.JTextField();
        CBSexoArrendador = new javax.swing.JComboBox<>();
        BInsertarAdor = new javax.swing.JButton();
        BActualizarAdor = new javax.swing.JButton();
        BEliminarAdor = new javax.swing.JButton();
        BReporteAdor = new javax.swing.JButton();
        LClaveArrendador = new javax.swing.JLabel();
        PFPassAdor = new javax.swing.JPasswordField();
        PViviendas = new javax.swing.JPanel();
        SPViv = new javax.swing.JScrollPane();
        TVivienda = new javax.swing.JTable();
        CBTipo = new javax.swing.JComboBox<>();
        BFotoViviendas = new javax.swing.JButton();
        BInsertarViviendas = new javax.swing.JButton();
        BActualizarViviendas = new javax.swing.JButton();
        BEliminarViviendas = new javax.swing.JButton();
        BReporteViviendas = new javax.swing.JButton();
        LNombreAdorViv = new javax.swing.JLabel();
        CBArrendadorViv = new javax.swing.JComboBox<>();
        LClaveViv = new javax.swing.JLabel();
        LFotoViviendas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TADetalles = new javax.swing.JTextArea();
        PContratosPagos = new javax.swing.JPanel();
        SPCon = new javax.swing.JScrollPane();
        TContratos = new javax.swing.JTable();
        SPPago = new javax.swing.JScrollPane();
        TPagos = new javax.swing.JTable();
        PManipularContratos = new javax.swing.JPanel();
        TFDuracion = new javax.swing.JTextField();
        TFMontoCon = new javax.swing.JTextField();
        TFObservaciones = new javax.swing.JTextField();
        DCFechaSig = new com.toedter.calendar.JDateChooser();
        DCFechaInicio = new com.toedter.calendar.JDateChooser();
        BInsertarCon = new javax.swing.JButton();
        BActualizarCon = new javax.swing.JButton();
        BEliminarCon = new javax.swing.JButton();
        BReporteCon = new javax.swing.JButton();
        LIDContrato = new javax.swing.JLabel();
        CBIDViv = new javax.swing.JComboBox<>();
        CBIDTario = new javax.swing.JComboBox<>();
        PManipularPagos = new javax.swing.JPanel();
        BInsertarPago = new javax.swing.JButton();
        BActualizarPago = new javax.swing.JButton();
        BEliminarPago = new javax.swing.JButton();
        BReportePago = new javax.swing.JButton();
        TFMontoPago = new javax.swing.JTextField();
        DCFechaPago = new com.toedter.calendar.JDateChooser();
        LIDPago = new javax.swing.JLabel();
        CBIDCon = new javax.swing.JComboBox<>();
        CBOrdenarCon = new javax.swing.JComboBox<>();
        PGraficas = new javax.swing.JPanel();
        PFondoGraf = new javax.swing.JPanel();
        CBConsultas = new javax.swing.JComboBox<>();
        PGrafica = new javax.swing.JPanel();
        PTablaGrafica = new javax.swing.JPanel();
        SPGrafica = new javax.swing.JScrollPane();
        TGrafica = new javax.swing.JTable();
        BReporte = new javax.swing.JButton();

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

        PEncabezado.setBackground(new java.awt.Color(90, 0, 52));

        LEncabezado.setBackground(new java.awt.Color(90, 0, 53));
        LEncabezado.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LEncabezado.setForeground(new java.awt.Color(227, 227, 227));
        LEncabezado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEncabezado.setText("Administrador");

        LFecha.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LFecha.setForeground(new java.awt.Color(227, 227, 227));
        LFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(227, 227, 227)), "Fecha de hoy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LVOIDCAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LVOIDCAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/voidcat_logo.png"))); // NOI18N

        Header1.setBackground(new java.awt.Color(90, 0, 52));
        Header1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Header1.setForeground(new java.awt.Color(227, 227, 227));
        Header1.setText("Sistema de renta de viviendas");

        LAdmin.setBackground(new java.awt.Color(90, 0, 52));
        LAdmin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LAdmin.setForeground(new java.awt.Color(227, 227, 227));
        LAdmin.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LAdmin.setText("Nombre:");

        LClave.setBackground(new java.awt.Color(90, 0, 52));
        LClave.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LClave.setForeground(new java.awt.Color(227, 227, 227));
        LClave.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LClave.setText("Clave:");

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

        javax.swing.GroupLayout PEncabezadoLayout = new javax.swing.GroupLayout(PEncabezado);
        PEncabezado.setLayout(PEncabezadoLayout);
        PEncabezadoLayout.setHorizontalGroup(
            PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LVOIDCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LEncabezado)
                    .addComponent(Header1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LAdmin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LClave, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(LFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PEncabezadoLayout.setVerticalGroup(
            PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LVOIDCAT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                    .addComponent(LFecha, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PEncabezadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Header1)
                            .addComponent(LAdmin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LEncabezado)
                            .addComponent(LClave))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LVolver)
                .addGap(18, 18, 18))
        );

        TPAdmin.setBackground(new java.awt.Color(29, 29, 29));
        TPAdmin.setForeground(new java.awt.Color(227, 227, 227));
        TPAdmin.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TPAdmin.setOpaque(true);

        PArrendatarios.setBackground(new java.awt.Color(49, 49, 49));

        SPTario.setBackground(new java.awt.Color(29, 29, 29));

        TTario.setBackground(new java.awt.Color(29, 29, 29));
        TTario.setForeground(new java.awt.Color(227, 227, 227));
        TTario.setModel(new javax.swing.table.DefaultTableModel(
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
        TTario.setGridColor(new java.awt.Color(72, 72, 72));
        TTario.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TTario.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TTario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TTarioMousePressed(evt);
            }
        });
        SPTario.setViewportView(TTario);

        LFotoArrendatario.setBackground(new java.awt.Color(29, 29, 29));
        LFotoArrendatario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoArrendatario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LFotoArrendatario.setOpaque(true);

        BFotoArrendatario.setBackground(new java.awt.Color(227, 227, 227));
        BFotoArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BFotoArrendatario.setForeground(new java.awt.Color(29, 29, 29));
        BFotoArrendatario.setText("Subir foto");
        BFotoArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFotoArrendatarioActionPerformed(evt);
            }
        });

        TFNombreArrendatario.setBackground(new java.awt.Color(29, 29, 29));
        TFNombreArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFNombreArrendatario.setForeground(new java.awt.Color(227, 227, 227));
        TFNombreArrendatario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TFEstatus.setBackground(new java.awt.Color(29, 29, 29));
        TFEstatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFEstatus.setForeground(new java.awt.Color(227, 227, 227));
        TFEstatus.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estatus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        CBSexoArrendatario.setBackground(new java.awt.Color(227, 227, 227));
        CBSexoArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBSexoArrendatario.setForeground(new java.awt.Color(29, 29, 29));
        CBSexoArrendatario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Hombre", "Mujer" }));
        CBSexoArrendatario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        CBSexoArrendatario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBSexoArrendatarioItemStateChanged(evt);
            }
        });

        BInsertarArrendatario.setBackground(new java.awt.Color(227, 227, 227));
        BInsertarArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BInsertarArrendatario.setForeground(new java.awt.Color(29, 29, 29));
        BInsertarArrendatario.setText("Insertar");
        BInsertarArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarArrendatarioActionPerformed(evt);
            }
        });

        BActualizarArrendatario.setBackground(new java.awt.Color(227, 227, 227));
        BActualizarArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BActualizarArrendatario.setForeground(new java.awt.Color(29, 29, 29));
        BActualizarArrendatario.setText("Actualizar");
        BActualizarArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarArrendatarioActionPerformed(evt);
            }
        });

        BEliminarArrendatario.setBackground(new java.awt.Color(227, 227, 227));
        BEliminarArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEliminarArrendatario.setForeground(new java.awt.Color(29, 29, 29));
        BEliminarArrendatario.setText("Eliminar");
        BEliminarArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarArrendatarioActionPerformed(evt);
            }
        });

        BReporteArrendatario.setBackground(new java.awt.Color(227, 227, 227));
        BReporteArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReporteArrendatario.setForeground(new java.awt.Color(29, 29, 29));
        BReporteArrendatario.setText("Reporte");
        BReporteArrendatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteArrendatarioActionPerformed(evt);
            }
        });

        LClaveArrendatario.setBackground(new java.awt.Color(29, 29, 29));
        LClaveArrendatario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LClaveArrendatario.setForeground(new java.awt.Color(227, 227, 227));
        LClaveArrendatario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LClaveArrendatario.setOpaque(true);

        PFPassTario.setBackground(new java.awt.Color(29, 29, 29));
        PFPassTario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PFPassTario.setForeground(new java.awt.Color(227, 227, 227));
        PFPassTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        javax.swing.GroupLayout PArrendatariosLayout = new javax.swing.GroupLayout(PArrendatarios);
        PArrendatarios.setLayout(PArrendatariosLayout);
        PArrendatariosLayout.setHorizontalGroup(
            PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PArrendatariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPTario, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PArrendatariosLayout.createSequentialGroup()
                        .addGroup(PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CBSexoArrendatario, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PArrendatariosLayout.createSequentialGroup()
                                .addComponent(LFotoArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BFotoArrendatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PArrendatariosLayout.createSequentialGroup()
                                .addComponent(BInsertarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BActualizarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BEliminarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BReporteArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PArrendatariosLayout.createSequentialGroup()
                                .addComponent(LClaveArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TFNombreArrendatario))
                            .addComponent(TFEstatus))
                        .addGap(13, 13, 13))
                    .addGroup(PArrendatariosLayout.createSequentialGroup()
                        .addComponent(PFPassTario, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PArrendatariosLayout.setVerticalGroup(
            PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PArrendatariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PArrendatariosLayout.createSequentialGroup()
                        .addGroup(PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BFotoArrendatario, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(LFotoArrendatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFNombreArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LClaveArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PFPassTario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBSexoArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PArrendatariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BInsertarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BActualizarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BEliminarArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BReporteArrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SPTario, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                .addContainerGap())
        );

        TPAdmin.addTab("Arrendatarios", PArrendatarios);

        PArrendadores.setBackground(new java.awt.Color(49, 49, 49));

        SPAdor.setBackground(new java.awt.Color(29, 29, 29));

        TAdores.setBackground(new java.awt.Color(29, 29, 29));
        TAdores.setForeground(new java.awt.Color(227, 227, 227));
        TAdores.setModel(new javax.swing.table.DefaultTableModel(
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
        TAdores.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TAdores.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TAdores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TAdoresMousePressed(evt);
            }
        });
        SPAdor.setViewportView(TAdores);

        LFotoArrendador.setBackground(new java.awt.Color(29, 29, 29));
        LFotoArrendador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoArrendador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LFotoArrendador.setOpaque(true);

        BFotoAdor.setBackground(new java.awt.Color(227, 227, 227));
        BFotoAdor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BFotoAdor.setForeground(new java.awt.Color(29, 29, 29));
        BFotoAdor.setText("Subir foto");
        BFotoAdor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFotoAdorActionPerformed(evt);
            }
        });

        TFNombreArrendador.setBackground(new java.awt.Color(29, 29, 29));
        TFNombreArrendador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFNombreArrendador.setForeground(new java.awt.Color(227, 227, 227));
        TFNombreArrendador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TFDireccion.setBackground(new java.awt.Color(29, 29, 29));
        TFDireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFDireccion.setForeground(new java.awt.Color(227, 227, 227));
        TFDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TFContacto.setBackground(new java.awt.Color(29, 29, 29));
        TFContacto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFContacto.setForeground(new java.awt.Color(227, 227, 227));
        TFContacto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contacto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        CBSexoArrendador.setBackground(new java.awt.Color(227, 227, 227));
        CBSexoArrendador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBSexoArrendador.setForeground(new java.awt.Color(29, 29, 29));
        CBSexoArrendador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Hombre", "Mujer" }));
        CBSexoArrendador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        CBSexoArrendador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBSexoArrendadorItemStateChanged(evt);
            }
        });

        BInsertarAdor.setBackground(new java.awt.Color(227, 227, 227));
        BInsertarAdor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BInsertarAdor.setForeground(new java.awt.Color(29, 29, 29));
        BInsertarAdor.setText("Insertar");
        BInsertarAdor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarAdorActionPerformed(evt);
            }
        });

        BActualizarAdor.setBackground(new java.awt.Color(227, 227, 227));
        BActualizarAdor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BActualizarAdor.setForeground(new java.awt.Color(29, 29, 29));
        BActualizarAdor.setText("Actualizar");
        BActualizarAdor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarAdorActionPerformed(evt);
            }
        });

        BEliminarAdor.setBackground(new java.awt.Color(227, 227, 227));
        BEliminarAdor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEliminarAdor.setForeground(new java.awt.Color(29, 29, 29));
        BEliminarAdor.setText("Eliminar");
        BEliminarAdor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarAdorActionPerformed(evt);
            }
        });

        BReporteAdor.setBackground(new java.awt.Color(227, 227, 227));
        BReporteAdor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReporteAdor.setForeground(new java.awt.Color(29, 29, 29));
        BReporteAdor.setText("Reporte");
        BReporteAdor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteAdorActionPerformed(evt);
            }
        });

        LClaveArrendador.setBackground(new java.awt.Color(29, 29, 29));
        LClaveArrendador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LClaveArrendador.setForeground(new java.awt.Color(227, 227, 227));
        LClaveArrendador.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LClaveArrendador.setOpaque(true);

        PFPassAdor.setBackground(new java.awt.Color(29, 29, 29));
        PFPassAdor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PFPassAdor.setForeground(new java.awt.Color(227, 227, 227));
        PFPassAdor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraseña", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        javax.swing.GroupLayout PArrendadoresLayout = new javax.swing.GroupLayout(PArrendadores);
        PArrendadores.setLayout(PArrendadoresLayout);
        PArrendadoresLayout.setHorizontalGroup(
            PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PArrendadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBSexoArrendador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PArrendadoresLayout.createSequentialGroup()
                        .addComponent(BInsertarAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizarAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEliminarAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BReporteAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PArrendadoresLayout.createSequentialGroup()
                        .addComponent(LFotoArrendador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BFotoAdor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PArrendadoresLayout.createSequentialGroup()
                        .addComponent(LClaveArrendador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFNombreArrendador))
                    .addGroup(PArrendadoresLayout.createSequentialGroup()
                        .addComponent(TFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFContacto))
                    .addComponent(PFPassAdor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PArrendadoresLayout.setVerticalGroup(
            PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PArrendadoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PArrendadoresLayout.createSequentialGroup()
                        .addGroup(PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LFotoArrendador, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(BFotoAdor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LClaveArrendador, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(TFNombreArrendador))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PFPassAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TFContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBSexoArrendador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PArrendadoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BInsertarAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BActualizarAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BReporteAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BEliminarAdor, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(SPAdor, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                .addContainerGap())
        );

        TPAdmin.addTab("Arrendadores", PArrendadores);

        PViviendas.setBackground(new java.awt.Color(49, 49, 49));

        TVivienda.setBackground(new java.awt.Color(29, 29, 29));
        TVivienda.setForeground(new java.awt.Color(227, 227, 227));
        TVivienda.setModel(new javax.swing.table.DefaultTableModel(
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
        TVivienda.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TVivienda.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TVivienda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TViviendaMousePressed(evt);
            }
        });
        SPViv.setViewportView(TVivienda);

        CBTipo.setBackground(new java.awt.Color(227, 227, 227));
        CBTipo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CBTipo.setForeground(new java.awt.Color(29, 29, 29));
        CBTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Cuarto", "Departamento", "Casa" }));
        CBTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Tipo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        CBTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBTipoItemStateChanged(evt);
            }
        });

        BFotoViviendas.setBackground(new java.awt.Color(227, 227, 227));
        BFotoViviendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BFotoViviendas.setForeground(new java.awt.Color(29, 29, 29));
        BFotoViviendas.setText("Subir foto");
        BFotoViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFotoViviendasActionPerformed(evt);
            }
        });

        BInsertarViviendas.setBackground(new java.awt.Color(227, 227, 227));
        BInsertarViviendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BInsertarViviendas.setForeground(new java.awt.Color(29, 29, 29));
        BInsertarViviendas.setText("Insertar");
        BInsertarViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarViviendasActionPerformed(evt);
            }
        });

        BActualizarViviendas.setBackground(new java.awt.Color(227, 227, 227));
        BActualizarViviendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BActualizarViviendas.setForeground(new java.awt.Color(29, 29, 29));
        BActualizarViviendas.setText("Actualizar");
        BActualizarViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarViviendasActionPerformed(evt);
            }
        });

        BEliminarViviendas.setBackground(new java.awt.Color(227, 227, 227));
        BEliminarViviendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEliminarViviendas.setForeground(new java.awt.Color(29, 29, 29));
        BEliminarViviendas.setText("Eliminar");
        BEliminarViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarViviendasActionPerformed(evt);
            }
        });

        BReporteViviendas.setBackground(new java.awt.Color(227, 227, 227));
        BReporteViviendas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReporteViviendas.setForeground(new java.awt.Color(29, 29, 29));
        BReporteViviendas.setText("Reporte");
        BReporteViviendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteViviendasActionPerformed(evt);
            }
        });

        LNombreAdorViv.setBackground(new java.awt.Color(29, 29, 29));
        LNombreAdorViv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LNombreAdorViv.setForeground(new java.awt.Color(227, 227, 227));
        LNombreAdorViv.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        LNombreAdorViv.setOpaque(true);

        CBArrendadorViv.setBackground(new java.awt.Color(227, 227, 227));
        CBArrendadorViv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CBArrendadorViv.setForeground(new java.awt.Color(29, 29, 29));
        CBArrendadorViv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBArrendadorViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Arrendador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        CBArrendadorViv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBArrendadorVivItemStateChanged(evt);
            }
        });

        LClaveViv.setBackground(new java.awt.Color(29, 29, 29));
        LClaveViv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LClaveViv.setForeground(new java.awt.Color(227, 227, 227));
        LClaveViv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LClaveViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LClaveViv.setOpaque(true);

        LFotoViviendas.setBackground(new java.awt.Color(29, 29, 29));
        LFotoViviendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoViviendas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LFotoViviendas.setOpaque(true);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TADetalles.setBackground(new java.awt.Color(29, 29, 29));
        TADetalles.setColumns(20);
        TADetalles.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TADetalles.setForeground(new java.awt.Color(227, 227, 227));
        TADetalles.setRows(5);
        TADetalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        jScrollPane1.setViewportView(TADetalles);

        javax.swing.GroupLayout PViviendasLayout = new javax.swing.GroupLayout(PViviendas);
        PViviendas.setLayout(PViviendasLayout);
        PViviendasLayout.setHorizontalGroup(
            PViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PViviendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPViv, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PViviendasLayout.createSequentialGroup()
                        .addComponent(BInsertarViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BActualizarViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEliminarViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BReporteViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PViviendasLayout.createSequentialGroup()
                        .addComponent(CBArrendadorViv, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LNombreAdorViv, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PViviendasLayout.createSequentialGroup()
                        .addComponent(LClaveViv, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BFotoViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LFotoViviendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        PViviendasLayout.setVerticalGroup(
            PViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PViviendasLayout.createSequentialGroup()
                .addGroup(PViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PViviendasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(SPViv, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE))
                    .addGroup(PViviendasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LNombreAdorViv, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(CBArrendadorViv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CBTipo, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(BFotoViviendas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LClaveViv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LFotoViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PViviendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BInsertarViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BActualizarViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BReporteViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BEliminarViviendas, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        TPAdmin.addTab("Viviendas", PViviendas);

        PContratosPagos.setBackground(new java.awt.Color(49, 49, 49));

        TContratos.setBackground(new java.awt.Color(29, 29, 29));
        TContratos.setForeground(new java.awt.Color(227, 227, 227));
        TContratos.setModel(new javax.swing.table.DefaultTableModel(
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
        TContratos.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TContratos.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TContratos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TContratosMousePressed(evt);
            }
        });
        SPCon.setViewportView(TContratos);

        TPagos.setBackground(new java.awt.Color(29, 29, 29));
        TPagos.setForeground(new java.awt.Color(227, 227, 227));
        TPagos.setModel(new javax.swing.table.DefaultTableModel(
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
        TPagos.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TPagos.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TPagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TPagosMousePressed(evt);
            }
        });
        SPPago.setViewportView(TPagos);

        PManipularContratos.setBackground(new java.awt.Color(49, 49, 49));
        PManipularContratos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manipular contratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        TFDuracion.setBackground(new java.awt.Color(29, 29, 29));
        TFDuracion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFDuracion.setForeground(new java.awt.Color(227, 227, 227));
        TFDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TFDuracion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Duración", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TFMontoCon.setBackground(new java.awt.Color(29, 29, 29));
        TFMontoCon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFMontoCon.setForeground(new java.awt.Color(227, 227, 227));
        TFMontoCon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TFObservaciones.setBackground(new java.awt.Color(29, 29, 29));
        TFObservaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFObservaciones.setForeground(new java.awt.Color(227, 227, 227));
        TFObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        DCFechaSig.setBackground(new java.awt.Color(227, 227, 227));
        DCFechaSig.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha del siguiente pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        DCFechaSig.setForeground(new java.awt.Color(29, 29, 29));
        DCFechaSig.setDateFormatString("yyyy-MM-dd");
        DCFechaSig.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        DCFechaInicio.setBackground(new java.awt.Color(227, 227, 227));
        DCFechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        DCFechaInicio.setForeground(new java.awt.Color(29, 29, 29));
        DCFechaInicio.setDateFormatString("yyyy-MM-dd");
        DCFechaInicio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        BInsertarCon.setBackground(new java.awt.Color(227, 227, 227));
        BInsertarCon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BInsertarCon.setForeground(new java.awt.Color(29, 29, 29));
        BInsertarCon.setText("Insertar");
        BInsertarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarConActionPerformed(evt);
            }
        });

        BActualizarCon.setBackground(new java.awt.Color(227, 227, 227));
        BActualizarCon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BActualizarCon.setForeground(new java.awt.Color(29, 29, 29));
        BActualizarCon.setText("Actualizar");
        BActualizarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarConActionPerformed(evt);
            }
        });

        BEliminarCon.setBackground(new java.awt.Color(227, 227, 227));
        BEliminarCon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEliminarCon.setForeground(new java.awt.Color(29, 29, 29));
        BEliminarCon.setText("Eliminar");
        BEliminarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarConActionPerformed(evt);
            }
        });

        BReporteCon.setBackground(new java.awt.Color(227, 227, 227));
        BReporteCon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReporteCon.setForeground(new java.awt.Color(29, 29, 29));
        BReporteCon.setText("Reporte");
        BReporteCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteConActionPerformed(evt);
            }
        });

        LIDContrato.setBackground(new java.awt.Color(29, 29, 29));
        LIDContrato.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LIDContrato.setForeground(new java.awt.Color(227, 227, 227));
        LIDContrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LIDContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Contrato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LIDContrato.setOpaque(true);

        CBIDViv.setBackground(new java.awt.Color(227, 227, 227));
        CBIDViv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBIDViv.setForeground(new java.awt.Color(29, 29, 29));
        CBIDViv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBIDViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Vivienda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N

        CBIDTario.setBackground(new java.awt.Color(227, 227, 227));
        CBIDTario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBIDTario.setForeground(new java.awt.Color(29, 29, 29));
        CBIDTario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBIDTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Arrendatario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N

        javax.swing.GroupLayout PManipularContratosLayout = new javax.swing.GroupLayout(PManipularContratos);
        PManipularContratos.setLayout(PManipularContratosLayout);
        PManipularContratosLayout.setHorizontalGroup(
            PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PManipularContratosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFObservaciones)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PManipularContratosLayout.createSequentialGroup()
                        .addComponent(LIDContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFMontoCon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBIDViv, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CBIDTario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PManipularContratosLayout.createSequentialGroup()
                        .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DCFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PManipularContratosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(BInsertarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BActualizarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PManipularContratosLayout.createSequentialGroup()
                                .addComponent(BEliminarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BReporteCon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DCFechaSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PManipularContratosLayout.setVerticalGroup(
            PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PManipularContratosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LIDContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PManipularContratosLayout.createSequentialGroup()
                        .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CBIDViv, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TFDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TFMontoCon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CBIDTario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DCFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DCFechaSig, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PManipularContratosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BInsertarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BActualizarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEliminarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BReporteCon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        PManipularPagos.setBackground(new java.awt.Color(49, 49, 49));
        PManipularPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manipular pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        BInsertarPago.setBackground(new java.awt.Color(227, 227, 227));
        BInsertarPago.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BInsertarPago.setForeground(new java.awt.Color(29, 29, 29));
        BInsertarPago.setText("Insertar");
        BInsertarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInsertarPagoActionPerformed(evt);
            }
        });

        BActualizarPago.setBackground(new java.awt.Color(227, 227, 227));
        BActualizarPago.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BActualizarPago.setForeground(new java.awt.Color(29, 29, 29));
        BActualizarPago.setText("Actualizar");
        BActualizarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActualizarPagoActionPerformed(evt);
            }
        });

        BEliminarPago.setBackground(new java.awt.Color(227, 227, 227));
        BEliminarPago.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEliminarPago.setForeground(new java.awt.Color(29, 29, 29));
        BEliminarPago.setText("Eliminar");
        BEliminarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEliminarPagoActionPerformed(evt);
            }
        });

        BReportePago.setBackground(new java.awt.Color(227, 227, 227));
        BReportePago.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReportePago.setForeground(new java.awt.Color(29, 29, 29));
        BReportePago.setText("Reporte");
        BReportePago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReportePagoActionPerformed(evt);
            }
        });

        TFMontoPago.setBackground(new java.awt.Color(29, 29, 29));
        TFMontoPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFMontoPago.setForeground(new java.awt.Color(227, 227, 227));
        TFMontoPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        DCFechaPago.setBackground(new java.awt.Color(227, 227, 227));
        DCFechaPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha del pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        DCFechaPago.setForeground(new java.awt.Color(29, 29, 29));
        DCFechaPago.setDateFormatString("yyyy-MM-dd");
        DCFechaPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        LIDPago.setBackground(new java.awt.Color(29, 29, 29));
        LIDPago.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LIDPago.setForeground(new java.awt.Color(227, 227, 227));
        LIDPago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LIDPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Pago", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        LIDPago.setOpaque(true);

        CBIDCon.setBackground(new java.awt.Color(227, 227, 227));
        CBIDCon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBIDCon.setForeground(new java.awt.Color(29, 29, 29));
        CBIDCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBIDCon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N

        javax.swing.GroupLayout PManipularPagosLayout = new javax.swing.GroupLayout(PManipularPagos);
        PManipularPagos.setLayout(PManipularPagosLayout);
        PManipularPagosLayout.setHorizontalGroup(
            PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PManipularPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBIDCon, 0, 100, Short.MAX_VALUE)
                    .addComponent(LIDPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFMontoPago)
                    .addComponent(DCFechaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PManipularPagosLayout.createSequentialGroup()
                        .addComponent(BActualizarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BReportePago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PManipularPagosLayout.createSequentialGroup()
                        .addComponent(BInsertarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PManipularPagosLayout.setVerticalGroup(
            PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PManipularPagosLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TFMontoPago)
                    .addComponent(LIDPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BInsertarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BEliminarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PManipularPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DCFechaPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BActualizarPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BReportePago, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CBIDCon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap())
        );

        CBOrdenarCon.setBackground(new java.awt.Color(227, 227, 227));
        CBOrdenarCon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBOrdenarCon.setForeground(new java.awt.Color(29, 29, 29));
        CBOrdenarCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "ID", "Duracion", "Monto", "Fecha de inicio" }));
        CBOrdenarCon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenar por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        CBOrdenarCon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBOrdenarConItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout PContratosPagosLayout = new javax.swing.GroupLayout(PContratosPagos);
        PContratosPagos.setLayout(PContratosPagosLayout);
        PContratosPagosLayout.setHorizontalGroup(
            PContratosPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContratosPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PContratosPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SPPago, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addComponent(SPCon)
                    .addComponent(CBOrdenarCon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(PContratosPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PManipularContratos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PManipularPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PContratosPagosLayout.setVerticalGroup(
            PContratosPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContratosPagosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PContratosPagosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContratosPagosLayout.createSequentialGroup()
                        .addComponent(PManipularContratos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PManipularPagos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PContratosPagosLayout.createSequentialGroup()
                        .addComponent(CBOrdenarCon, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SPCon, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SPPago, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TPAdmin.addTab("Contratos y pagos", PContratosPagos);

        PFondoGraf.setBackground(new java.awt.Color(49, 49, 49));

        CBConsultas.setBackground(new java.awt.Color(227, 227, 227));
        CBConsultas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        CBConsultas.setForeground(new java.awt.Color(29, 29, 29));
        CBConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Número de pagos por arrendatario", "Total pagado del arrendatario", "Número de viviendas por arrendador" }));
        CBConsultas.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccionar consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        CBConsultas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBConsultasItemStateChanged(evt);
            }
        });

        PGrafica.setBackground(new java.awt.Color(29, 29, 29));
        PGrafica.setLayout(new java.awt.GridLayout(1, 0));

        PTablaGrafica.setBackground(new java.awt.Color(49, 49, 49));

        TGrafica.setBackground(new java.awt.Color(29, 29, 29));
        TGrafica.setForeground(new java.awt.Color(227, 227, 227));
        TGrafica.setModel(new javax.swing.table.DefaultTableModel(
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
        TGrafica.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TGrafica.setSelectionForeground(new java.awt.Color(227, 227, 227));
        SPGrafica.setViewportView(TGrafica);

        javax.swing.GroupLayout PTablaGraficaLayout = new javax.swing.GroupLayout(PTablaGrafica);
        PTablaGrafica.setLayout(PTablaGraficaLayout);
        PTablaGraficaLayout.setHorizontalGroup(
            PTablaGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PTablaGraficaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SPGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PTablaGraficaLayout.setVerticalGroup(
            PTablaGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTablaGraficaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
                .addContainerGap())
        );

        BReporte.setBackground(new java.awt.Color(227, 227, 227));
        BReporte.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReporte.setForeground(new java.awt.Color(29, 29, 29));
        BReporte.setText("Mostrar reporte");
        BReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PFondoGrafLayout = new javax.swing.GroupLayout(PFondoGraf);
        PFondoGraf.setLayout(PFondoGrafLayout);
        PFondoGrafLayout.setHorizontalGroup(
            PFondoGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoGrafLayout.createSequentialGroup()
                .addGroup(PFondoGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PFondoGrafLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CBConsultas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(PGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFondoGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PTablaGrafica, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PFondoGrafLayout.setVerticalGroup(
            PFondoGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoGrafLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PFondoGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBConsultas, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(BReporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PFondoGrafLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PTablaGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PGrafica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PGraficasLayout = new javax.swing.GroupLayout(PGraficas);
        PGraficas.setLayout(PGraficasLayout);
        PGraficasLayout.setHorizontalGroup(
            PGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondoGraf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PGraficasLayout.setVerticalGroup(
            PGraficasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PFondoGraf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TPAdmin.addTab("Graficas", PGraficas);

        javax.swing.GroupLayout PFondoLayout = new javax.swing.GroupLayout(PFondo);
        PFondo.setLayout(PFondoLayout);
        PFondoLayout.setHorizontalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPAdmin)
            .addComponent(PEncabezado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addComponent(PEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPAdmin))
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void BReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteActionPerformed
        String reporte = "";

        switch (CBConsultas.getSelectedIndex()) {
            case 0:
                break;
            case 1:
                reporte = System.getProperty("user.dir") + "/Grafica_num_rentas.jasper";
                break;
            case 2:
                reporte = System.getProperty("user.dir") + "/Grafica_pago_total.jasper";
                break;
            case 3:
                reporte = System.getProperty("user.dir") + "/Grafica_num_viviendas.jasper";
                break;
            default:
                throw new AssertionError();
        }

        if (!reporte.equals("")) {
            Map parametros = new HashMap();
            cnx.ejecutarReporte(reporte, parametros);
        }
    }//GEN-LAST:event_BReporteActionPerformed

    private void CBConsultasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBConsultasItemStateChanged
        /*
        Crea una grafica utlizando la consulta seleccionada.
        */
        
        PGrafica.removeAll();
        PGrafica.updateUI();
        if (!datos.isEmpty()) {
            datos.removeAll(datos);
        }
        if (!series.isEmpty()) {
            series.removeAll(series);
        }

        String query = "";
        String titulo = "";
        String tituloEjeX = "";
        String tituloEjeY = "";
        String serie = "";

        switch (CBConsultas.getSelectedIndex()) {
            case 0:
                break;
            case 1:
                query = "SELECT nombretario, COUNT(*) AS num_pagos "
                        + "FROM arrendatario "
                        + "JOIN pago ON contrato_idcontrato = "
                        + "(SELECT idcontrato FROM contrato "
                        + "WHERE arrendatario_idarrendatario = idarrendatario) "
                        + "GROUP BY idarrendatario ORDER BY num_pagos";

                titulo = "Numero de pagos por arrendatario";
                tituloEjeX = "Arrendatario";
                tituloEjeY = "Pagos";
                serie = "Numero de pagos";
                break;
            case 2:
                query = "SELECT nombretario, SUM(monto) AS total "
                        + "FROM arrendatario, pago "
                        + "WHERE contrato_idcontrato = "
                        + "(SELECT idcontrato FROM contrato "
                        + "WHERE arrendatario_idarrendatario = idarrendatario) "
                        + "GROUP BY idarrendatario";

                titulo = "Total pagado del arrendatario";
                tituloEjeX = "Arrendatario";
                tituloEjeY = "Total";
                serie = "Pago total";
                break;
            case 3:
                query = "SELECT nombreador, COUNT(*) AS viviendas "
                        + "FROM arrendador, vivienda "
                        + "WHERE idarrendador = arrendador_idarrendador "
                        + "GROUP BY idarrendador "
                        + "ORDER BY viviendas";

                titulo = "Numero de viviendas por arrendador";
                tituloEjeX = "Arrendador";
                tituloEjeY = "Viviendas";
                serie = "Numero de viviendas";
                break;
            default:
                throw new AssertionError();
        }

        if (CBConsultas.getSelectedIndex() != 0) {
            datos = cnx.consultar(query);
            series.add(serie);
            PGrafica.removeAll();
            chart = new GraficaXY(titulo, tituloEjeX, tituloEjeY, series, datos);
            PGrafica.add(chart.chartPanel);
            PGrafica.updateUI();
            cnx.entablar(query, TGrafica);
        }
    }//GEN-LAST:event_CBConsultasItemStateChanged

    private void BInsertarViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarViviendasActionPerformed
        if (LFotoViviendas == null
                || TADetalles.equals("")
                || CBTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            String idador = CBArrendadorViv.getSelectedItem().toString();
            String tipo = CBTipo.getSelectedItem().toString();
            ImageIcon fotoviv = (ImageIcon) LFotoViviendas.getIcon();
            String detalles = TADetalles.getText();

            Vivienda viv = new Vivienda(null, tipo, detalles, idador, fotoviv);
            if (viv.insertar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", 1);
                actualizarTodo();
                LFotoViviendas.setIcon(null);
                TADetalles.setText("");
                CBTipo.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Registro fallido", "Fallo", 4);
            }
        }
    }//GEN-LAST:event_BInsertarViviendasActionPerformed

    private void BFotoViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFotoViviendasActionPerformed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            foto = new ImageIcon(archivo.getPath());
            LFotoViviendas.setIcon(new ImageIcon(foto.getImage()));
        }
    }//GEN-LAST:event_BFotoViviendasActionPerformed

    private void CBTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBTipoItemStateChanged
        if (CBTipo.getSelectedIndex() == 0) {
            LClaveViv.setText("");
            LFotoViviendas.setIcon(null);
            TADetalles.setText("");
        }
    }//GEN-LAST:event_CBTipoItemStateChanged

    private void TViviendaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TViviendaMousePressed
        int ren = TVivienda.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TVivienda.getModel();

        if (ren >= 0) {
            LClaveViv.setText(modelo.getValueAt(ren, 0).toString());
            CBTipo.setSelectedItem(modelo.getValueAt(ren, 1));
            foto = (ImageIcon) modelo.getValueAt(ren, 2);
            LFotoViviendas.setIcon(foto);
            TADetalles.setText(modelo.getValueAt(ren, 3).toString());
            CBArrendadorViv.setSelectedItem(modelo.getValueAt(ren, 4));
        }
    }//GEN-LAST:event_TViviendaMousePressed

    private void BInsertarAdorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarAdorActionPerformed
        if (LFotoArrendador == null
                || TFNombreArrendador.equals("")
                || TFDireccion.equals("")
                || TFContacto.equals("")
                || CBSexoArrendador.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            ImageIcon fotoador = (ImageIcon) LFotoArrendador.getIcon();
            String nombre = TFNombreArrendador.getText();
            String pass = PFPassAdor.getText();
            String direccion = TFDireccion.getText();
            String contact = TFContacto.getText();
            String sexo = CBSexoArrendador.getSelectedItem().toString();

            Arrendador ador = new Arrendador(null, nombre, sexo, contact, direccion, pass, fotoador);
            if (ador.insertar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", 1);
                actualizarTodo();
                LFotoArrendador.setIcon(null);
                TFNombreArrendador.setText("");
                TFDireccion.setText("");
                TFContacto.setText("");
                CBSexoArrendador.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Registro fallido", "Fallo", 4);
            }
        }
    }//GEN-LAST:event_BInsertarAdorActionPerformed

    private void CBSexoArrendadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBSexoArrendadorItemStateChanged
        if (CBSexoArrendador.getSelectedIndex() == 0) {
            LFotoArrendador.setIcon(null);
            LClaveArrendador.setText("");
            TFNombreArrendador.setText("");
            TFDireccion.setText("");
            TFContacto.setText("");
        }
    }//GEN-LAST:event_CBSexoArrendadorItemStateChanged

    private void BFotoAdorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFotoAdorActionPerformed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            foto = new ImageIcon(archivo.getPath());
            LFotoArrendador.setIcon(new ImageIcon(cnx.escalarImagen(foto.getImage(), 128, 128)));
        }
    }//GEN-LAST:event_BFotoAdorActionPerformed

    private void TAdoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TAdoresMousePressed
        int ren = TAdores.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TAdores.getModel();

        if (ren >= 0) {
            LClaveArrendador.setText(modelo.getValueAt(ren, 0).toString());
            TFNombreArrendador.setText(modelo.getValueAt(ren, 1).toString());
            CBSexoArrendador.setSelectedItem(modelo.getValueAt(ren, 2).toString());
            TFContacto.setText(modelo.getValueAt(ren, 3).toString());
            TFDireccion.setText(modelo.getValueAt(ren, 4).toString());
            foto = (ImageIcon) modelo.getValueAt(ren, 5);
            LFotoArrendador.setIcon(foto);
            PFPassAdor.setText(modelo.getValueAt(ren, 6).toString());
        }
    }//GEN-LAST:event_TAdoresMousePressed

    private void BInsertarArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarArrendatarioActionPerformed
        if (LFotoArrendatario == null
                || TFNombreArrendatario.equals("")
                || TFEstatus.equals("")
                || CBSexoArrendatario.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            ImageIcon fototario = (ImageIcon) LFotoArrendatario.getIcon();
            String nombre = TFNombreArrendatario.getText();
            String pass = PFPassTario.getText();
            String estatus = TFEstatus.getText();
            String sexo = CBSexoArrendatario.getSelectedItem().toString();

            Arrendatario tario = new Arrendatario(null, nombre, estatus, sexo, pass, fototario);
            if (tario.insertar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", 1);
                actualizarTodo();
                LFotoArrendatario.setIcon(null);
                TFNombreArrendatario.setText("");
                TFEstatus.setText("");
                CBSexoArrendatario.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Registro fallido", "Fallo", 4);
            }
        }
    }//GEN-LAST:event_BInsertarArrendatarioActionPerformed

    private void CBSexoArrendatarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBSexoArrendatarioItemStateChanged
        if (CBSexoArrendatario.getSelectedIndex() == 0) {
            LFotoArrendatario.setIcon(null);
            TFNombreArrendatario.setText("");
            LClaveArrendatario.setText("");
            TFEstatus.setText("");
        }
    }//GEN-LAST:event_CBSexoArrendatarioItemStateChanged

    private void BFotoArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFotoArrendatarioActionPerformed
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir"));
        if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File archivo = fc.getSelectedFile();
            foto = new ImageIcon(archivo.getPath());
            LFotoArrendatario.setIcon(new ImageIcon(cnx.escalarImagen(foto.getImage(), 128, 128)));
        }
    }//GEN-LAST:event_BFotoArrendatarioActionPerformed

    private void TTarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTarioMousePressed
        int ren = TTario.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TTario.getModel();

        if (ren >= 0) {
            LClaveArrendatario.setText(modelo.getValueAt(ren, 0).toString());
            TFNombreArrendatario.setText(modelo.getValueAt(ren, 1).toString());
            TFEstatus.setText(modelo.getValueAt(ren, 2).toString());
            CBSexoArrendatario.setSelectedItem(modelo.getValueAt(ren, 3).toString());
            foto = (ImageIcon) modelo.getValueAt(ren, 4);
            LFotoArrendatario.setIcon(foto);
            PFPassTario.setText(modelo.getValueAt(ren, 5).toString());
        }
    }//GEN-LAST:event_TTarioMousePressed

    private void CBArrendadorVivItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBArrendadorVivItemStateChanged
        String id = CBArrendadorViv.getSelectedItem().toString();
        LNombreAdorViv.setText(cnx.obtenerDato("SELECT nombreador FROM arrendador WHERE idarrendador = '" + id + "'"));
    }//GEN-LAST:event_CBArrendadorVivItemStateChanged

    private void BActualizarViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarViviendasActionPerformed
        if (LFotoViviendas == null
                || TADetalles.equals("")
                || CBTipo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            String idviv = LClaveViv.getText();
            String tipo = CBTipo.getSelectedItem().toString();
            String detalles = TADetalles.getText();
            String idador = CBArrendadorViv.getSelectedItem().toString();
            ImageIcon fotoviv = (ImageIcon) LFotoViviendas.getIcon();

            Vivienda viv = new Vivienda(idviv, tipo, detalles, idador, fotoviv);
            if (viv.actualizar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Actualizar", 1);
                actualizarTodo();
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Actualizar", 4);
            }
        }
    }//GEN-LAST:event_BActualizarViviendasActionPerformed

    private void BActualizarArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarArrendatarioActionPerformed
        if (LFotoArrendatario == null
                || TFNombreArrendatario.equals("")
                || TFEstatus.equals("")
                || CBSexoArrendatario.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            String idtario = LClaveArrendatario.getText();
            ImageIcon fototario = (ImageIcon) LFotoArrendatario.getIcon();
            String nombre = TFNombreArrendatario.getText();
            String pass = PFPassTario.getText();
            String estatus = TFEstatus.getText();
            String sexo = CBSexoArrendatario.getSelectedItem().toString();

            Arrendatario tario = new Arrendatario(idtario, nombre, estatus, sexo, pass, fototario);
            if (tario.actualizar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Actualizar", 1);
                actualizarTodo();
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Actualizar", 4);
            }
        }
    }//GEN-LAST:event_BActualizarArrendatarioActionPerformed

    private void BEliminarArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarArrendatarioActionPerformed
        if (LClaveArrendatario == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Esta acción también eliminará los contratos "
                    + "y pagos relacionados con este arrendatario\n"
                    + "¿Desea continuar?", "Advertencia",
                    JOptionPane.YES_NO_OPTION, 3);

            if (confirm == JOptionPane.YES_OPTION) {
                String idtario = LClaveArrendatario.getText();
                Arrendatario tario = new Arrendatario(idtario, null, null, null, null, null);
                if (tario.eliminar(cnx) == 1) {
                    JOptionPane.showMessageDialog(null, "Registro eliminado", "Eliminar", 1);
                    actualizarTodo();
                    LFotoArrendatario.setIcon(null);
                    TFNombreArrendatario.setText("");
                    TFEstatus.setText("");
                    CBSexoArrendatario.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo salió mal", "Eliminar", 4);
                }
            }
        }
    }//GEN-LAST:event_BEliminarArrendatarioActionPerformed

    private void BActualizarAdorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarAdorActionPerformed
        if (LFotoArrendador == null
                || TFNombreArrendador.equals("")
                || TFDireccion.equals("")
                || TFContacto.equals("")
                || CBSexoArrendador.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            String idador = LClaveArrendador.getText();
            ImageIcon fotoador = (ImageIcon) LFotoArrendador.getIcon();
            String nombre = TFNombreArrendador.getText();
            String pass = PFPassAdor.getText();
            String direccion = TFDireccion.getText();
            String contact = TFContacto.getText();
            String sexo = CBSexoArrendador.getSelectedItem().toString();

            Arrendador ador = new Arrendador(idador, nombre, sexo, contact, direccion, pass, fotoador);
            if (ador.insertar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado el registro", "Actualizar", 1);
                actualizarTodo();
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Actualizar", 4);
            }
        }
    }//GEN-LAST:event_BActualizarAdorActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void BInsertarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarConActionPerformed
        if (TFDuracion.toString().equals("")
                || TFMontoCon.toString().equals("")
                || DCFechaInicio == null
                || DCFechaSig == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos.\nIntentalo de nuevo.", "Advertencia", 2);
        } else {
            String duracion = TFDuracion.getText();
            String monto = TFMontoCon.getText();
            String observ = TFObservaciones.getText();
            Date fechainicio = new Date(DCFechaInicio.getDate().getTime());
            Date fechasig = new Date(DCFechaSig.getDate().getTime());
            String idviv = CBIDViv.getSelectedItem().toString();
            String idtario = CBIDTario.getSelectedItem().toString();

            Contrato con = new Contrato(null, duracion, monto, observ, idviv, idtario, fechainicio, fechasig);
            if (con.insertar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", 1);
                actualizarTodo();
                CBOrdenarCon.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Fallo", 4);
            }
        }
    }//GEN-LAST:event_BInsertarConActionPerformed

    private void BActualizarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarConActionPerformed
        if (LIDContrato == null
                || TFDuracion.toString().equals("")
                || TFMontoCon.toString().equals("")
                || DCFechaInicio == null
                || DCFechaSig == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos.\nIntentalo de nuevo.", "Advertencia", 2);
        } else {
            String idcon = LIDContrato.getText();
            String duracion = TFDuracion.getText();
            String monto = TFMontoCon.getText();
            String observ = TFObservaciones.getText();
            Date fechainicio = new Date(DCFechaInicio.getDate().getTime());
            Date fechasig = new Date(DCFechaSig.getDate().getTime());
            String idviv = CBIDViv.getSelectedItem().toString();
            String idtario = CBIDTario.getSelectedItem().toString();

            Contrato con = new Contrato(idcon, duracion, monto, observ, idviv, idtario, fechainicio, fechasig);
            if (con.actualizar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Se ha actualizado el contrato", "Actualizar", 1);
                actualizarTodo();
                CBOrdenarCon.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Fallo", 4);
            }
        }
    }//GEN-LAST:event_BActualizarConActionPerformed

    private void BEliminarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarConActionPerformed
        if (LIDContrato == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Esta acción también eliminará todos los pagos\n"
                    + "realizados por el arrendatario correspondiente.\n"
                    + "¿Desea continuar?", "Advertencia",
                    JOptionPane.YES_NO_OPTION, 2);

            if (confirm == JOptionPane.YES_OPTION) {
                String idcon = LIDContrato.getText();

                Contrato con = new Contrato(idcon, null, null, null, null, null, null, null);
                if (con.eliminar(cnx) == 1) {
                    JOptionPane.showMessageDialog(null, "Contrato eliminado", "Eliminar", 1);
                    actualizarTodo();
                    CBOrdenarCon.setSelectedIndex(0);
                    LIDContrato = null;
                    TFDuracion.setText("");
                    TFMontoCon.setText("");
                    TFObservaciones.setText("");
                    DCFechaInicio.setDate(null);
                    DCFechaSig.setDate(null);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo salió mal", "Eliminar", 4);
                }
            }
        }
    }//GEN-LAST:event_BEliminarConActionPerformed

    private void BInsertarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInsertarPagoActionPerformed
        if (TFMontoPago.toString().equals("") || DCFechaPago == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos.\nIntentalo de nuevo.", "Advertencia", 3);
        } else {
            Date fechapago = new Date(DCFechaPago.getDate().getTime());
            int monto = Integer.parseInt(TFMontoPago.getText());
            String idcon = CBIDCon.getSelectedItem().toString();

            Pago pago = new Pago(fechapago, monto, null, idcon);

            if (pago.insertar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", 1);
                actualizarTodo();
                DCFechaPago.setDate(null);
                TFMontoPago.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Eliminar", 4);
            }
        }
    }//GEN-LAST:event_BInsertarPagoActionPerformed

    private void BActualizarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActualizarPagoActionPerformed
        if (TFMontoPago.toString().equals("") || DCFechaPago == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos.\nIntentalo de nuevo.", "Advertencia", 3);
        } else {
            String idpago = LIDPago.getText();
            Date fechapago = new Date(DCFechaPago.getDate().getTime());
            int monto = Integer.parseInt(TFMontoPago.getText());
            String idcon = CBIDCon.getSelectedItem().toString();

            Pago pago = new Pago(fechapago, monto, idpago, idcon);

            if (pago.actualizar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Registro exitoso", "Registro", 1);
                actualizarTodo();
                DCFechaPago.setDate(null);
                TFMontoPago.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Eliminar", 4);
            }
        }
    }//GEN-LAST:event_BActualizarPagoActionPerformed

    private void BEliminarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarPagoActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null,
                "¿Está seguro de eliminar este pago?", "Advertencia",
                JOptionPane.YES_NO_OPTION, 3);

        if (confirm == JOptionPane.YES_OPTION) {
            String idpago = LIDPago.getText();

            Pago pago = new Pago(null, 0, idpago, null);
            if (pago.eliminar(cnx) == 1) {
                JOptionPane.showMessageDialog(null, "Operacion completada", "Eliminar", 1);
                actualizarTodo();
                DCFechaPago.setDate(null);
                TFMontoPago.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Algo salió mal", "Eliminar", 4);
            }
        }
    }//GEN-LAST:event_BEliminarPagoActionPerformed

    private void TContratosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TContratosMousePressed
        int ren = TContratos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TContratos.getModel();

        if (ren >= 0) {
            String idcon = modelo.getValueAt(ren, 0).toString();
            LIDContrato.setText(idcon);
            TFDuracion.setText(modelo.getValueAt(ren, 1).toString());
            TFMontoCon.setText(modelo.getValueAt(ren, 2).toString());
            TFObservaciones.setText(modelo.getValueAt(ren, 3).toString());
            DCFechaInicio.setDate(Date.valueOf(modelo.getValueAt(ren, 4).toString()));
            DCFechaSig.setDate(Date.valueOf(modelo.getValueAt(ren, 5).toString()));
            CBIDViv.setSelectedItem(modelo.getValueAt(ren, 6).toString());
            CBIDTario.setSelectedItem(modelo.getValueAt(ren, 7).toString());

            LIDPago.setText("");
            DCFechaPago.setDate(null);
            TFMontoPago.setText("");

            cnx.entablar("SELECT * FROM pago WHERE contrato_idcontrato = '" + idcon + "' ORDER BY fechapago DESC", TPagos);
        }
    }//GEN-LAST:event_TContratosMousePressed

    private void CBOrdenarConItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBOrdenarConItemStateChanged
        switch (CBOrdenarCon.getSelectedIndex()) {
            case 0:
                limpiarTabla(TPagos);

                LIDContrato.setText("");
                TFDuracion.setText("");
                TFMontoCon.setText("");
                TFObservaciones.setText("");
                DCFechaInicio.setDate(null);
                DCFechaSig.setDate(null);

                LIDPago.setText("");
                DCFechaPago.setDate(null);
                TFMontoPago.setText("");
                break;
            case 1:
                cnx.entablar("SELECT * FROM contrato ORDER BY idcontrato", TContratos);
                break;
            case 2:
                cnx.entablar("SELECT * FROM contrato ORDER BY duracion", TContratos);
                break;
            case 3:
                cnx.entablar("SELECT * FROM contrato ORDER BY montocon", TContratos);
                break;
            case 4:
                cnx.entablar("SELECT * FROM contrato ORDER BY fechainicio", TContratos);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_CBOrdenarConItemStateChanged

    private void TPagosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPagosMousePressed
        int ren = TPagos.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TPagos.getModel();

        if (ren >= 0) {
            LIDPago.setText(modelo.getValueAt(ren, 0).toString());
            DCFechaPago.setDate(Date.valueOf(modelo.getValueAt(ren, 1).toString()));
            TFMontoPago.setText(modelo.getValueAt(ren, 2).toString());
            CBIDCon.setSelectedItem(modelo.getValueAt(ren, 3).toString());
        }
    }//GEN-LAST:event_TPagosMousePressed

    private void BEliminarAdorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarAdorActionPerformed
        if (LClaveArrendador == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Esta acción también eliminará a todo registro relacionado\n"
                    + "con este arrendador (viviendas, contratos y pagos)\n"
                    + "¿Desea continuar?", "Advertencia",
                    JOptionPane.YES_NO_OPTION, 3);

            if (confirm == JOptionPane.YES_OPTION) {
                String idador = LClaveArrendador.getText();

                Arrendador ador = new Arrendador(idador, null, null, null, null, null, null);
                if (ador.eliminar(cnx) == 1) {
                    JOptionPane.showMessageDialog(null, "Arrendador eliminado", "Eliminar", 1);
                    actualizarTodo();
                    CBSexoArrendador.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo salió mal", "Eliminar", 4);
                }
            }
        }
    }//GEN-LAST:event_BEliminarAdorActionPerformed

    private void BEliminarViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEliminarViviendasActionPerformed
        if (LClaveViv == null) {
            JOptionPane.showMessageDialog(null, "Campos incorrectos\nVuelva a intentarlo", "Advertencia", 2);
        } else {
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Esta acción también eliminará a todo registro relacionado\n"
                    + "con esta vivienda (contratos y pagos)\n"
                    + "¿Desea continuar?", "Advertencia",
                    JOptionPane.YES_NO_OPTION, 3);

            if (confirm == JOptionPane.YES_OPTION) {
                String idviv = LClaveViv.getText();

                Vivienda viv = new Vivienda(idviv, null, null, null, null);
                if (viv.eliminar(cnx) == 1) {
                    JOptionPane.showMessageDialog(null, "Vivienda eliminada", "Eliminar", 1);
                    actualizarTodo();
                    CBTipo.setSelectedIndex(0);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo salió mal", "Eliminar", 4);
                }
            }
        }
    }//GEN-LAST:event_BEliminarViviendasActionPerformed

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

    private void LVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LVolverMouseClicked
        
    }//GEN-LAST:event_LVolverMouseClicked

    private void BReporteArrendatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteArrendatarioActionPerformed
        String reporte = System.getProperty("user.dir") + "/arrendatarios.jasper";
        
        Map parametros = new HashMap();
        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteArrendatarioActionPerformed

    private void BReporteAdorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteAdorActionPerformed
        String reporte = System.getProperty("user.dir") + "/arrendadores.jasper";
        
        Map parametros = new HashMap();
        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteAdorActionPerformed

    private void BReporteViviendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteViviendasActionPerformed
        String reporte = System.getProperty("user.dir") + "/viviendas.jasper";
        
        Map parametros = new HashMap();
        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteViviendasActionPerformed

    private void BReporteConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteConActionPerformed
        String reporte = System.getProperty("user.dir") + "/contratos.jasper";
        
        Map parametros = new HashMap();
        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteConActionPerformed

    private void BReportePagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReportePagoActionPerformed
        String reporte = System.getProperty("user.dir") + "/pagos.jasper";
        
        Map parametros = new HashMap();
        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReportePagoActionPerformed

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
            java.util.logging.Logger.getLogger(FAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAdministrador().setVisible(true);
            }
        });
    }

    public void setUser(String user) {
        usuario = user;
        
        LAdmin.setText(cnx.obtenerDato("SELECT nombreadmin FROM admin WHERE idadmin = '"+usuario+"'"));
        LClave.setText("Clave: " + usuario);
    }

    public void limpiarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }

    public void actualizarTodo() {
        cnx.entablar("SELECT * FROM arrendatario ORDER BY idarrendatario", TTario);
        cnx.entablar("SELECT * FROM arrendador ORDER BY idarrendador", TAdores);
        cnx.entablar("SELECT * FROM vivienda ORDER BY idvivienda", TVivienda);
        cnx.entablar("SELECT * FROM contrato ORDER BY idcontrato", TContratos);
        cnx.seleccionar("SELECT idarrendador FROM arrendador ORDER BY idarrendador;", CBArrendadorViv);
        cnx.seleccionar("SELECT idvivienda FROM vivienda ORDER BY idvivienda", CBIDViv);
        cnx.seleccionar("SELECT idarrendatario FROM arrendatario ORDER BY idarrendatario", CBIDTario);
        cnx.seleccionar("SELECT idcontrato FROM contrato ORDER BY idcontrato", CBIDCon);
        limpiarTabla(TPagos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BActualizarAdor;
    private javax.swing.JButton BActualizarArrendatario;
    private javax.swing.JButton BActualizarCon;
    private javax.swing.JButton BActualizarPago;
    private javax.swing.JButton BActualizarViviendas;
    private javax.swing.JButton BEliminarAdor;
    private javax.swing.JButton BEliminarArrendatario;
    private javax.swing.JButton BEliminarCon;
    private javax.swing.JButton BEliminarPago;
    private javax.swing.JButton BEliminarViviendas;
    private javax.swing.JButton BFotoAdor;
    private javax.swing.JButton BFotoArrendatario;
    private javax.swing.JButton BFotoViviendas;
    private javax.swing.JButton BInsertarAdor;
    private javax.swing.JButton BInsertarArrendatario;
    private javax.swing.JButton BInsertarCon;
    private javax.swing.JButton BInsertarPago;
    private javax.swing.JButton BInsertarViviendas;
    private javax.swing.JButton BReporte;
    private javax.swing.JButton BReporteAdor;
    private javax.swing.JButton BReporteArrendatario;
    private javax.swing.JButton BReporteCon;
    private javax.swing.JButton BReportePago;
    private javax.swing.JButton BReporteViviendas;
    private javax.swing.JComboBox<String> CBArrendadorViv;
    private javax.swing.JComboBox<String> CBConsultas;
    private javax.swing.JComboBox<String> CBIDCon;
    private javax.swing.JComboBox<String> CBIDTario;
    private javax.swing.JComboBox<String> CBIDViv;
    private javax.swing.JComboBox<String> CBOrdenarCon;
    private javax.swing.JComboBox<String> CBSexoArrendador;
    private javax.swing.JComboBox<String> CBSexoArrendatario;
    private javax.swing.JComboBox<String> CBTipo;
    private com.toedter.calendar.JDateChooser DCFechaInicio;
    private com.toedter.calendar.JDateChooser DCFechaPago;
    private com.toedter.calendar.JDateChooser DCFechaSig;
    private javax.swing.JLabel Header1;
    private javax.swing.JLabel LAdmin;
    private javax.swing.JLabel LClave;
    private javax.swing.JLabel LClaveArrendador;
    private javax.swing.JLabel LClaveArrendatario;
    private javax.swing.JLabel LClaveViv;
    private javax.swing.JLabel LEncabezado;
    private javax.swing.JLabel LFecha;
    private javax.swing.JLabel LFotoArrendador;
    private javax.swing.JLabel LFotoArrendatario;
    private javax.swing.JLabel LFotoViviendas;
    private javax.swing.JLabel LIDContrato;
    private javax.swing.JLabel LIDPago;
    private javax.swing.JLabel LNombreAdorViv;
    private javax.swing.JLabel LVOIDCAT;
    private javax.swing.JLabel LVolver;
    private javax.swing.JPanel PArrendadores;
    private javax.swing.JPanel PArrendatarios;
    private javax.swing.JPanel PContratosPagos;
    private javax.swing.JPanel PEncabezado;
    private javax.swing.JPasswordField PFPassAdor;
    private javax.swing.JPasswordField PFPassTario;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PFondoGraf;
    private javax.swing.JPanel PGrafica;
    private javax.swing.JPanel PGraficas;
    private javax.swing.JPanel PManipularContratos;
    private javax.swing.JPanel PManipularPagos;
    private javax.swing.JPanel PTablaGrafica;
    private javax.swing.JPanel PViviendas;
    private javax.swing.JScrollPane SPAdor;
    private javax.swing.JScrollPane SPCon;
    private javax.swing.JScrollPane SPGrafica;
    private javax.swing.JScrollPane SPPago;
    private javax.swing.JScrollPane SPTario;
    private javax.swing.JScrollPane SPViv;
    private javax.swing.JTextArea TADetalles;
    private javax.swing.JTable TAdores;
    private javax.swing.JTable TContratos;
    private javax.swing.JTextField TFContacto;
    private javax.swing.JTextField TFDireccion;
    private javax.swing.JTextField TFDuracion;
    private javax.swing.JTextField TFEstatus;
    private javax.swing.JTextField TFMontoCon;
    private javax.swing.JTextField TFMontoPago;
    private javax.swing.JTextField TFNombreArrendador;
    private javax.swing.JTextField TFNombreArrendatario;
    private javax.swing.JTextField TFObservaciones;
    private javax.swing.JTable TGrafica;
    private javax.swing.JTabbedPane TPAdmin;
    private javax.swing.JTable TPagos;
    private javax.swing.JTable TTario;
    private javax.swing.JTable TVivienda;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
