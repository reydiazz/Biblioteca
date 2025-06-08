package Vista;

public class BuscarLibros extends javax.swing.JFrame {

    public BuscarLibros() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        txtCodigoLibroBuscar = new javax.swing.JTextField();
        btnBuscarLibro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setText("Buscar Libros");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Libros");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Titulo", "Edicion", "Genero", "Autor", "Nº de Copias"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 490, 280));

        txtCodigoLibroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoLibroBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, 222, -1));

        btnBuscarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel2.setText("Busqueda");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("CODIGO DEL LIBRO");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 20, 120, 33));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(763, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoLibroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroBuscarActionPerformed

    }//GEN-LAST:event_txtCodigoLibroBuscarActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed

    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarLibro;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblLibros;
    public javax.swing.JTextField txtCodigoLibroBuscar;
    // End of variables declaration//GEN-END:variables
}
