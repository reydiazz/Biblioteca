package Vista;

import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
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
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();
        pn_contenedor = new javax.swing.JPanel();
        btn_devolucion = new javax.swing.JPanel();
        lbl_imagenDevolver = new javax.swing.JLabel();
        lbl_tituloDevolver = new javax.swing.JLabel();
        btn_prestamo = new javax.swing.JPanel();
        lbl_imagenPrestamo = new javax.swing.JLabel();
        lbl_tituloPrestamo = new javax.swing.JLabel();
        btn_libro = new javax.swing.JPanel();
        lbl_imagenLibro = new javax.swing.JLabel();
        lbl_tituloLibro = new javax.swing.JLabel();
        btn_alumnos = new javax.swing.JPanel();
        lbl_tituloAlumnos = new javax.swing.JLabel();
        lbl_imagenAlumnos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setForeground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setFont(new java.awt.Font("Segoe UI", 1, 78)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("MENU PRINCIPAL");
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1280, 100));

        pn_toolbar.setBackground(new java.awt.Color(204, 51, 0));
        pn_toolbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pn_toolbarMouseDragged(evt);
            }
        });
        pn_toolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pn_toolbarMousePressed(evt);
            }
        });
        pn_toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ventana.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbl_ventana.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ventana.setText("Menu principal");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_MINIMIZAR.png"))); // NOI18N
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });
        pn_toolbar.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 0, 40, 40));

        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_CERRAR.png"))); // NOI18N
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });
        pn_toolbar.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1235, 0, 40, 40));

        pn_principal.add(pn_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        pn_contenedor.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenedor.setForeground(new java.awt.Color(255, 255, 255));
        pn_contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_devolucion.setBackground(new java.awt.Color(204, 0, 0));
        btn_devolucion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagenDevolver.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_imagenDevolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_DEVOLVER.png"))); // NOI18N
        btn_devolucion.add(lbl_imagenDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        lbl_tituloDevolver.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lbl_tituloDevolver.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloDevolver.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tituloDevolver.setText("DEVOLVER");
        lbl_tituloDevolver.setToolTipText("");
        lbl_tituloDevolver.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_tituloDevolver.setIconTextGap(30);
        lbl_tituloDevolver.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_devolucion.add(lbl_tituloDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        pn_contenedor.add(btn_devolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 630, 80));

        btn_prestamo.setBackground(new java.awt.Color(204, 0, 0));
        btn_prestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagenPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_imagenPrestamo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LISTA.png"))); // NOI18N
        btn_prestamo.add(lbl_imagenPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        lbl_tituloPrestamo.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lbl_tituloPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tituloPrestamo.setText("PRESTAMO");
        lbl_tituloPrestamo.setToolTipText("");
        lbl_tituloPrestamo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_tituloPrestamo.setIconTextGap(30);
        lbl_tituloPrestamo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_prestamo.add(lbl_tituloPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        pn_contenedor.add(btn_prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 630, 80));

        btn_libro.setBackground(new java.awt.Color(204, 0, 0));
        btn_libro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_imagenLibro.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_imagenLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO_MENU.png"))); // NOI18N
        btn_libro.add(lbl_imagenLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        lbl_tituloLibro.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lbl_tituloLibro.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tituloLibro.setText("LIBROS");
        lbl_tituloLibro.setToolTipText("");
        lbl_tituloLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbl_tituloLibro.setIconTextGap(30);
        lbl_tituloLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_libro.add(lbl_tituloLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        pn_contenedor.add(btn_libro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 630, 80));

        btn_alumnos.setBackground(new java.awt.Color(204, 0, 0));
        btn_alumnos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tituloAlumnos.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        lbl_tituloAlumnos.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tituloAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tituloAlumnos.setText("ALUMNOS");
        lbl_tituloAlumnos.setToolTipText("");
        lbl_tituloAlumnos.setAlignmentY(0.0F);
        lbl_tituloAlumnos.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lbl_tituloAlumnos.setIconTextGap(100);
        btn_alumnos.add(lbl_tituloAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        lbl_imagenAlumnos.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_imagenAlumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_ESTUDIANTE.png"))); // NOI18N
        btn_alumnos.add(lbl_imagenAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        pn_contenedor.add(btn_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 630, 80));

        pn_principal.add(pn_contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 880, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 1278, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_principal, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked

    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void pn_toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_toolbarMouseDragged

    }//GEN-LAST:event_pn_toolbarMouseDragged

    private void pn_toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_toolbarMousePressed

    }//GEN-LAST:event_pn_toolbarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btn_alumnos;
    public javax.swing.JLabel btn_cerrar;
    public javax.swing.JPanel btn_devolucion;
    public javax.swing.JPanel btn_libro;
    public javax.swing.JLabel btn_minimizar;
    public javax.swing.JPanel btn_prestamo;
    public javax.swing.JLabel lbl_imagenAlumnos;
    public javax.swing.JLabel lbl_imagenDevolver;
    public javax.swing.JLabel lbl_imagenLibro;
    public javax.swing.JLabel lbl_imagenPrestamo;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JLabel lbl_tituloAlumnos;
    public javax.swing.JLabel lbl_tituloDevolver;
    public javax.swing.JLabel lbl_tituloLibro;
    public javax.swing.JLabel lbl_tituloPrestamo;
    public javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_contenedor;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    // End of variables declaration//GEN-END:variables
}
