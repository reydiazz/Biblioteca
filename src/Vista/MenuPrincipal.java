package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;

public class MenuPrincipal extends javax.swing.JFrame {

    public MenuPrincipal() {
        setTitle("Menu");
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO.png")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRegistrarAlumn = new javax.swing.JPanel();
        btnRegistrarAlumno = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnRegistrarLibr = new javax.swing.JPanel();
        btnRegistrarLibro = new javax.swing.JLabel();
        btnPrestamoLibr = new javax.swing.JPanel();
        btnPrestamoLibro = new javax.swing.JLabel();
        btnDevolucionLibr = new javax.swing.JPanel();
        btnDevolucionLibro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu principal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1280, 70));

        btnRegistrarAlumn.setBackground(new java.awt.Color(204, 0, 0));

        btnRegistrarAlumno.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        btnRegistrarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAlumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_ESTUDIANTE.png"))); // NOI18N
        btnRegistrarAlumno.setText("ALUMNOS");
        btnRegistrarAlumno.setToolTipText("");
        btnRegistrarAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarAlumno.setIconTextGap(30);
        btnRegistrarAlumno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btnRegistrarAlumnLayout = new javax.swing.GroupLayout(btnRegistrarAlumn);
        btnRegistrarAlumn.setLayout(btnRegistrarAlumnLayout);
        btnRegistrarAlumnLayout.setHorizontalGroup(
            btnRegistrarAlumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarAlumnLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnRegistrarAlumno)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnRegistrarAlumnLayout.setVerticalGroup(
            btnRegistrarAlumnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegistrarAlumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 250, 270));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_CERRAR_SESION.png"))); // NOI18N
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 620, -1, -1));

        btnRegistrarLibr.setBackground(new java.awt.Color(204, 0, 0));

        btnRegistrarLibro.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        btnRegistrarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO_MENU.png"))); // NOI18N
        btnRegistrarLibro.setText("LIBROS");
        btnRegistrarLibro.setToolTipText("");
        btnRegistrarLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarLibro.setIconTextGap(30);
        btnRegistrarLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btnRegistrarLibrLayout = new javax.swing.GroupLayout(btnRegistrarLibr);
        btnRegistrarLibr.setLayout(btnRegistrarLibrLayout);
        btnRegistrarLibrLayout.setHorizontalGroup(
            btnRegistrarLibrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarLibrLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnRegistrarLibro)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        btnRegistrarLibrLayout.setVerticalGroup(
            btnRegistrarLibrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegistrarLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        jPanel1.add(btnRegistrarLibr, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 250, -1));

        btnPrestamoLibr.setBackground(new java.awt.Color(204, 0, 0));

        btnPrestamoLibro.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        btnPrestamoLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamoLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LISTA.png"))); // NOI18N
        btnPrestamoLibro.setText("PRESTAMO");
        btnPrestamoLibro.setToolTipText("");
        btnPrestamoLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrestamoLibro.setIconTextGap(30);
        btnPrestamoLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btnPrestamoLibrLayout = new javax.swing.GroupLayout(btnPrestamoLibr);
        btnPrestamoLibr.setLayout(btnPrestamoLibrLayout);
        btnPrestamoLibrLayout.setHorizontalGroup(
            btnPrestamoLibrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnPrestamoLibrLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPrestamoLibro)
                .addGap(15, 15, 15))
        );
        btnPrestamoLibrLayout.setVerticalGroup(
            btnPrestamoLibrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnPrestamoLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        jPanel1.add(btnPrestamoLibr, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 250, -1));

        btnDevolucionLibr.setBackground(new java.awt.Color(204, 0, 0));

        btnDevolucionLibro.setFont(new java.awt.Font("Montserrat", 0, 36)); // NOI18N
        btnDevolucionLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolucionLibro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_DEVOLVER.png"))); // NOI18N
        btnDevolucionLibro.setText("DEVOLVER");
        btnDevolucionLibro.setToolTipText("");
        btnDevolucionLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDevolucionLibro.setIconTextGap(30);
        btnDevolucionLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout btnDevolucionLibrLayout = new javax.swing.GroupLayout(btnDevolucionLibr);
        btnDevolucionLibr.setLayout(btnDevolucionLibrLayout);
        btnDevolucionLibrLayout.setHorizontalGroup(
            btnDevolucionLibrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnDevolucionLibrLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(btnDevolucionLibro)
                .addGap(16, 16, 16))
        );
        btnDevolucionLibrLayout.setVerticalGroup(
            btnDevolucionLibrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnDevolucionLibro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );

        jPanel1.add(btnDevolucionLibr, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 220, 250, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1276, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JPanel btnDevolucionLibr;
    public javax.swing.JLabel btnDevolucionLibro;
    private javax.swing.JPanel btnPrestamoLibr;
    public javax.swing.JLabel btnPrestamoLibro;
    private javax.swing.JPanel btnRegistrarAlumn;
    public javax.swing.JLabel btnRegistrarAlumno;
    private javax.swing.JPanel btnRegistrarLibr;
    public javax.swing.JLabel btnRegistrarLibro;
    public javax.swing.JLabel btnSalir;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
