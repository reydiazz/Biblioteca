package Vista;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    int xMouse;
    int yMouse;

    public Login() {
        setUndecorated(true);
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO.png")).getImage());
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        personalizarBoton(btnAcceder);
        personalizarTextField(txtUsuario);
        personalizarTextField(txtContraseña);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        pn_principal = new javax.swing.JPanel();
        pn_contenido = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        lblContraseña = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        lbl_libros = new javax.swing.JLabel();
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();
        btn_minimizar = new javax.swing.JLabel();
        btn_cerrar = new javax.swing.JLabel();
        lbl_titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setForeground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_contenido.setBackground(new java.awt.Color(255, 255, 255));
        pn_contenido.setForeground(new java.awt.Color(255, 255, 255));
        pn_contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        pn_contenido.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 210, 30));

        lblContraseña.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblContraseña.setForeground(new java.awt.Color(0, 0, 0));
        lblContraseña.setText("Contraseña");
        pn_contenido.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));

        lblUsuario.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setText("Usuario");
        pn_contenido.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        txtContraseña.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        pn_contenido.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 30));

        btnAcceder.setBackground(new java.awt.Color(204, 0, 0));
        btnAcceder.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("ACCEDER");
        btnAcceder.setBorder(null);
        btnAcceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAccederMouseExited(evt);
            }
        });
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        pn_contenido.add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 150, 40));

        lbl_libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_LIBROS.png"))); // NOI18N
        pn_contenido.add(lbl_libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 300, 330));

        pn_principal.add(pn_contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 380));

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
        lbl_ventana.setText("Bienvenido");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_MINIMIZAR.png"))); // NOI18N
        btn_minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_minimizarMouseClicked(evt);
            }
        });
        pn_toolbar.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 40, 40));

        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_CERRAR.png"))); // NOI18N
        btn_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cerrarMouseClicked(evt);
            }
        });
        pn_toolbar.add(btn_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 40, 40));

        pn_principal.add(pn_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 40));

        lbl_titulo.setFont(new java.awt.Font("Montserrat", 1, 30)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(204, 0, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("Iniciar Sesion");
        lbl_titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 300, 60));

        getContentPane().add(pn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed

    }//GEN-LAST:event_btnAccederActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void btnAccederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAccederMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccederMouseExited

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

    private void btn_minimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizarMouseClicked
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_minimizarMouseClicked

    private void btn_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_cerrarMouseClicked

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

    private void personalizarTextField(javax.swing.JTextField campo) {
        campo.setBackground(Color.WHITE);
        campo.setForeground(new Color(30, 30, 30));
        campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 51, 0)));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAcceder;
    private javax.swing.JLabel btn_cerrar;
    private javax.swing.JLabel btn_minimizar;
    private javax.swing.Box.Filler filler1;
    public javax.swing.JLabel lblContraseña;
    public javax.swing.JLabel lblUsuario;
    public javax.swing.JLabel lbl_libros;
    public javax.swing.JLabel lbl_titulo;
    private javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_contenido;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
