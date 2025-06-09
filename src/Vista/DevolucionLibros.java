package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ButtonModel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class DevolucionLibros extends javax.swing.JFrame {

    public DevolucionLibros() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        personalizarBoton(btnRegresar);
        personalizarBoton(btnBuscarDevolucion);
        personalizarBoton(btnDevolverLibro);
        personalizarTextField(txtCodigoAlumnoBuscar);
        personalizarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLibros = new javax.swing.JTable();
        txtCodigoAlumnoBuscar = new javax.swing.JTextField();
        btnBuscarDevolucion = new javax.swing.JButton();
        btnDevolverLibro = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CODIGO DEL ALUMNO");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 149, -1, -1));

        btnRegresar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 22, 120, 33));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Devolucion de Libros");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 22, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Libros Prestados");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 216, -1, -1));

        tblLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CodigoAlumno", "CodigoLibro", "FechaPrestamo", "FechaDevolucion"
            }
        ));
        jScrollPane1.setViewportView(tblLibros);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 270, 528, 282));

        txtCodigoAlumnoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumnoBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoAlumnoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 153, 230, -1));

        btnBuscarDevolucion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarDevolucion.setText("Buscar");
        btnBuscarDevolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDevolucionActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscarDevolucion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 180, 50));

        btnDevolverLibro.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDevolverLibro.setText("Devolver");
        btnDevolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverLibroActionPerformed(evt);
            }
        });
        getContentPane().add(btnDevolverLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 389, 120, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/todos.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtCodigoAlumnoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumnoBuscarActionPerformed

    }//GEN-LAST:event_txtCodigoAlumnoBuscarActionPerformed

    private void btnBuscarDevolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDevolucionActionPerformed

    }//GEN-LAST:event_btnBuscarDevolucionActionPerformed

    private void btnDevolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverLibroActionPerformed

    }//GEN-LAST:event_btnDevolverLibroActionPerformed

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
                javax.swing.BorderFactory.createEmptyBorder(5, 8, 5, 8)
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
        tblLibros.setBackground(new Color(245, 173, 156));
        tblLibros.setSelectionBackground(new Color(232, 148, 129));

        tblLibros.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tblLibros.setRowHeight(25);
        tblLibros.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tblLibros.getTableHeader().setBackground(new Color(135, 25, 0));
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
                        c.setBackground(new Color(122, 22, 0));
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
    public javax.swing.JButton btnBuscarDevolucion;
    public volatile javax.swing.JButton btnDevolverLibro;
    public javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblLibros;
    public javax.swing.JTextField txtCodigoAlumnoBuscar;
    // End of variables declaration//GEN-END:variables
}
