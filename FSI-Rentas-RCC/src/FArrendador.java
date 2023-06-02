import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import javax.swing.DefaultCellEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/*
 * @author Rogelio Cervantes Castellon
 */
public class FArrendador extends javax.swing.JFrame {
    
    String usuario, idcon, idviv, idtario;
    Conexion cnx;
    JComboBox comboBox;
    ImageIcon foto;
    ImageIcon icon = new ImageIcon(getClass().getResource("/img/icons/voidcat.png"));
    
    LocalDate fechaLocal = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaFormateada = fechaLocal.format(formato);
    Date fechaActual = Date.valueOf(fechaLocal);
    
    public FArrendador() {
        initComponents();
        setIconImage(icon.getImage());
        setTitle("Arrendador");
        
        limpiarTabla(TContrato);
        limpiarTabla(TPagos);
        limpiarTabla(TSol);
        
        SPViv.getViewport().setBackground(new Color(29, 29, 29));
        SPCon.getViewport().setBackground(new Color(29, 29, 29));
        SPPago.getViewport().setBackground(new Color(29, 29, 29));
        SPSol.getViewport().setBackground(new Color(29, 29, 29));
        
        TSol.setRowHeight(64);
        TViviendas.setRowHeight(64);
        TContrato.setRowHeight(48);
        TPagos.setRowHeight(48);
        LFecha.setText(fechaFormateada);
        
        cnx = new Conexion();
        if (cnx.conectar("localhost", "rentas", "root", null) == 0) {
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la BD", "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PFondo = new javax.swing.JPanel();
        PEncabezado = new javax.swing.JPanel();
        LVOIDCAT = new javax.swing.JLabel();
        LTitulo1 = new javax.swing.JLabel();
        LTitulo2 = new javax.swing.JLabel();
        LAdorTop = new javax.swing.JLabel();
        LClaveTop = new javax.swing.JLabel();
        LFecha = new javax.swing.JLabel();
        LVolver = new javax.swing.JLabel();
        TPArrendador = new javax.swing.JTabbedPane();
        PConsulta = new javax.swing.JPanel();
        SPViv = new javax.swing.JScrollPane();
        TViviendas = new javax.swing.JTable();
        SPCon = new javax.swing.JScrollPane();
        TContrato = new javax.swing.JTable();
        PDatosTario = new javax.swing.JPanel();
        LFotoTario = new javax.swing.JLabel();
        LSexoTario = new javax.swing.JLabel();
        LNombreTario = new javax.swing.JLabel();
        LEstatusTario = new javax.swing.JLabel();
        SPObservTario = new javax.swing.JScrollPane();
        LObservaTario = new javax.swing.JLabel();
        BEnviar = new javax.swing.JButton();
        SPEnviar = new javax.swing.JScrollPane();
        TAEnviar = new javax.swing.JTextArea();
        BReporteVivCon = new javax.swing.JButton();
        BReporteTarioPago = new javax.swing.JButton();
        SPPago = new javax.swing.JScrollPane();
        TPagos = new javax.swing.JTable();
        PSolicitudes = new javax.swing.JPanel();
        SPSol = new javax.swing.JScrollPane();
        TSol = new javax.swing.JTable();
        PDViv = new javax.swing.JPanel();
        CBClaveViv = new javax.swing.JComboBox<>();
        LFotoViv2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TADetallesViv = new javax.swing.JTextArea();
        BReporteSol = new javax.swing.JButton();
        PSolicitud = new javax.swing.JPanel();
        BAgregar = new javax.swing.JButton();
        BQuitar = new javax.swing.JButton();
        PContrato = new javax.swing.JPanel();
        BNuevo = new javax.swing.JButton();
        BGuardar = new javax.swing.JButton();

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
        PEncabezado.setPreferredSize(new java.awt.Dimension(790, 100));

        LVOIDCAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LVOIDCAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons/voidcat_logo.png"))); // NOI18N

        LTitulo1.setBackground(new java.awt.Color(90, 0, 52));
        LTitulo1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LTitulo1.setForeground(new java.awt.Color(227, 227, 227));
        LTitulo1.setText("Sistema de renta de viviendas");

        LTitulo2.setBackground(new java.awt.Color(90, 0, 52));
        LTitulo2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        LTitulo2.setForeground(new java.awt.Color(227, 227, 227));
        LTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LTitulo2.setText("Arrendador");

        LAdorTop.setBackground(new java.awt.Color(90, 0, 52));
        LAdorTop.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LAdorTop.setForeground(new java.awt.Color(227, 227, 227));
        LAdorTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LAdorTop.setText("Nombre:");

        LClaveTop.setBackground(new java.awt.Color(90, 0, 52));
        LClaveTop.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LClaveTop.setForeground(new java.awt.Color(227, 227, 227));
        LClaveTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LClaveTop.setText("Clave:");

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

        javax.swing.GroupLayout PEncabezadoLayout = new javax.swing.GroupLayout(PEncabezado);
        PEncabezado.setLayout(PEncabezadoLayout);
        PEncabezadoLayout.setHorizontalGroup(
            PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LVOIDCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LTitulo1)
                    .addComponent(LTitulo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LClaveTop, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LAdorTop, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(LFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PEncabezadoLayout.setVerticalGroup(
            PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PEncabezadoLayout.createSequentialGroup()
                        .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LVOIDCAT, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEncabezadoLayout.createSequentialGroup()
                                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LTitulo1)
                                    .addComponent(LAdorTop))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LTitulo2)
                                    .addComponent(LClaveTop))
                                .addGap(6, 6, 6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PEncabezadoLayout.createSequentialGroup()
                        .addComponent(LFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(PEncabezadoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(LVolver)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        TPArrendador.setBackground(new java.awt.Color(29, 29, 29));
        TPArrendador.setForeground(new java.awt.Color(227, 227, 227));
        TPArrendador.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TPArrendador.setOpaque(true);

        PConsulta.setBackground(new java.awt.Color(49, 49, 49));

        SPViv.setBackground(new java.awt.Color(29, 29, 29));
        SPViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Viviendas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        TViviendas.setBackground(new java.awt.Color(29, 29, 29));
        TViviendas.setForeground(new java.awt.Color(227, 227, 227));
        TViviendas.setModel(new javax.swing.table.DefaultTableModel(
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
        TViviendas.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TViviendas.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TViviendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TViviendasMousePressed(evt);
            }
        });
        SPViv.setViewportView(TViviendas);

        SPCon.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contratos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        TContrato.setBackground(new java.awt.Color(29, 29, 29));
        TContrato.setForeground(new java.awt.Color(227, 227, 227));
        TContrato.setModel(new javax.swing.table.DefaultTableModel(
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
        TContrato.setEnabled(false);
        TContrato.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TContrato.setSelectionForeground(new java.awt.Color(227, 227, 227));
        TContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TContratoMousePressed(evt);
            }
        });
        SPCon.setViewportView(TContrato);

        PDatosTario.setBackground(new java.awt.Color(29, 29, 29));
        PDatosTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del arrendatario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        LFotoTario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LSexoTario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LSexoTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LNombreTario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LNombreTario.setForeground(new java.awt.Color(227, 227, 227));
        LNombreTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LEstatusTario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LEstatusTario.setForeground(new java.awt.Color(227, 227, 227));
        LEstatusTario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEstatusTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estatus", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        SPObservTario.setBackground(new java.awt.Color(29, 29, 29));
        SPObservTario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        SPObservTario.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        LObservaTario.setBackground(new java.awt.Color(29, 29, 29));
        LObservaTario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LObservaTario.setForeground(new java.awt.Color(227, 227, 227));
        LObservaTario.setOpaque(true);
        SPObservTario.setViewportView(LObservaTario);

        BEnviar.setBackground(new java.awt.Color(227, 227, 227));
        BEnviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BEnviar.setForeground(new java.awt.Color(29, 29, 29));
        BEnviar.setText("Enviar");
        BEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnviarActionPerformed(evt);
            }
        });

        SPEnviar.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TAEnviar.setBackground(new java.awt.Color(49, 49, 49));
        TAEnviar.setColumns(20);
        TAEnviar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TAEnviar.setForeground(new java.awt.Color(227, 227, 227));
        TAEnviar.setRows(5);
        TAEnviar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enviar observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        SPEnviar.setViewportView(TAEnviar);

        BReporteVivCon.setBackground(new java.awt.Color(227, 227, 227));
        BReporteVivCon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BReporteVivCon.setForeground(new java.awt.Color(29, 29, 29));
        BReporteVivCon.setText("Reporte viviendas");
        BReporteVivCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteVivConActionPerformed(evt);
            }
        });

        BReporteTarioPago.setBackground(new java.awt.Color(227, 227, 227));
        BReporteTarioPago.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BReporteTarioPago.setForeground(new java.awt.Color(29, 29, 29));
        BReporteTarioPago.setText("Reporte arrendatarios");
        BReporteTarioPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteTarioPagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PDatosTarioLayout = new javax.swing.GroupLayout(PDatosTario);
        PDatosTario.setLayout(PDatosTarioLayout);
        PDatosTarioLayout.setHorizontalGroup(
            PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDatosTarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPObservTario)
                    .addGroup(PDatosTarioLayout.createSequentialGroup()
                        .addComponent(LFotoTario, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LNombreTario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PDatosTarioLayout.createSequentialGroup()
                                .addComponent(LSexoTario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LEstatusTario, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))))
                    .addGroup(PDatosTarioLayout.createSequentialGroup()
                        .addComponent(SPEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEnviar))
                    .addGroup(PDatosTarioLayout.createSequentialGroup()
                        .addComponent(BReporteVivCon, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BReporteTarioPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PDatosTarioLayout.setVerticalGroup(
            PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDatosTarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LFotoTario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PDatosTarioLayout.createSequentialGroup()
                        .addComponent(LNombreTario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LEstatusTario, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(LSexoTario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPObservTario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(BEnviar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PDatosTarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BReporteVivCon)
                    .addComponent(BReporteTarioPago))
                .addContainerGap())
        );

        SPPago.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial de pagos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

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
        TPagos.setEnabled(false);
        TPagos.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TPagos.setSelectionForeground(new java.awt.Color(227, 227, 227));
        SPPago.setViewportView(TPagos);

        javax.swing.GroupLayout PConsultaLayout = new javax.swing.GroupLayout(PConsulta);
        PConsulta.setLayout(PConsultaLayout);
        PConsultaLayout.setHorizontalGroup(
            PConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPViv)
                    .addGroup(PConsultaLayout.createSequentialGroup()
                        .addComponent(SPCon, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PDatosTario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SPPago, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PConsultaLayout.setVerticalGroup(
            PConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPViv, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPCon, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addComponent(SPPago, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(PDatosTario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        TPArrendador.addTab("Consultas", PConsulta);

        PSolicitudes.setBackground(new java.awt.Color(49, 49, 49));
        PSolicitudes.setForeground(new java.awt.Color(227, 227, 227));

        TSol.setBackground(new java.awt.Color(29, 29, 29));
        TSol.setForeground(new java.awt.Color(227, 227, 227));
        TSol.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "DURACION", "MONTO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TSol.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TSol.setSelectionForeground(new java.awt.Color(227, 227, 227));
        SPSol.setViewportView(TSol);

        PDViv.setBackground(new java.awt.Color(29, 29, 29));
        PDViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la vivienda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        CBClaveViv.setBackground(new java.awt.Color(227, 227, 227));
        CBClaveViv.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CBClaveViv.setForeground(new java.awt.Color(29, 29, 29));
        CBClaveViv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBClaveViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clave", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(29, 29, 29))); // NOI18N
        CBClaveViv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBClaveVivItemStateChanged(evt);
            }
        });

        LFotoViv2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoViv2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        TADetallesViv.setBackground(new java.awt.Color(49, 49, 49));
        TADetallesViv.setColumns(20);
        TADetallesViv.setRows(5);
        TADetallesViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        jScrollPane1.setViewportView(TADetallesViv);

        BReporteSol.setBackground(new java.awt.Color(227, 227, 227));
        BReporteSol.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BReporteSol.setForeground(new java.awt.Color(29, 29, 29));
        BReporteSol.setText("Reporte");
        BReporteSol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteSolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PDVivLayout = new javax.swing.GroupLayout(PDViv);
        PDViv.setLayout(PDVivLayout);
        PDVivLayout.setHorizontalGroup(
            PDVivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PDVivLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PDVivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LFotoViv2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PDVivLayout.createSequentialGroup()
                        .addComponent(CBClaveViv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BReporteSol)))
                .addContainerGap())
        );
        PDVivLayout.setVerticalGroup(
            PDVivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PDVivLayout.createSequentialGroup()
                .addGroup(PDVivLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CBClaveViv, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(BReporteSol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LFotoViv2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PSolicitud.setBackground(new java.awt.Color(29, 29, 29));
        PSolicitud.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitud", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        BAgregar.setBackground(new java.awt.Color(227, 227, 227));
        BAgregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BAgregar.setForeground(new java.awt.Color(29, 29, 29));
        BAgregar.setText("Agregar");
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });

        BQuitar.setBackground(new java.awt.Color(227, 227, 227));
        BQuitar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BQuitar.setForeground(new java.awt.Color(29, 29, 29));
        BQuitar.setText("Quitar");
        BQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PSolicitudLayout = new javax.swing.GroupLayout(PSolicitud);
        PSolicitud.setLayout(PSolicitudLayout);
        PSolicitudLayout.setHorizontalGroup(
            PSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PSolicitudLayout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(PSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BQuitar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        PSolicitudLayout.setVerticalGroup(
            PSolicitudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PSolicitudLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        PContrato.setBackground(new java.awt.Color(29, 29, 29));
        PContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contrato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        BNuevo.setBackground(new java.awt.Color(227, 227, 227));
        BNuevo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BNuevo.setForeground(new java.awt.Color(29, 29, 29));
        BNuevo.setText("Nuevo");
        BNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNuevoActionPerformed(evt);
            }
        });

        BGuardar.setBackground(new java.awt.Color(227, 227, 227));
        BGuardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BGuardar.setForeground(new java.awt.Color(29, 29, 29));
        BGuardar.setText("Guardar");
        BGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContratoLayout = new javax.swing.GroupLayout(PContrato);
        PContrato.setLayout(PContratoLayout);
        PContratoLayout.setHorizontalGroup(
            PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PContratoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(BNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        PContratoLayout.setVerticalGroup(
            PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContratoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(BNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PSolicitudesLayout = new javax.swing.GroupLayout(PSolicitudes);
        PSolicitudes.setLayout(PSolicitudesLayout);
        PSolicitudesLayout.setHorizontalGroup(
            PSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PSolicitudesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PSolicitudesLayout.createSequentialGroup()
                        .addComponent(PContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PDViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPSol, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        PSolicitudesLayout.setVerticalGroup(
            PSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PSolicitudesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SPSol)
                    .addGroup(PSolicitudesLayout.createSequentialGroup()
                        .addComponent(PDViv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PSolicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PSolicitud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        TPArrendador.addTab("Solicitudes", PSolicitudes);

        javax.swing.GroupLayout PFondoLayout = new javax.swing.GroupLayout(PFondo);
        PFondo.setLayout(PFondoLayout);
        PFondoLayout.setHorizontalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addComponent(TPArrendador, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PFondoLayout.setVerticalGroup(
            PFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PFondoLayout.createSequentialGroup()
                .addComponent(PEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPArrendador))
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

    private void CBClaveVivItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBClaveVivItemStateChanged
        /*
        Dependiendo de la clave que se seleccione en el combobox, se mostraran los
        datos de esa vivienda en sus respectivos campos.
        */
        String id = CBClaveViv.getSelectedItem().toString();
        TADetallesViv.setText(cnx.obtenerDato("SELECT detalles FROM vivienda WHERE idvivienda = '"+id+"'"));
        LFotoViv2.setIcon(cnx.obtenerImagen("SELECT fotoviv FROM vivienda WHERE idvivienda = '"+id+"'"));
    }//GEN-LAST:event_CBClaveVivItemStateChanged

    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        // Se añade un renglon al JTable TSol
        
        DefaultTableModel modelo = (DefaultTableModel) TSol.getModel();
        
        modelo.addRow(new Object[]{
            null, null, 6, null
        });
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQuitarActionPerformed
        // Se elimina el renglon seleccionado del JTable TSol
        
        DefaultTableModel modelo = (DefaultTableModel) TSol.getModel();
        try {
            int renglon = TSol.getSelectedRow();
            modelo.removeRow(renglon);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Renglon no seleccionado", "Quitar", 2);
        }
    }//GEN-LAST:event_BQuitarActionPerformed

    private void BGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardarActionPerformed
        /*
        Por cada renglon en el JTable TSol, inserta un nuevo arrendatario y un
        nuevo contrato en la base de datos.
        */
        
        String idviv_sol = CBClaveViv.getSelectedItem().toString();
        
        DefaultTableModel modelo = (DefaultTableModel) TSol.getModel();
        for (int r = 0; r < modelo.getRowCount(); r++) {
            String id = modelo.getValueAt(r, 0).toString();
            String nombre = modelo.getValueAt(r, 1).toString();
            String duracion = modelo.getValueAt(r, 2).toString();
            String monto = modelo.getValueAt(r, 3).toString();
            ImageIcon fotosol = cnx.obtenerImagen("SELECT fotosol FROM solicitudes WHERE idsolicitud = '"+id+"'");
            String sexo = cnx.obtenerDato("SELECT sexosol FROM solicitudes WHERE idsolicitud = '"+id+"'");
            String pass = cnx.obtenerDato("SELECT passsol FROM solicitudes WHERE idsolicitud = '"+id+"'");
            
            Arrendatario tario = new Arrendatario(null, nombre, "Activo", sexo, pass, fotosol);
            if (tario.insertar(cnx) == 1) {
                String idtario2 = cnx.obtenerDato("SELECT idarrendatario FROM arrendatario WHERE nombretario = '"+nombre+"'");
                Contrato con = new Contrato(null, duracion, monto, "", idviv_sol, idtario2, fechaActual, fechaActual);
                if (con.insertar(cnx) == 1) {
                    JOptionPane.showMessageDialog(null, "Solicitud: "+id+"\nAgregada con exito", "Guardar", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "Algo salio mal", "Guardar", 4);
                }
            }
        }
    }//GEN-LAST:event_BGuardarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        
    }//GEN-LAST:event_formWindowClosed

    private void BNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNuevoActionPerformed
        limpiarTabla(TSol);
        crearComboBox();
    }//GEN-LAST:event_BNuevoActionPerformed

    private void TViviendasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TViviendasMousePressed
        /*
        Segun el renglon seleccionado, se habilita el JTable TContratos con
        los datos de los contratos que pertenecen a esa vivienda.
        */
        
        int ren = TViviendas.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TViviendas.getModel();
        
        if (ren >= 0) {
            idviv = modelo.getValueAt(ren, 0).toString();
            cnx.entablar("SELECT * FROM contrato WHERE vivienda_idvivienda = '"+idviv+"'", TContrato);
            TContrato.enable(true);
            
            LFotoTario.setIcon(null);
            LSexoTario.setIcon(null);
            LNombreTario.setText("");
            LEstatusTario.setText("");
            
            limpiarTabla(TPagos);
        }
    }//GEN-LAST:event_TViviendasMousePressed

    private void TContratoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TContratoMousePressed
        /*
        Segun el renglon seleccionado, se muestran los datos del arrendatario 
        correspondiente a ese contrato.
        */
        
        int ren = TContrato.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) TContrato.getModel();
        
        if (ren >= 0) {
            idcon = modelo.getValueAt(ren, 0).toString();
            LObservaTario.setText(modelo.getValueAt(ren, 3).toString());
            idtario = modelo.getValueAt(ren, 7).toString();
            LNombreTario.setText(cnx.obtenerDato("SELECT nombretario FROM arrendatario WHERE idarrendatario = '"+idtario+"'"));
            LEstatusTario.setText(cnx.obtenerDato("SELECT estatus FROM arrendatario WHERE idarrendatario = '"+idtario+"'"));
            LSexoTario.setIcon("Hombre".equals(cnx.obtenerDato("SELECT sexotario FROM arrendatario WHERE idarrendatario = '"+idtario+"'")) 
                    ? new ImageIcon(getClass().getResource("/img/icons/sexo_h.png")) 
                    : new ImageIcon(getClass().getResource("/img/icons/sexo_m.png")));
            foto = cnx.obtenerImagen("SELECT fototario FROM arrendatario WHERE idarrendatario = '"+idtario+"'");
            LFotoTario.setIcon(new ImageIcon(cnx.escalarImagen(foto.getImage(), 92, 92)));
            
            cnx.entablar("SELECT * FROM pago WHERE contrato_idcontrato = '"+idcon+"' ORDER BY fechapago DESC", TPagos);
        }
    }//GEN-LAST:event_TContratoMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

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

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        /*
        Actualiza el campo de observaciones de la tabla contratos de la base de
        datos.
        */
        
        String observ = TAEnviar.getText();
        
        Contrato con = new Contrato(idcon, null, null, observ, null, null, null, null);
        if (con.actualizarObservaciones(cnx) == 1) {
            JOptionPane.showMessageDialog(null, "Se han enviado las observaciones", "Enviar observaciones", 1);
            cnx.entablar("SELECT * FROM contrato WHERE vivienda_idvivienda = '"+idviv+"'", TContrato);
            TAEnviar.setText("");
            LObservaTario.setText(observ);
        } else {
            JOptionPane.showMessageDialog(null, "Algo salio mal", "Enviar observaciones", 4);
        }
    }//GEN-LAST:event_BEnviarActionPerformed

    private void BReporteVivConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteVivConActionPerformed
        String reporte = System.getProperty("user.dir") + "/arrendador_viviendas_parametros.jasper"; // Nombre del archivo del reporte
        Map parametros = new HashMap();
        parametros.put("idviv", idviv); // Nombre del parametro dentro del reporte y el valor que se le va a asignar

        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteVivConActionPerformed

    private void BReporteTarioPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteTarioPagoActionPerformed
        String reporte = System.getProperty("user.dir") + "/arrendador_arrendatario_parametros.jasper"; // Nombre del archivo del reporte
        Map parametros = new HashMap();
        parametros.put("idtario", idtario); // Nombre del parametro dentro del reporte y el valor que se le va a asignar

        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteTarioPagoActionPerformed

    private void BReporteSolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteSolActionPerformed
        String idvivsol = CBClaveViv.getSelectedItem().toString();
        
        String reporte = System.getProperty("user.dir") + "/arrendador_solicitudes_parametros.jasper"; // Nombre del archivo del reporte
        Map parametros = new HashMap();
        parametros.put("idvivsol", idvivsol); // Nombre del parametro dentro del reporte y el valor que se le va a asignar

        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteSolActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (LAdorTopd in Java SE 6) is not available, stay with the default look and feel.
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
            java.util.logging.Logger.getLogger(FArrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FArrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FArrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FArrendador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FArrendador().setVisible(true);
            }
        });
    }
    
    public void setUser(String user) {
        usuario = user;
        LAdorTop.setText(cnx.obtenerDato("SELECT nombreador FROM arrendador WHERE idarrendador = '"+usuario+"'"));
        LClaveTop.setText("Clave: " + usuario);
            
        cnx.entablar("SELECT * FROM vivienda WHERE arrendador_idarrendador = '"+usuario+"'", TViviendas);
        cnx.seleccionar("SELECT idvivienda FROM vivienda WHERE arrendador_idarrendador = '" + usuario + "' ORDER BY idvivienda", CBClaveViv);
        crearComboBox();
    }

    public void crearComboBox() {
        /*
        Crea un combobox en el JTable TSol con el id respectivo de la tabla solicitudes.
        */
        
        TableColumn colprod = TSol.getColumnModel().getColumn(0); // Toma la primera columna
        comboBox = new JComboBox();
        String id = CBClaveViv.getSelectedItem().toString();
        cnx.seleccionar("SELECT idsolicitud FROM solicitudes WHERE idviv = '"+id+"' ORDER BY idsolicitud", comboBox);
        
        colprod.setCellEditor(new DefaultCellEditor(comboBox));
        
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obtenerDatosCB();
            }
        });
    }
        
    public void obtenerDatosCB() {
        DefaultTableModel modelo = (DefaultTableModel) TSol.getModel();
        int renglon = TSol.getSelectedRow();
        
        if (renglon != -1 && comboBox.getSelectedIndex() != -1) {
            String id = comboBox.getSelectedItem().toString();
            String nombre = cnx.obtenerDato("SELECT nombresol FROM solicitudes WHERE idsolicitud = '"+id+"'");
            modelo.setValueAt(nombre, renglon, 1);
        }
    }
    
    public void limpiarTabla(JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        modelo.setRowCount(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BAgregar;
    private javax.swing.JButton BEnviar;
    private javax.swing.JButton BGuardar;
    private javax.swing.JButton BNuevo;
    private javax.swing.JButton BQuitar;
    private javax.swing.JButton BReporteSol;
    private javax.swing.JButton BReporteTarioPago;
    private javax.swing.JButton BReporteVivCon;
    private javax.swing.JComboBox<String> CBClaveViv;
    private javax.swing.JLabel LAdorTop;
    private javax.swing.JLabel LClaveTop;
    private javax.swing.JLabel LEstatusTario;
    private javax.swing.JLabel LFecha;
    private javax.swing.JLabel LFotoTario;
    private javax.swing.JLabel LFotoViv2;
    private javax.swing.JLabel LNombreTario;
    private javax.swing.JLabel LObservaTario;
    private javax.swing.JLabel LSexoTario;
    private javax.swing.JLabel LTitulo1;
    private javax.swing.JLabel LTitulo2;
    private javax.swing.JLabel LVOIDCAT;
    private javax.swing.JLabel LVolver;
    private javax.swing.JPanel PConsulta;
    private javax.swing.JPanel PContrato;
    private javax.swing.JPanel PDViv;
    private javax.swing.JPanel PDatosTario;
    private javax.swing.JPanel PEncabezado;
    private javax.swing.JPanel PFondo;
    private javax.swing.JPanel PSolicitud;
    private javax.swing.JPanel PSolicitudes;
    private javax.swing.JScrollPane SPCon;
    private javax.swing.JScrollPane SPEnviar;
    private javax.swing.JScrollPane SPObservTario;
    private javax.swing.JScrollPane SPPago;
    private javax.swing.JScrollPane SPSol;
    private javax.swing.JScrollPane SPViv;
    private javax.swing.JTextArea TADetallesViv;
    private javax.swing.JTextArea TAEnviar;
    private javax.swing.JTable TContrato;
    private javax.swing.JTabbedPane TPArrendador;
    private javax.swing.JTable TPagos;
    private javax.swing.JTable TSol;
    private javax.swing.JTable TViviendas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
