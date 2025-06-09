package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ButtonModel;

public class PrestamosLibros extends javax.swing.JFrame {

    public PrestamosLibros() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        personalizarBoton(btnRegresar1);
        personalizarBoton(btnBuscarPrestamo);
        personalizarBoton(btnPrestamoLibro);
        personalizarTextField(txtFechaPrestamo);
        personalizarTextField(txtCodigoAlumnoBuscar);
        personalizarTextField(txtCodigoLibroPrestamo);
        personalizarTextField(txtCodigoAlumnoPrestamo);
        personalizarTextField(txtDiasRestantes);
        personalizarTextField(txtFechaDevolucion);
        personalizarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCodigoLibroPrestamo = new javax.swing.JTextField();
        txtCodigoAlumnoPrestamo = new javax.swing.JTextField();
        txtFechaDevolucion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDiasRestantes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFechaPrestamo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnPrestamoLibro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCodigoAlumnoBuscar = new javax.swing.JTextField();
        btnBuscarPrestamo = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnRegresar1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigoLibroPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoLibroPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 161, 221, -1));

        txtCodigoAlumnoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumnoPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoAlumnoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 207, 221, -1));

        txtFechaDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaDevolucionActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 295, 221, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA PRESTAMO");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 247, -1, -1));

        txtDiasRestantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiasRestantesActionPerformed(evt);
            }
        });
        getContentPane().add(txtDiasRestantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 339, 221, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CODIGO DEL LIBRO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 161, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("FECHA DEVOLUCION");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 291, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Libros Prestados");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 237, -1, -1));

        txtFechaPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(txtFechaPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 251, 221, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DIAS RESTANTES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 335, -1, -1));

        btnPrestamoLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrestamoLibro.setText("Prestamo");
        btnPrestamoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnPrestamoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 379, 154, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prestamos de Libros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 22, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("CODIGO DEL ALUMNO");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 203, -1, -1));

        txtCodigoAlumnoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumnoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoAlumnoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 169, 190, -1));

        btnBuscarPrestamo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarPrestamo.setText("Buscar");
        btnBuscarPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPrestamoActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(776, 161, 154, 33));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CODIGO DEL ALUMNO");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 130, -1, -1));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 280, 286, -1));

        btnRegresar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar1.setText("Regresar");
        btnRegresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(841, 22, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/todos.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoLibroPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroPrestamoActionPerformed

    }//GEN-LAST:event_txtCodigoLibroPrestamoActionPerformed

    private void txtCodigoAlumnoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumnoPrestamoActionPerformed

    }//GEN-LAST:event_txtCodigoAlumnoPrestamoActionPerformed

    private void txtFechaDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaDevolucionActionPerformed

    }//GEN-LAST:event_txtFechaDevolucionActionPerformed

    private void txtDiasRestantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiasRestantesActionPerformed

    }//GEN-LAST:event_txtDiasRestantesActionPerformed

    private void txtFechaPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaPrestamoActionPerformed

    }//GEN-LAST:event_txtFechaPrestamoActionPerformed

    private void btnPrestamoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoLibroActionPerformed

    }//GEN-LAST:event_btnPrestamoLibroActionPerformed

    private void txtCodigoAlumnoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumnoBuscarActionPerformed

    }//GEN-LAST:event_txtCodigoAlumnoBuscarActionPerformed

    private void btnBuscarPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPrestamoActionPerformed

    }//GEN-LAST:event_btnBuscarPrestamoActionPerformed

    private void btnRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresar1ActionPerformed

    }//GEN-LAST:event_btnRegresar1ActionPerformed

    private void personalizarBoton(javax.swing.JButton boton) {
        boton.setFocusPainted(false);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setOpaque(true);
        boton.setBackground(new Color(204, 51, 0));
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
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
        campo.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        campo.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                javax.swing.BorderFactory.createLineBorder(new Color(204, 51, 0), 1),
                javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 8) // padding interno
        ));

        // Evento para resaltar al enfocar
        campo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campo.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createLineBorder(new Color(204, 51, 0), 2),
                        javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 8)
                ));
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                campo.setBorder(javax.swing.BorderFactory.createCompoundBorder(
                        javax.swing.BorderFactory.createLineBorder(new Color(204, 51, 0), 1),
                        javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 8)
                ));
            }
        });
    }

    private void personalizarLista() {
        jList1.setFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 14));
        jList1.setBackground(new java.awt.Color(245, 245, 245));
        jList1.setSelectionBackground(new java.awt.Color(210, 83, 24));
        jList1.setSelectionForeground(Color.WHITE);
        jList1.setFixedCellHeight(30);
        jList1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 200, 200)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarPrestamo;
    public javax.swing.JButton btnPrestamoLibro;
    public javax.swing.JButton btnRegresar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtCodigoAlumnoBuscar;
    public javax.swing.JTextField txtCodigoAlumnoPrestamo;
    public javax.swing.JTextField txtCodigoLibroPrestamo;
    public javax.swing.JTextField txtDiasRestantes;
    public javax.swing.JTextField txtFechaDevolucion;
    public javax.swing.JTextField txtFechaPrestamo;
    // End of variables declaration//GEN-END:variables
}
