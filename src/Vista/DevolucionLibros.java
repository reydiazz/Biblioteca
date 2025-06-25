package Vista;

import javax.swing.ImageIcon;

public class DevolucionLibros extends javax.swing.JFrame {

    public DevolucionLibros() {
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
        lbl_titulo = new javax.swing.JLabel();
        btn_devolverLibro = new javax.swing.JButton();
        txf_buscar = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JLabel();
        js_tablaDevolucion = new javax.swing.JScrollPane();
        tbl_tablaDevolucion = new javax.swing.JTable();
        lbl_iconoBuscar = new javax.swing.JLabel();
        lbl_imagenDevolucion = new javax.swing.JLabel();
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("DEVOLUCION");
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 70));

        btn_devolverLibro.setBackground(new java.awt.Color(204, 0, 0));
        btn_devolverLibro.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_devolverLibro.setForeground(new java.awt.Color(255, 255, 255));
        btn_devolverLibro.setText("DEVOLVER");
        btn_devolverLibro.setBorder(null);
        pn_principal.add(btn_devolverLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 210, 160, 40));
        pn_principal.add(txf_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 210, 230, 40));

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_HOME.png"))); // NOI18N
        pn_principal.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        tbl_tablaDevolucion.setModel(new javax.swing.table.DefaultTableModel(
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
        js_tablaDevolucion.setViewportView(tbl_tablaDevolucion);

        pn_principal.add(js_tablaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 880, 430));

        lbl_iconoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_BUSCAR.png"))); // NOI18N
        pn_principal.add(lbl_iconoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 190, -1, 60));

        lbl_imagenDevolucion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_DEVOLUCION.png"))); // NOI18N
        pn_principal.add(lbl_imagenDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, -1, 410));

        pn_toolbar.setBackground(new java.awt.Color(204, 51, 0));
        pn_toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ventana.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbl_ventana.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ventana.setText("Devolucion de libros");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 180, 40));

        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_MINIMIZAR.png"))); // NOI18N
        pn_toolbar.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_CERRAR.png"))); // NOI18N
        pn_toolbar.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 0, 40, 40));

        pn_principal.add(pn_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        getContentPane().add(pn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel btn_cerrar;
    public javax.swing.JButton btn_devolverLibro;
    public javax.swing.JLabel btn_minimizar;
    public javax.swing.JLabel btn_regresar;
    public javax.swing.JScrollPane js_tablaDevolucion;
    public javax.swing.JLabel lbl_iconoBuscar;
    public javax.swing.JLabel lbl_imagenDevolucion;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    public javax.swing.JTable tbl_tablaDevolucion;
    public javax.swing.JTextField txf_buscar;
    // End of variables declaration//GEN-END:variables
}
