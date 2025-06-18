package Vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MenuPrincipal extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public MenuPrincipal() {
        setUndecorated(true);
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
        jLabel2 = new javax.swing.JLabel();
        btnRegistrarLibr = new javax.swing.JPanel();
        btnRegistrarLibro = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPrestamoLibr = new javax.swing.JPanel();
        btnPrestamoLibro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnDevolucionLibr = new javax.swing.JPanel();
        btnDevolucionLibro = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Menu principal");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1280, 80));

        btnRegistrarAlumn.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarAlumn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarAlumno.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        btnRegistrarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarAlumno.setText("ALUMNOS");
        btnRegistrarAlumno.setToolTipText("");
        btnRegistrarAlumno.setAlignmentY(0.0F);
        btnRegistrarAlumno.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistrarAlumno.setIconTextGap(100);
        btnRegistrarAlumn.add(btnRegistrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_ESTUDIANTE.png"))); // NOI18N
        btnRegistrarAlumn.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        jPanel1.add(btnRegistrarAlumn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 630, 80));

        btnRegistrarLibr.setBackground(new java.awt.Color(204, 0, 0));
        btnRegistrarLibr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarLibro.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        btnRegistrarLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistrarLibro.setText("LIBROS");
        btnRegistrarLibro.setToolTipText("");
        btnRegistrarLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarLibro.setIconTextGap(30);
        btnRegistrarLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarLibr.add(btnRegistrarLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO_MENU.png"))); // NOI18N
        btnRegistrarLibr.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        jPanel1.add(btnRegistrarLibr, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 630, 80));

        btnPrestamoLibr.setBackground(new java.awt.Color(204, 0, 0));
        btnPrestamoLibr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrestamoLibro.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        btnPrestamoLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnPrestamoLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnPrestamoLibro.setText("PRESTAMO");
        btnPrestamoLibro.setToolTipText("");
        btnPrestamoLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPrestamoLibro.setIconTextGap(30);
        btnPrestamoLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPrestamoLibr.add(btnPrestamoLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LISTA.png"))); // NOI18N
        btnPrestamoLibr.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        jPanel1.add(btnPrestamoLibr, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 630, 80));

        btnDevolucionLibr.setBackground(new java.awt.Color(204, 0, 0));
        btnDevolucionLibr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDevolucionLibro.setFont(new java.awt.Font("Montserrat", 0, 48)); // NOI18N
        btnDevolucionLibro.setForeground(new java.awt.Color(255, 255, 255));
        btnDevolucionLibro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnDevolucionLibro.setText("DEVOLVER");
        btnDevolucionLibro.setToolTipText("");
        btnDevolucionLibro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDevolucionLibro.setIconTextGap(30);
        btnDevolucionLibro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDevolucionLibr.add(btnDevolucionLibro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 450, 80));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_DEVOLVER.png"))); // NOI18N
        btnDevolucionLibr.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        jPanel1.add(btnDevolucionLibr, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 500, 630, 80));

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
        lbl_ventana.setText("Menu principal");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 40));

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
    public javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_toolbar;
    // End of variables declaration//GEN-END:variables
}
