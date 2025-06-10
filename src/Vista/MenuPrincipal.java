package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ButtonModel;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        personalizarBoton(btnSalir);
        personalizarBoton(btnRegistrarLibro);
        personalizarBoton(btnRegistrarAlumno);
        personalizarBoton(btnPrestamoLibro);
        personalizarBoton(btnDevolucionLibro);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarAlumno = new javax.swing.JButton();
        btnPrestamoLibro = new javax.swing.JButton();
        btnRegistrarLibro = new javax.swing.JButton();
        btnDevolucionLibro = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarAlumno.setBackground(new java.awt.Color(135, 25, 0));
        btnRegistrarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarAlumno.setText("Registrar Alumno");
        btnRegistrarAlumno.setBorder(null);
        btnRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlumnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 230, 50));

        btnPrestamoLibro.setBackground(new java.awt.Color(135, 25, 0));
        btnPrestamoLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrestamoLibro.setText("Prestamos de Libros");
        btnPrestamoLibro.setBorder(null);
        btnPrestamoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrestamoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 240, 50));

        btnRegistrarLibro.setBackground(new java.awt.Color(135, 25, 0));
        btnRegistrarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarLibro.setText("Registro de Libros");
        btnRegistrarLibro.setBorder(null);
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 230, 50));

        btnDevolucionLibro.setBackground(new java.awt.Color(135, 25, 0));
        btnDevolucionLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDevolucionLibro.setText("Devolucíon de Libros");
        btnDevolucionLibro.setBorder(null);
        btnDevolucionLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnDevolucionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 240, 50));

        btnSalir.setBackground(new java.awt.Color(135, 25, 0));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("Cerrar Sesion");
        btnSalir.setBorder(null);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 380, 240, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MENU");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/menu.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAlumnoActionPerformed

    }//GEN-LAST:event_btnRegistrarAlumnoActionPerformed

    private void btnPrestamoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrestamoLibroActionPerformed

    }//GEN-LAST:event_btnPrestamoLibroActionPerformed

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed

    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnDevolucionLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionLibroActionPerformed

    }//GEN-LAST:event_btnDevolucionLibroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDevolucionLibro;
    public javax.swing.JButton btnPrestamoLibro;
    public javax.swing.JButton btnRegistrarAlumno;
    public javax.swing.JButton btnRegistrarLibro;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
