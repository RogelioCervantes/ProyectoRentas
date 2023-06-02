
import java.awt.Color;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * @author Rogelio Cervantes Castellon
 */
public class FArrendatario extends javax.swing.JFrame {

    String usuario;
    Conexion cnx;
    int monto, diasAtraso;
    boolean inactivo = false;
    ImageIcon icon = new ImageIcon(getClass().getResource("/img/icons/voidcat.png"));

    LocalDate fechaLocal = LocalDate.now();
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String fechaFormateada = fechaLocal.format(formato);
    Date fechaActual = Date.valueOf(fechaLocal);
    Date fechasig;

    public FArrendatario() {
        initComponents();
        setIconImage(icon.getImage());
        setTitle("Arrendatario");

        SPTario.getViewport().setBackground(new Color(29, 29, 29));
        SPPagos.getViewport().setBackground(new Color(29, 29, 29));

        TTario.setRowHeight(128);
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

        Background = new javax.swing.JPanel();
        TPArrendatario = new javax.swing.JTabbedPane();
        PInicio = new javax.swing.JPanel();
        Arrendatario = new javax.swing.JPanel();
        LFoto = new javax.swing.JLabel();
        LNombre = new javax.swing.JLabel();
        LSexo = new javax.swing.JLabel();
        LClave = new javax.swing.JLabel();
        LEstatus = new javax.swing.JLabel();
        BReporteTario = new javax.swing.JButton();
        Arrendador = new javax.swing.JPanel();
        LFoto2 = new javax.swing.JLabel();
        LNombre2 = new javax.swing.JLabel();
        LSexo2 = new javax.swing.JLabel();
        LContacto = new javax.swing.JLabel();
        TADireccion = new javax.swing.JTextArea();
        Vivienda = new javax.swing.JPanel();
        LTipoViv = new javax.swing.JLabel();
        TADetalles = new javax.swing.JTextArea();
        LFotoViv = new javax.swing.JLabel();
        PPago = new javax.swing.JPanel();
        PContrato = new javax.swing.JPanel();
        LClaveContrato = new javax.swing.JLabel();
        LDuracion = new javax.swing.JLabel();
        LObservaciones = new javax.swing.JLabel();
        TFObservaciones = new javax.swing.JTextArea();
        BEnviar = new javax.swing.JButton();
        LFechaInicio = new javax.swing.JLabel();
        BReporteContrato = new javax.swing.JButton();
        SPPagos = new javax.swing.JScrollPane();
        TPagos = new javax.swing.JTable();
        PPagar = new javax.swing.JPanel();
        TFTarjeta = new javax.swing.JTextField();
        TFFecha = new javax.swing.JTextField();
        TFCVS = new javax.swing.JTextField();
        BPagar = new javax.swing.JButton();
        LMonto = new javax.swing.JLabel();
        LDiasAtraso = new javax.swing.JLabel();
        LFechaSig = new javax.swing.JLabel();
        PTabla = new javax.swing.JPanel();
        SPTario = new javax.swing.JScrollPane();
        TTario = new javax.swing.JTable();
        PEncabezado = new javax.swing.JPanel();
        Header = new javax.swing.JLabel();
        LFecha = new javax.swing.JLabel();
        LVOIDCAT = new javax.swing.JLabel();
        Header1 = new javax.swing.JLabel();
        LTarioTop = new javax.swing.JLabel();
        LClaveTop = new javax.swing.JLabel();
        LVolver = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(29, 29, 29));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Background.setBackground(new java.awt.Color(49, 49, 49));

        TPArrendatario.setBackground(new java.awt.Color(29, 29, 29));
        TPArrendatario.setForeground(new java.awt.Color(227, 227, 227));
        TPArrendatario.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TPArrendatario.setOpaque(true);

        PInicio.setBackground(new java.awt.Color(49, 49, 49));
        PInicio.setForeground(new java.awt.Color(227, 227, 227));

        Arrendatario.setBackground(new java.awt.Color(49, 49, 49));
        Arrendatario.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 29, 29)), "Tus datos.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        LFoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFoto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LNombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LNombre.setForeground(new java.awt.Color(227, 227, 227));
        LNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LSexo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LSexo.setForeground(new java.awt.Color(227, 227, 227));
        LSexo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LClave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LClave.setForeground(new java.awt.Color(227, 227, 227));
        LClave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LClave.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Clave", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LEstatus.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LEstatus.setForeground(new java.awt.Color(227, 227, 227));
        LEstatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LEstatus.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Estatus", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        BReporteTario.setBackground(new java.awt.Color(227, 227, 227));
        BReporteTario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReporteTario.setForeground(new java.awt.Color(29, 29, 29));
        BReporteTario.setText("Reporte");
        BReporteTario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteTarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ArrendatarioLayout = new javax.swing.GroupLayout(Arrendatario);
        Arrendatario.setLayout(ArrendatarioLayout);
        ArrendatarioLayout.setHorizontalGroup(
            ArrendatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArrendatarioLayout.createSequentialGroup()
                .addGap(0, 33, Short.MAX_VALUE)
                .addComponent(LFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ArrendatarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ArrendatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LClave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LEstatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BReporteTario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ArrendatarioLayout.setVerticalGroup(
            ArrendatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArrendatarioLayout.createSequentialGroup()
                .addGroup(ArrendatarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ArrendatarioLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(LSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(LNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LClave, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LEstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BReporteTario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        Arrendador.setBackground(new java.awt.Color(49, 49, 49));
        Arrendador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 29, 29)), "Datos del arrendador.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        LFoto2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFoto2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LNombre2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LNombre2.setForeground(new java.awt.Color(227, 227, 227));
        LNombre2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LNombre2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LSexo2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LSexo2.setForeground(new java.awt.Color(227, 227, 227));
        LSexo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LSexo2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LContacto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LContacto.setForeground(new java.awt.Color(227, 227, 227));
        LContacto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Contacto", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TADireccion.setBackground(new java.awt.Color(49, 49, 49));
        TADireccion.setColumns(20);
        TADireccion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TADireccion.setForeground(new java.awt.Color(227, 227, 227));
        TADireccion.setRows(5);
        TADireccion.setToolTipText("");
        TADireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Dirección", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        javax.swing.GroupLayout ArrendadorLayout = new javax.swing.GroupLayout(Arrendador);
        Arrendador.setLayout(ArrendadorLayout);
        ArrendadorLayout.setHorizontalGroup(
            ArrendadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LNombre2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TADireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
            .addComponent(LContacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(ArrendadorLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ArrendadorLayout.setVerticalGroup(
            ArrendadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ArrendadorLayout.createSequentialGroup()
                .addGroup(ArrendadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ArrendadorLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(LSexo2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(LNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TADireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Vivienda.setBackground(new java.awt.Color(29, 29, 29));
        Vivienda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la vivienda.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

        LTipoViv.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LTipoViv.setForeground(new java.awt.Color(227, 227, 227));
        LTipoViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TADetalles.setBackground(new java.awt.Color(29, 29, 29));
        TADetalles.setColumns(20);
        TADetalles.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TADetalles.setForeground(new java.awt.Color(227, 227, 227));
        TADetalles.setRows(5);
        TADetalles.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LFotoViv.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFotoViv.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Foto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        javax.swing.GroupLayout ViviendaLayout = new javax.swing.GroupLayout(Vivienda);
        Vivienda.setLayout(ViviendaLayout);
        ViviendaLayout.setHorizontalGroup(
            ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TADetalles, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
                    .addComponent(LTipoViv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LFotoViv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        ViviendaLayout.setVerticalGroup(
            ViviendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViviendaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LTipoViv, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TADetalles, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LFotoViv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PInicioLayout = new javax.swing.GroupLayout(PInicio);
        PInicio.setLayout(PInicioLayout);
        PInicioLayout.setHorizontalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PInicioLayout.createSequentialGroup()
                .addComponent(Arrendatario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Arrendador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PInicioLayout.setVerticalGroup(
            PInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Arrendatario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Vivienda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Arrendador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TPArrendatario.addTab("Inicio", PInicio);

        PPago.setBackground(new java.awt.Color(49, 49, 49));

        PContrato.setBackground(new java.awt.Color(29, 29, 29));
        PContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contrato", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N
        PContrato.setForeground(new java.awt.Color(227, 227, 227));

        LClaveContrato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LClaveContrato.setForeground(new java.awt.Color(227, 227, 227));
        LClaveContrato.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LClaveContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Clave de contrato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LDuracion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LDuracion.setForeground(new java.awt.Color(227, 227, 227));
        LDuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LDuracion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Duración", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LObservaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LObservaciones.setForeground(new java.awt.Color(227, 227, 227));
        LObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TFObservaciones.setBackground(new java.awt.Color(49, 49, 49));
        TFObservaciones.setColumns(20);
        TFObservaciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFObservaciones.setForeground(new java.awt.Color(227, 227, 227));
        TFObservaciones.setRows(5);
        TFObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enviar observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        BEnviar.setBackground(new java.awt.Color(227, 227, 227));
        BEnviar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BEnviar.setForeground(new java.awt.Color(29, 29, 29));
        BEnviar.setText("Enviar");
        BEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnviarActionPerformed(evt);
            }
        });

        LFechaInicio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LFechaInicio.setForeground(new java.awt.Color(227, 227, 227));
        LFechaInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 72, 72)), "Fecha de inicio", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        BReporteContrato.setBackground(new java.awt.Color(227, 227, 227));
        BReporteContrato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BReporteContrato.setForeground(new java.awt.Color(29, 29, 29));
        BReporteContrato.setText("Reporte");
        BReporteContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BReporteContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PContratoLayout = new javax.swing.GroupLayout(PContrato);
        PContrato.setLayout(PContratoLayout);
        PContratoLayout.setHorizontalGroup(
            PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PContratoLayout.createSequentialGroup()
                        .addComponent(LClaveContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BReporteContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PContratoLayout.createSequentialGroup()
                        .addComponent(TFObservaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LObservaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        PContratoLayout.setVerticalGroup(
            PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PContratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LClaveContrato, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(LDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(LFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BReporteContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(LObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PContratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TFObservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        SPPagos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial de pagos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N

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
        SPPagos.setViewportView(TPagos);

        PPagar.setBackground(new java.awt.Color(29, 29, 29));
        PPagar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pago", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(227, 227, 227))); // NOI18N
        PPagar.setForeground(new java.awt.Color(227, 227, 227));

        TFTarjeta.setBackground(new java.awt.Color(49, 49, 49));
        TFTarjeta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFTarjeta.setForeground(new java.awt.Color(227, 227, 227));
        TFTarjeta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número de tarjeta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        TFFecha.setBackground(new java.awt.Color(49, 49, 49));
        TFFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFFecha.setForeground(new java.awt.Color(227, 227, 227));
        TFFecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de vencimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        TFFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFFechaActionPerformed(evt);
            }
        });

        TFCVS.setBackground(new java.awt.Color(49, 49, 49));
        TFCVS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TFCVS.setForeground(new java.awt.Color(227, 227, 227));
        TFCVS.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Número de seguridad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N
        TFCVS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCVSActionPerformed(evt);
            }
        });

        BPagar.setBackground(new java.awt.Color(227, 227, 227));
        BPagar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BPagar.setForeground(new java.awt.Color(29, 29, 29));
        BPagar.setText("Pagar");
        BPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPagarActionPerformed(evt);
            }
        });

        LMonto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LMonto.setForeground(new java.awt.Color(227, 227, 227));
        LMonto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Monto a pagar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LDiasAtraso.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LDiasAtraso.setForeground(new java.awt.Color(227, 227, 227));
        LDiasAtraso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LDiasAtraso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dias de atraso", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        LFechaSig.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LFechaSig.setForeground(new java.awt.Color(227, 227, 227));
        LFechaSig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LFechaSig.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha del pago", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(227, 227, 227))); // NOI18N

        javax.swing.GroupLayout PPagarLayout = new javax.swing.GroupLayout(PPagar);
        PPagar.setLayout(PPagarLayout);
        PPagarLayout.setHorizontalGroup(
            PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BPagar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PPagarLayout.createSequentialGroup()
                        .addGroup(PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                            .addComponent(LMonto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LFechaSig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TFCVS, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(LDiasAtraso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        PPagarLayout.setVerticalGroup(
            PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(LDiasAtraso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LFechaSig, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(PPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TFTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TFCVS, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(BPagar, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout PPagoLayout = new javax.swing.GroupLayout(PPago);
        PPago.setLayout(PPagoLayout);
        PPagoLayout.setHorizontalGroup(
            PPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPagoLayout.createSequentialGroup()
                        .addComponent(PPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(PContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPPagos, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PPagoLayout.setVerticalGroup(
            PPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PPagoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PPagoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PPagoLayout.createSequentialGroup()
                        .addComponent(PContrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(SPPagos))
                .addContainerGap())
        );

        TPArrendatario.addTab("Pago", PPago);

        PTabla.setBackground(new java.awt.Color(49, 49, 49));
        PTabla.setForeground(new java.awt.Color(227, 227, 227));

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
        TTario.setSelectionBackground(new java.awt.Color(64, 0, 51));
        TTario.setSelectionForeground(new java.awt.Color(227, 227, 227));
        SPTario.setViewportView(TTario);

        javax.swing.GroupLayout PTablaLayout = new javax.swing.GroupLayout(PTabla);
        PTabla.setLayout(PTablaLayout);
        PTablaLayout.setHorizontalGroup(
            PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPTario, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                .addContainerGap())
        );
        PTablaLayout.setVerticalGroup(
            PTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PTablaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SPTario, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                .addContainerGap())
        );

        TPArrendatario.addTab("Tabla", PTabla);

        PEncabezado.setBackground(new java.awt.Color(90, 0, 52));
        PEncabezado.setPreferredSize(new java.awt.Dimension(340, 100));

        Header.setBackground(new java.awt.Color(90, 0, 52));
        Header.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Header.setForeground(new java.awt.Color(227, 227, 227));
        Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header.setText("Arrendatario");

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

        LTarioTop.setBackground(new java.awt.Color(90, 0, 52));
        LTarioTop.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LTarioTop.setForeground(new java.awt.Color(227, 227, 227));
        LTarioTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LTarioTop.setText("Nombre:");

        LClaveTop.setBackground(new java.awt.Color(90, 0, 52));
        LClaveTop.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        LClaveTop.setForeground(new java.awt.Color(227, 227, 227));
        LClaveTop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LClaveTop.setText("Clave:");

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
                    .addGroup(PEncabezadoLayout.createSequentialGroup()
                        .addComponent(Header1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LTarioTop))
                    .addGroup(PEncabezadoLayout.createSequentialGroup()
                        .addComponent(Header)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LClaveTop)))
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
                            .addComponent(LTarioTop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Header)
                            .addComponent(LClaveTop))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PEncabezadoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LVolver)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TPArrendatario)
            .addComponent(PEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TPArrendatario))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFCVSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCVSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCVSActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing

    private void BReporteTarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteTarioActionPerformed
        String reporte = System.getProperty("user.dir") + "/arrendatario_parametros.jasper"; // Nombre del archivo del reporte
        Map parametros = new HashMap();
        parametros.put("usuario", usuario); // Nombre del parametro dentro del reporte y el valor que se le va a asignar

        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteTarioActionPerformed

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        String observaciones = TFObservaciones.getText();
        String idcon = LClaveContrato.getText();

        /*
        Llama a la clase contrato y le pasa los parametros necesarios para usar 
        el metodo actualizarObservaciones().
         */
        Contrato con = new Contrato(idcon, null, null, observaciones, null, null, null, null);
        if (con.actualizarObservaciones(cnx) == 1) {
            JOptionPane.showMessageDialog(null, "Observaciones enviadas", "Observaciones", 1);
            TFObservaciones.setText(observaciones);
        } else {
            JOptionPane.showMessageDialog(null, "Algo salió mal", "Observaciones", 4);
        }
    }//GEN-LAST:event_BEnviarActionPerformed

    private void BPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPagarActionPerformed
        String idcon = LClaveContrato.getText();

        /*
        No permite hacer el pago si el estado del usuario se encuentra inactivo 
        o si aun no es la fecha del pago.
        Al pagar se actualiza la fecha del siguiente pago y el pago se registra 
        dentro de la base de datos.
         */
        if (inactivo) {
            JOptionPane.showMessageDialog(null, "Se ha inactivado su servicio por atrasarse con la renta.\n"
                    + "Por favor, contacte a su arrendador", "Atención", 2);
        } else {
            if (fechaActual.before(fechasig)) {
                JOptionPane.showMessageDialog(null, "Aun no puedes pagar", "Pagar", 2);
            } else {
                LocalDate fechaTemp = fechasig.toLocalDate();
                fechasig = Date.valueOf(fechaTemp.plusMonths(1));

                Contrato con = new Contrato(idcon, null, null, null, null, null, null, fechasig);
                if (con.actualizaFecha(cnx) != 1) {
                    JOptionPane.showMessageDialog(null, "Algo salió mal", "Actualizar fecha siguiete de pago", 4);
                } else {
                    monto(usuario);
                    Pago pago = new Pago(fechaActual, monto, null, idcon);
                    if (pago.insertar(cnx) == 1) {
                        JOptionPane.showMessageDialog(null, "Renta pagada", "Pago", 1);
                        cnx.entablar("SELECT * FROM pago WHERE contrato_idcontrato = '" + idcon + "' ORDER BY fechapago DESC", TPagos);
                    } else {
                        JOptionPane.showMessageDialog(null, "Algo salió mal", "Pago", 4);
                    }
                }
            }
        }
    }//GEN-LAST:event_BPagarActionPerformed

    private void TFFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFFechaActionPerformed

    private void BReporteContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BReporteContratoActionPerformed
        String idcon = LClaveContrato.getText();

        String reporte = System.getProperty("user.dir") + "/arrendatario_contrato_parametros.jasper"; // Nombre del archivo del reporte
        Map parametros = new HashMap();
        parametros.put("idcon", idcon); // Nombre del parametro dentro del reporte y el valor que se le va a asignar

        cnx.ejecutarReporte(reporte, parametros);
    }//GEN-LAST:event_BReporteContratoActionPerformed

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
            java.util.logging.Logger.getLogger(FArrendatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FArrendatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FArrendatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FArrendatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FArrendatario().setVisible(true);
            }
        });
    }

    public void setUser(String user) {
        /*
        Usa el id ingresado en FLogIn para obtener todos los datos necesarios de
        la base de datos.
         */

        usuario = user;

        String sql = "SELECT idarrendatario, nombretario, estatus, sexotario, fototario, "
                + "nombreador, sexoador, telador, direccion, fotoador, tipo, detalles, fotoviv "
                + "FROM renta "
                + "WHERE idarrendatario = '" + usuario + "' ";

        cnx.entablar(sql, TTario);

        llenarCampos(usuario);

        String idcon = LClaveContrato.getText();
        cnx.entablar("SELECT * FROM pago WHERE contrato_idcontrato = '" + idcon + "' ORDER BY fechapago DESC", TPagos);
    }

    public void llenarCampos(String usuario) {
        int ren = 0;
        DefaultTableModel modelo = (DefaultTableModel) TTario.getModel();

        // Datos del arrendatario
        LClave.setText(modelo.getValueAt(ren, 0).toString());
        LNombre.setText(modelo.getValueAt(ren, 1).toString());
        LEstatus.setText(modelo.getValueAt(ren, 2).toString());
        if ("Inactivo".equals(LEstatus.getText())) {
            inactivo = true;
        }
        LSexo.setIcon("Hombre".equals(modelo.getValueAt(ren, 3).toString())
                ? new ImageIcon(getClass().getResource("/img/icons/sexo_h.png"))
                : new ImageIcon(getClass().getResource("/img/icons/sexo_m.png")));
        LFoto.setIcon((ImageIcon) modelo.getValueAt(ren, 4));

        // Datos del arrendador
        LNombre2.setText(modelo.getValueAt(ren, 5).toString());
        LSexo2.setIcon("Hombre".equals(modelo.getValueAt(ren, 6).toString())
                ? new ImageIcon(getClass().getResource("/img/icons/sexo_h.png"))
                : new ImageIcon(getClass().getResource("/img/icons/sexo_m.png")));
        LContacto.setText(modelo.getValueAt(ren, 7).toString());
        TADireccion.setText(modelo.getValueAt(ren, 8).toString());
        LFoto2.setIcon((ImageIcon) modelo.getValueAt(ren, 9));

        // Datos de la vivienda
        LTipoViv.setText(modelo.getValueAt(ren, 10).toString());
        TADetalles.setText(modelo.getValueAt(ren, 11).toString());
        LFotoViv.setIcon((ImageIcon) modelo.getValueAt(ren, 12));

        // Datos del contrato
        LClaveContrato.setText(cnx.obtenerDato("SELECT idcontrato FROM contrato WHERE arrendatario_idarrendatario = '" + usuario + "'"));
        LDuracion.setText(cnx.obtenerDato("SELECT duracion FROM contrato WHERE arrendatario_idarrendatario = '" + usuario + "'"));
        LObservaciones.setText(cnx.obtenerDato("SELECT observaciones FROM contrato WHERE arrendatario_idarrendatario = '" + usuario + "'"));
        LFechaInicio.setText(cnx.obtenerDato("SELECT fechainicio FROM contrato WHERE arrendatario_idarrendatario = '" + usuario + "'"));

        monto(usuario);
    }

    public void monto(String usuario) {
        /*
        Calcula el monto que se va a cobrar en la renta comprobando la fecha actual
        con la fecha en la que se tiene que pagar.
         */
        if (!inactivo) {
            monto = Integer.parseInt(cnx.obtenerDato("SELECT montocon FROM contrato WHERE arrendatario_idarrendatario = '" + usuario + "'"));
            fechasig = Date.valueOf(cnx.obtenerDato("SELECT fechasig FROM contrato WHERE arrendatario_idarrendatario = '" + usuario + "'"));
            diasAtraso = 0;

            Calendar calFechaSig = Calendar.getInstance();
            calFechaSig.setTime(fechasig);

            Calendar calFechaActual = Calendar.getInstance();
            calFechaActual.setTime(fechaActual);

            if ((calFechaActual.get(Calendar.MONTH) == calFechaSig.get(Calendar.MONTH)
                    && calFechaActual.get(Calendar.DAY_OF_MONTH) > calFechaSig.get(Calendar.DAY_OF_MONTH))
                    || calFechaActual.get(Calendar.MONTH) > calFechaSig.get(Calendar.MONTH)) {

                LocalDate LDFechaSig = fechasig.toLocalDate();
                LocalDate LDFechaActual = fechaActual.toLocalDate();
                diasAtraso = (int) ChronoUnit.DAYS.between(LDFechaActual, LDFechaSig);

                if (diasAtraso > 7) {
                    JOptionPane.showMessageDialog(null, "Se ha inactivado su servicio por atrasarse con la renta.\n"
                            + "Por favor, contacte a su arrendador", "Atención", 2);
                    Arrendatario tario = new Arrendatario(usuario, null, "Inactivo", null, null, null);
                    if (tario.actualizarEstatus(cnx) == 1) {
                        LEstatus.setText(cnx.obtenerDato("SELECT estatus FROM arrendatario WHERE idarrendatario = '" + usuario + "'"));
                        inactivo = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar estatus.", "Error", 4);
                    }
                } else {
                    monto += diasAtraso * 100;
                }
            }
        }
        if (inactivo) {
            LMonto.setText("-");
            LFechaSig.setText("-");
            LDiasAtraso.setText("-");
        } else {
            LMonto.setText("$ " + monto + ".00");
            LFechaSig.setText(fechasig.toString());
            LDiasAtraso.setText("" + diasAtraso);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Arrendador;
    private javax.swing.JPanel Arrendatario;
    private javax.swing.JButton BEnviar;
    private javax.swing.JButton BPagar;
    private javax.swing.JButton BReporteContrato;
    private javax.swing.JButton BReporteTario;
    private javax.swing.JPanel Background;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel Header1;
    private javax.swing.JLabel LClave;
    private javax.swing.JLabel LClaveContrato;
    private javax.swing.JLabel LClaveTop;
    private javax.swing.JLabel LContacto;
    private javax.swing.JLabel LDiasAtraso;
    private javax.swing.JLabel LDuracion;
    private javax.swing.JLabel LEstatus;
    private javax.swing.JLabel LFecha;
    private javax.swing.JLabel LFechaInicio;
    private javax.swing.JLabel LFechaSig;
    private javax.swing.JLabel LFoto;
    private javax.swing.JLabel LFoto2;
    private javax.swing.JLabel LFotoViv;
    private javax.swing.JLabel LMonto;
    private javax.swing.JLabel LNombre;
    private javax.swing.JLabel LNombre2;
    private javax.swing.JLabel LObservaciones;
    private javax.swing.JLabel LSexo;
    private javax.swing.JLabel LSexo2;
    private javax.swing.JLabel LTarioTop;
    private javax.swing.JLabel LTipoViv;
    private javax.swing.JLabel LVOIDCAT;
    private javax.swing.JLabel LVolver;
    private javax.swing.JPanel PContrato;
    private javax.swing.JPanel PEncabezado;
    private javax.swing.JPanel PInicio;
    private javax.swing.JPanel PPagar;
    private javax.swing.JPanel PPago;
    private javax.swing.JPanel PTabla;
    private javax.swing.JScrollPane SPPagos;
    private javax.swing.JScrollPane SPTario;
    private javax.swing.JTextArea TADetalles;
    private javax.swing.JTextArea TADireccion;
    private javax.swing.JTextField TFCVS;
    private javax.swing.JTextField TFFecha;
    private javax.swing.JTextArea TFObservaciones;
    private javax.swing.JTextField TFTarjeta;
    private javax.swing.JTabbedPane TPArrendatario;
    private javax.swing.JTable TPagos;
    private javax.swing.JTable TTario;
    private javax.swing.JPanel Vivienda;
    // End of variables declaration//GEN-END:variables
}
