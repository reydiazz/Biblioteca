package Vista;

import javax.swing.ImageIcon;

public class RegistrarAlumno extends javax.swing.JFrame {

    public RegistrarAlumno() {
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
        pn_contenedorFormulario = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        txf_codigo = new javax.swing.JTextField();
        lbl_nombre = new javax.swing.JLabel();
        lbl_apellido = new javax.swing.JLabel();
        txf_apellido = new javax.swing.JTextField();
        lbl_nivel = new javax.swing.JLabel();
        txf_nivel = new javax.swing.JTextField();
        txf_grado = new javax.swing.JTextField();
        lbl_grado = new javax.swing.JLabel();
        lbl_seccion = new javax.swing.JLabel();
        txf_seccion = new javax.swing.JTextField();
        txf_nombre = new javax.swing.JTextField();
        js_tablaAlumnos = new javax.swing.JScrollPane();
        tbl_tablaAlumnos = new javax.swing.JTable();
        txf_buscador = new javax.swing.JTextField();
        btn_regresar = new javax.swing.JLabel();
        lbl_imagenAlumnos = new javax.swing.JLabel();
        lbl_iconoBuscador = new javax.swing.JLabel();
        btn_modificar = new javax.swing.JButton();
        btn_registrar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
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
        lbl_titulo.setText("ALUMNOS");
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 90));

        pn_contenedorFormulario.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenedorFormulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_codigo.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codigo.setText("Codigo del estudiante");
        pn_contenedorFormulario.add(lbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        txf_codigo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_contenedorFormulario.add(txf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 240, 30));

        lbl_nombre.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_nombre.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nombre.setText("Nombre");
        pn_contenedorFormulario.add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lbl_apellido.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_apellido.setForeground(new java.awt.Color(0, 0, 0));
        lbl_apellido.setText("Apellido");
        pn_contenedorFormulario.add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        txf_apellido.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_contenedorFormulario.add(txf_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 40));

        lbl_nivel.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_nivel.setForeground(new java.awt.Color(0, 0, 0));
        lbl_nivel.setText("Nivel academico");
        pn_contenedorFormulario.add(lbl_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        txf_nivel.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_contenedorFormulario.add(txf_nivel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 40));

        txf_grado.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_contenedorFormulario.add(txf_grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 240, 40));

        lbl_grado.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_grado.setForeground(new java.awt.Color(0, 0, 0));
        lbl_grado.setText("Grado");
        pn_contenedorFormulario.add(lbl_grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        lbl_seccion.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_seccion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_seccion.setText("Seccion");
        pn_contenedorFormulario.add(lbl_seccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        txf_seccion.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_contenedorFormulario.add(txf_seccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 240, 40));

        txf_nombre.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_contenedorFormulario.add(txf_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 240, 40));

        pn_principal.add(pn_contenedorFormulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 240, 490));

        tbl_tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellido", "Nivel ", "Grado", "Seccion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        js_tablaAlumnos.setViewportView(tbl_tablaAlumnos);

        pn_principal.add(js_tablaAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 840, 380));

        txf_buscador.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_principal.add(txf_buscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 220, 230, 40));

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_HOME.png"))); // NOI18N
        pn_principal.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, 60));

        lbl_imagenAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_ESTUDIANTES.png"))); // NOI18N
        lbl_imagenAlumnos.setText("jLabel2");
        pn_principal.add(lbl_imagenAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 500, 360));

        lbl_iconoBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_BUSCAR.png"))); // NOI18N
        pn_principal.add(lbl_iconoBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 200, -1, 60));

        btn_modificar.setBackground(new java.awt.Color(204, 0, 0));
        btn_modificar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("MODIFICAR");
        btn_modificar.setBorder(null);
        pn_principal.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 240, 40));

        btn_registrar.setBackground(new java.awt.Color(204, 0, 0));
        btn_registrar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("REGISTRAR");
        btn_registrar.setBorder(null);
        pn_principal.add(btn_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 240, 40));

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(null);
        pn_principal.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 240, 40));

        pn_toolbar.setBackground(new java.awt.Color(204, 51, 0));
        pn_toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ventana.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbl_ventana.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ventana.setText("Registro de alumnos");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 170, 40));

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
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JLabel btn_minimizar;
    public javax.swing.JButton btn_modificar;
    public javax.swing.JButton btn_registrar;
    public javax.swing.JLabel btn_regresar;
    public javax.swing.JScrollPane js_tablaAlumnos;
    public javax.swing.JLabel lbl_apellido;
    public javax.swing.JLabel lbl_codigo;
    public javax.swing.JLabel lbl_grado;
    public javax.swing.JLabel lbl_iconoBuscador;
    public javax.swing.JLabel lbl_imagenAlumnos;
    public javax.swing.JLabel lbl_nivel;
    public javax.swing.JLabel lbl_nombre;
    public javax.swing.JLabel lbl_seccion;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_contenedorFormulario;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    public javax.swing.JTable tbl_tablaAlumnos;
    public javax.swing.JTextField txf_apellido;
    public javax.swing.JTextField txf_buscador;
    public javax.swing.JTextField txf_codigo;
    public javax.swing.JTextField txf_grado;
    public javax.swing.JTextField txf_nivel;
    public javax.swing.JTextField txf_nombre;
    public javax.swing.JTextField txf_seccion;
    // End of variables declaration//GEN-END:variables
}
