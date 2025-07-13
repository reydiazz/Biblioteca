package Vista;

import javax.swing.ImageIcon;

public class RegistroLibros extends javax.swing.JFrame {

    public RegistroLibros() {
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
        btn_eliminar = new javax.swing.JButton();
        lbl_titulo = new javax.swing.JLabel();
        pn_formulario = new javax.swing.JPanel();
        lbl_codigo = new javax.swing.JLabel();
        lbl_tituloLibro = new javax.swing.JLabel();
        lbl_autor = new javax.swing.JLabel();
        lbl_genero = new javax.swing.JLabel();
        lbl_copias = new javax.swing.JLabel();
        lbl_edicion = new javax.swing.JLabel();
        txf_codigo = new javax.swing.JTextField();
        txf_tituloLibro = new javax.swing.JTextField();
        txf_autor = new javax.swing.JTextField();
        txf_genero = new javax.swing.JTextField();
        txf_copias = new javax.swing.JTextField();
        txf_edicion = new javax.swing.JTextField();
        btn_agregar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_regresar = new javax.swing.JLabel();
        js_tablaLibro = new javax.swing.JScrollPane();
        tbl_tablaLibro = new javax.swing.JTable();
        txf_buscar = new javax.swing.JTextField();
        lbl_iconoBuscador = new javax.swing.JLabel();
        lbl_imagenLibro = new javax.swing.JLabel();
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.setBorder(null);
        pn_principal.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 240, 40));

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("LIBROS");
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1280, 100));

        pn_formulario.setBackground(new java.awt.Color(255, 255, 255));
        pn_formulario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_codigo.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_codigo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_codigo.setText("Codigo del libro");
        pn_formulario.add(lbl_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        lbl_tituloLibro.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_tituloLibro.setForeground(new java.awt.Color(0, 0, 0));
        lbl_tituloLibro.setText("Titulo");
        pn_formulario.add(lbl_tituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        lbl_autor.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_autor.setForeground(new java.awt.Color(0, 0, 0));
        lbl_autor.setText("Autor");
        pn_formulario.add(lbl_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        lbl_genero.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_genero.setForeground(new java.awt.Color(0, 0, 0));
        lbl_genero.setText("Genero");
        pn_formulario.add(lbl_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, -1, -1));

        lbl_copias.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_copias.setForeground(new java.awt.Color(0, 0, 0));
        lbl_copias.setText("Numero de copias");
        pn_formulario.add(lbl_copias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, -1, -1));

        lbl_edicion.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        lbl_edicion.setForeground(new java.awt.Color(0, 0, 0));
        lbl_edicion.setText("Edicion");
        pn_formulario.add(lbl_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, -1, -1));

        txf_codigo.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pn_formulario.add(txf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 40));

        txf_tituloLibro.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pn_formulario.add(txf_tituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 240, 40));

        txf_autor.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pn_formulario.add(txf_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 40));

        txf_genero.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pn_formulario.add(txf_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 40));

        txf_copias.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pn_formulario.add(txf_copias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 240, 40));

        txf_edicion.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pn_formulario.add(txf_edicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 240, 40));

        pn_principal.add(pn_formulario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 240, 490));

        btn_agregar.setBackground(new java.awt.Color(204, 0, 0));
        btn_agregar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("AGREGAR");
        btn_agregar.setBorder(null);
        pn_principal.add(btn_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 670, 240, 40));

        btn_modificar.setBackground(new java.awt.Color(204, 0, 0));
        btn_modificar.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_modificar.setForeground(new java.awt.Color(255, 255, 255));
        btn_modificar.setText("MODIFICAR");
        btn_modificar.setBorder(null);
        pn_principal.add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 670, 240, 40));

        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_HOME.png"))); // NOI18N
        pn_principal.add(btn_regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        tbl_tablaLibro.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Titulo", "Autor", "Genero", "Copias", "Edicion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        js_tablaLibro.setViewportView(tbl_tablaLibro);

        pn_principal.add(js_tablaLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 840, 390));

        txf_buscar.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        pn_principal.add(txf_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 200, 230, 40));

        lbl_iconoBuscador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_BUSCAR.png"))); // NOI18N
        pn_principal.add(lbl_iconoBuscador, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 180, -1, 60));

        lbl_imagenLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_ESTANTERIA.png"))); // NOI18N
        lbl_imagenLibro.setText("jLabel2");
        pn_principal.add(lbl_imagenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 520, 430));

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
    public javax.swing.JButton btn_agregar;
    public javax.swing.JLabel btn_cerrar;
    public javax.swing.JButton btn_eliminar;
    public javax.swing.JLabel btn_minimizar;
    public javax.swing.JButton btn_modificar;
    public javax.swing.JLabel btn_regresar;
    public javax.swing.JScrollPane js_tablaLibro;
    public javax.swing.JLabel lbl_autor;
    public javax.swing.JLabel lbl_codigo;
    public javax.swing.JLabel lbl_copias;
    public javax.swing.JLabel lbl_edicion;
    public javax.swing.JLabel lbl_genero;
    public javax.swing.JLabel lbl_iconoBuscador;
    public javax.swing.JLabel lbl_imagenLibro;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JLabel lbl_tituloLibro;
    public javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_formulario;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    public javax.swing.JTable tbl_tablaLibro;
    public javax.swing.JTextField txf_autor;
    public javax.swing.JTextField txf_buscar;
    public javax.swing.JTextField txf_codigo;
    public javax.swing.JTextField txf_copias;
    public javax.swing.JTextField txf_edicion;
    public javax.swing.JTextField txf_genero;
    public javax.swing.JTextField txf_tituloLibro;
    // End of variables declaration//GEN-END:variables
}
