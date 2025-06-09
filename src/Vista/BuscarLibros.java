package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ButtonModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class BuscarLibros extends javax.swing.JFrame {

    public BuscarLibros() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        personalizarBoton(btnRegresar);
        personalizarBoton(btnBuscarLibro);
        personalizarTextField(txtCodigoLibroBuscar);
        personalizarTabla();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
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
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BUSCAR LIBROS");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setText("Libros");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
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
                "Codigo", "Titulo", "Edicion", "Genero", "Autor", "Nº de Copias"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLibros);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 490, 280));

        txtCodigoLibroBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoLibroBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoLibroBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, 230, 30));

        btnBuscarLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarLibro.setText("Buscar");
        btnBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 180, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BUSQUEDA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Codigo libro");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 120, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/menu.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoLibroBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoLibroBuscarActionPerformed

    }//GEN-LAST:event_txtCodigoLibroBuscarActionPerformed

    private void btnBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarLibroActionPerformed

    }//GEN-LAST:event_btnBuscarLibroActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed

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

    private void personalizarTabla() {
        tblLibros.setBackground(new Color(245, 173, 156)); // lavanda clara
        tblLibros.setSelectionBackground(new Color(232, 148, 129)); // azul claro

        tblLibros.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tblLibros.setRowHeight(25);
        tblLibros.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblLibros.getTableHeader().setBackground(new Color(135, 25, 0)); // índigo oscuro
        tblLibros.getTableHeader().setForeground(Color.WHITE);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tblLibros.getColumnCount(); i++) {
            tblLibros.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        tblLibros.setAutoCreateRowSorter(true);

        tblLibros.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBuscarLibro;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    public javax.swing.JTable tblLibros;
    public javax.swing.JTextField txtCodigoLibroBuscar;
    // End of variables declaration//GEN-END:variables
}
