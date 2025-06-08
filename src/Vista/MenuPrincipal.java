package Vista;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegistrarAlumno = new javax.swing.JButton();
        btnPrestamoLibro = new javax.swing.JButton();
        btnRegistrarLibro = new javax.swing.JButton();
        btnBuscarLibro = new javax.swing.JButton();
        btnDevolucionLibro = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        btnRegistrarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarAlumno.setText("Registrar Alumno");
        btnRegistrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAlumnoActionPerformed(evt);
            }
        });

        btnPrestamoLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPrestamoLibro.setText("Prestamos de Libros");
        btnPrestamoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrestamoLibroActionPerformed(evt);
            }
        });

        btnRegistrarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegistrarLibro.setText("Registro de Libros");
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });

        btnBuscarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarLibro.setText("Buscar Libros");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });

        btnDevolucionLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDevolucionLibro.setText("Devolucíon de Libros");
        btnDevolucionLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolucionLibroActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(341, 341, 341)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrestamoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDevolucionLibro)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(161, 161, 161))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addGap(114, 114, 114)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRegistrarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDevolucionLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(btnBuscarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnPrestamoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );

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

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed

    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnDevolucionLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolucionLibroActionPerformed

    }//GEN-LAST:event_btnDevolucionLibroActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarLibro;
    public javax.swing.JButton btnDevolucionLibro;
    public javax.swing.JButton btnPrestamoLibro;
    public javax.swing.JButton btnRegistrarAlumno;
    public javax.swing.JButton btnRegistrarLibro;
    public javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
