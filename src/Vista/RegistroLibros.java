package Vista;

public class RegistroLibros extends javax.swing.JFrame {

    public RegistroLibros() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoLibroEliminado = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnEliminarLibro = new javax.swing.JButton();
        txtEdicion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        txtGenero = new javax.swing.JTextField();
        txtCodigoLibro = new javax.swing.JTextField();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnAgregarLibro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setText("Registro de Libros");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Agregar Libros");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("TITULO");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("NUMERO DE COPIAS");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("EDICION");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("GENERO");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("CODIGO DEL LIBRO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("CODIGO DEL LIBRO");

        txtCodigoLibroEliminado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroEliminadoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("AUTOR");

        btnEliminarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarLibro.setText("Eliminar Libro");
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });

        txtEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdicionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Eliminar Libros");

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        txtCodigoLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroActionPerformed(evt);
            }
        });

        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });

        txtAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAutorActionPerformed(evt);
            }
        });

        txtStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockActionPerformed(evt);
            }
        });

        btnAgregarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarLibro.setText("Agregar");
        btnAgregarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarLibroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel9))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jLabel6)
                                .addComponent(jLabel8)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtStock, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                                .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGenero, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCodigoLibro, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEdicion, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigoLibroEliminado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel2))
                                .addGap(30, 30, 30))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)))
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(txtCodigoLibroEliminado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9)
                        .addGap(62, 62, 62)
                        .addComponent(txtCodigoLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEdicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnAgregarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoLibroEliminadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroEliminadoActionPerformed

    }//GEN-LAST:event_txtCodigoLibroEliminadoActionPerformed

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed

    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void txtEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdicionActionPerformed

    }//GEN-LAST:event_txtEdicionActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed

    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtCodigoLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroActionPerformed

    }//GEN-LAST:event_txtCodigoLibroActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed

    }//GEN-LAST:event_txtTituloActionPerformed

    private void txtAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAutorActionPerformed

    }//GEN-LAST:event_txtAutorActionPerformed

    private void txtStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockActionPerformed

    }//GEN-LAST:event_txtStockActionPerformed

    private void btnAgregarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarLibroActionPerformed

    }//GEN-LAST:event_btnAgregarLibroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregarLibro;
    public javax.swing.JButton btnEliminarLibro;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txtAutor;
    public javax.swing.JTextField txtCodigoLibro;
    public javax.swing.JTextField txtCodigoLibroEliminado;
    public javax.swing.JTextField txtEdicion;
    public javax.swing.JTextField txtGenero;
    public javax.swing.JTextField txtStock;
    public javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
