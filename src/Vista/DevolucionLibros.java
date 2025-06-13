package Vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class DevolucionLibros extends javax.swing.JFrame {

    public DevolucionLibros() {
         setTitle("Devolucion de libros");
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO.png")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

        personalizarBoton(btnDevolverLibro);
        personalizarTextField(txtCodigoAlumnoBuscar);
        personalizarTabla(tblPrestamos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnDevolverLibro = new javax.swing.JButton();
        txtCodigoAlumnoBuscar = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Devolucion");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1280, 70));

        btnDevolverLibro.setBackground(new java.awt.Color(204, 0, 0));
        btnDevolverLibro.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnDevolverLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolverLibro.setText("DEVOLVER");
        btnDevolverLibro.setBorder(null);
        btnDevolverLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverLibroActionPerformed(evt);
            }
        });
        jPanel1.add(btnDevolverLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 160, 40));

        txtCodigoAlumnoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumnoBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigoAlumnoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 230, 40));

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_HOME.png"))); // NOI18N
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 880, 430));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_BUSCAR.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 140, -1, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_DEVOLUCION.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoAlumnoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumnoBuscarActionPerformed

    }//GEN-LAST:event_txtCodigoAlumnoBuscarActionPerformed

    private void btnDevolverLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverLibroActionPerformed

    }//GEN-LAST:event_btnDevolverLibroActionPerformed

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

    private void personalizarTextField(javax.swing.JTextField campo) {
        campo.setBackground(Color.WHITE);
        campo.setForeground(new Color(30, 30, 30));
        campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 51, 0)));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public volatile javax.swing.JButton btnDevolverLibro;
    public javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblPrestamos;
    public javax.swing.JTextField txtCodigoAlumnoBuscar;
    // End of variables declaration//GEN-END:variables
}
