package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class PrestamosLibros extends javax.swing.JFrame {
    
    int xMouse;
    int yMouse;

    public PrestamosLibros() {
        setUndecorated(true);
        setTitle("Prestamo de libros");
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO.png")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        personalizarBoton(btnPrestamoLibro);
        personalizarTextField(txtCodigoAlumnoBuscar);
        personalizarTextField(txtCodigoLibroPrestamo);
        personalizarTextField(txtCodigoAlumnoPrestamo);
        personalizarTextField(txtFechaDevolucion);
        personalizarTabla(tblPrestamos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigoAlumnoBuscar = new javax.swing.JTextField();
        btnPrestamoLibro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoLibroPrestamo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtFechaDevolucion = new javax.swing.JTextField();
        txtCodigoAlumnoPrestamo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoAlumnoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumnoBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoAlumnoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 210, 240, 40));

        btnPrestamoLibro.setBackground(new java.awt.Color(204, 0, 0));
        btnPrestamoLibro.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnPrestamoLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamoLibro.setText("PRESTAMO");
        btnPrestamoLibro.setBorder(null);
        btnPrestamoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrestamoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, 240, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Prestamo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1280, 70));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_HOME.png"))); // NOI18N
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblPrestamos);
        if (tblPrestamos.getColumnModel().getColumnCount() > 0) {
            tblPrestamos.getColumnModel().getColumn(0).setResizable(false);
            tblPrestamos.getColumnModel().getColumn(1).setResizable(false);
            tblPrestamos.getColumnModel().getColumn(2).setResizable(false);
            tblPrestamos.getColumnModel().getColumn(3).setResizable(false);
            tblPrestamos.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 880, 430));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_BUSCAR.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 190, -1, 60));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo del libro");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, -1, -1));

        txtCodigoLibroPrestamo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCodigoLibroPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroPrestamoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigoLibroPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 240, 40));

        jLabel5.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Codigo del alumno");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha devolucion");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        txtFechaDevolucion.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtFechaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaDevolucionActionPerformed(evt);
            }
        });
        jPanel2.add(txtFechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 240, 40));

        txtCodigoAlumnoPrestamo.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        txtCodigoAlumnoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumnoPrestamoActionPerformed(evt);
            }
        });
        jPanel2.add(txtCodigoAlumnoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 240, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 240, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMGEN_PRESTAMO.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 530, 320));

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
        lbl_ventana.setText("Prestamo de libros");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 160, 40));

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

        jPanel1.add(pn_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrestamoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoLibroActionPerformed

    }//GEN-LAST:event_btnPrestamoLibroActionPerformed

    private void txtCodigoAlumnoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumnoBuscarActionPerformed

    }//GEN-LAST:event_txtCodigoAlumnoBuscarActionPerformed

    private void txtCodigoLibroPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroPrestamoActionPerformed

    }//GEN-LAST:event_txtCodigoLibroPrestamoActionPerformed

    private void txtFechaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaDevolucionActionPerformed

    }//GEN-LAST:event_txtFechaDevolucionActionPerformed

    private void txtCodigoAlumnoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumnoPrestamoActionPerformed

    }//GEN-LAST:event_txtCodigoAlumnoPrestamoActionPerformed

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked

    }//GEN-LAST:event_btn_cerrarMouseClicked

    private void pn_toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_toolbarMouseDragged
        // Obtenemos las coordenadas actuales del raton en la pantalla.
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        // Calculamos la nueva posición del JFrame restando la posición inicial del mouse.
        int deltaX = x - xMouse;
        int deltaY = y - yMouse;
        // Movemos el JFrame a la nueva posición.
        setLocation(getX() + deltaX, getY() + deltaY);
        // Actualizamos las coordenadas del mouse para el siguiente movimiento.
        xMouse = x;
        yMouse = y;
    }//GEN-LAST:event_pn_toolbarMouseDragged

    private void pn_toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_toolbarMousePressed

        xMouse = evt.getXOnScreen();
        yMouse = evt.getYOnScreen();
    }//GEN-LAST:event_pn_toolbarMousePressed

    private void personalizarTabla(JTable tbl) {
        tbl.setBackground(Color.white); // lavanda clara
        tbl.setSelectionBackground(new Color(234, 229, 228)); // azul claro

        tbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tbl.setRowHeight(25);
        tbl.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tbl.getTableHeader().setBackground(new Color(204, 0, 0)); // índigo oscuro
        tbl.getTableHeader().setForeground(Color.WHITE);
        tbl.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tbl.getColumnCount(); i++) {
            tbl.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        tbl.setAutoCreateRowSorter(true);

        tbl.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (!isSelected) {
                    if (row % 2 == 0) {
                        c.setBackground(new Color(122, 22, 0)); // gris muy claro
                    } else {
                        c.setBackground(Color.WHITE);
                    }
                } else {
                    c.setBackground(table.getSelectionBackground());
                    c.setForeground(table.getSelectionForeground());
                }
                return c;
            }
        });
    }

    private void personalizarBoton(javax.swing.JButton boton) {
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(true);
        boton.setBackground(new Color(204, 51, 0));
        boton.setForeground(Color.WHITE);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));

        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(255, 51, 0));
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(new Color(204, 51, 0));
            }
        });

        boton.getModel().addChangeListener(e -> {
            ButtonModel model = boton.getModel();
            if (model.isPressed()) {
                boton.setBackground(new Color(204, 51, 0));
            } else if (model.isRollover()) {
                boton.setBackground(new Color(255, 51, 0));
            } else {
                boton.setBackground(new Color(204, 51, 0));
            }
        });
    }

    private void personalizarTextField(javax.swing.JTextField campo) {
        campo.setBackground(Color.WHITE);
        campo.setForeground(new Color(30, 30, 30));
        campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 51, 0)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPrestamoLibro;
    public javax.swing.JLabel btnRegresar;
    public javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_toolbar;
    public javax.swing.JTable tblPrestamos;
    public javax.swing.JTextField txtCodigoAlumnoBuscar;
    public javax.swing.JTextField txtCodigoAlumnoPrestamo;
    public javax.swing.JTextField txtCodigoLibroPrestamo;
    public javax.swing.JTextField txtFechaDevolucion;
    // End of variables declaration//GEN-END:variables
}
