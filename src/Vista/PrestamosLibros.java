package Vista;

import javax.swing.ImageIcon;

public class PrestamosLibros extends javax.swing.JFrame {

    public PrestamosLibros() {
        setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO.png")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principal = new javax.swing.JPanel();
        txf_buscar = new javax.swing.JTextField();
        btn_prestamo = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JLabel();
        js_tablaPrestamo = new javax.swing.JScrollPane();
        tbl_tablaPrestamo = new javax.swing.JTable();
        lbl_imagenBuscar = new javax.swing.JLabel();
        pn_formulario = new javax.swing.JPanel();
        lbl_codigoLibro = new javax.swing.JLabel();
        txf_codigoLibro = new javax.swing.JTextField();
        lbl_codigoAlumno = new javax.swing.JLabel();
        lbl_fechaDevolucion = new javax.swing.JLabel();
        txf_fechaDevolucion = new javax.swing.JTextField();
        txf_codigoAlumno = new javax.swing.JTextField();
        lbl_imagenPrestamo = new javax.swing.JLabel();
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pn_principal.add(txf_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, 240, 40));

        btn_prestamo.setBackground(new java.awt.Color(204, 0, 0));
        btn_prestamo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_prestamo.setForeground(new java.awt.Color(255, 255, 255));
        btn_prestamo.setText("PRESTAMO");
        btn_prestamo.setBorder(null);
        pn_principal.add(btn_prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 240, 50));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("PRESTAMO");
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 90));

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_HOME.png"))); // NOI18N
        pn_principal.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

        tbl_tablaPrestamo.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo del libro", "Libro", "Codigo del alumno", "Nombre", "Vencimiento "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        js_tablaPrestamo.setViewportView(tbl_tablaPrestamo);
        if (tbl_tablaPrestamo.getColumnModel().getColumnCount() > 0) {
            tbl_tablaPrestamo.getColumnModel().getColumn(0).setResizable(false);
            tbl_tablaPrestamo.getColumnModel().getColumn(1).setResizable(false);
            tbl_tablaPrestamo.getColumnModel().getColumn(2).setResizable(false);
            tbl_tablaPrestamo.getColumnModel().getColumn(3).setResizable(false);
            tbl_tablaPrestamo.getColumnModel().getColumn(4).setResizable(false);
        }

        pn_principal.add(js_tablaPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 880, 430));

        lbl_imagenBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_BUSCAR.png"))); // NOI18N
        pn_principal.add(lbl_imagenBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 210, -1, 60));

        pn_formulario.setBackground(new java.awt.Color(255, 255, 255));
        pn_formulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_codigoLibro.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_codigoLibro.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codigoLibro.setText("Codigo del libro");
        pn_formulario.add(lbl_codigoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        txf_codigoLibro.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_formulario.add(txf_codigoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 40));

        lbl_codigoAlumno.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_codigoAlumno.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codigoAlumno.setText("Codigo del alumno");
        pn_formulario.add(lbl_codigoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lbl_fechaDevolucion.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_fechaDevolucion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_fechaDevolucion.setText("Fecha devolucion");
        pn_formulario.add(lbl_fechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        txf_fechaDevolucion.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_formulario.add(txf_fechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 40));

        txf_codigoAlumno.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_formulario.add(txf_codigoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 240, 40));

        pn_principal.add(pn_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 240, 250));

        lbl_imagenPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMGEN_PRESTAMO.png"))); // NOI18N
        pn_principal.add(lbl_imagenPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 530, 320));

        pn_toolbar.setBackground(new java.awt.Color(204, 51, 0));
        pn_toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ventana.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbl_ventana.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ventana.setText("Prestamo de libros");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_MINIMIZAR.png"))); // NOI18N
        pn_toolbar.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_CERRAR.png"))); // NOI18N
        pn_toolbar.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 0, 40, 40));

        pn_principal.add(pn_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        getContentPane().add(pn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_cerrar;
    public javax.swing.JLabel btn_minimizar;
    public javax.swing.JButton btn_prestamo;
    public javax.swing.JLabel btn_regresar;
    public javax.swing.JScrollPane js_tablaPrestamo;
    public javax.swing.JLabel lbl_codigoAlumno;
    public javax.swing.JLabel lbl_codigoLibro;
    public javax.swing.JLabel lbl_fechaDevolucion;
    public javax.swing.JLabel lbl_imagenBuscar;
    public javax.swing.JLabel lbl_imagenPrestamo;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_formulario;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    public javax.swing.JTable tbl_tablaPrestamo;
    public javax.swing.JTextField txf_buscar;
    public javax.swing.JTextField txf_codigoAlumno;
    public javax.swing.JTextField txf_codigoLibro;
    public javax.swing.JTextField txf_fechaDevolucion;
    // End of variables declaration//GEN-END:variables
}
