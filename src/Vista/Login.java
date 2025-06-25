package Vista;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Login extends JFrame {

    public Login() {
        setUndecorated(true);
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_LIBRO.png")).getImage());
        setLocationRelativeTo(null);
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principal = new javax.swing.JPanel();
        pn_contenido = new javax.swing.JPanel();
        txf_usuario = new javax.swing.JTextField();
        lbl_contraseña = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        txf_contraseña = new javax.swing.JPasswordField();
        btn_acceder = new javax.swing.JButton();
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

        txf_usuario.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        pn_contenido.add(txf_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 210, 30));

        lbl_contraseña.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lbl_contraseña.setForeground(new java.awt.Color(0, 0, 0));
        lbl_contraseña.setText("Contraseña");
        pn_contenido.add(lbl_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 30));

        lbl_usuario.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lbl_usuario.setForeground(new java.awt.Color(0, 0, 0));
        lbl_usuario.setText("Usuario");
        pn_contenido.add(lbl_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, 30));

        txf_contraseña.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        pn_contenido.add(txf_contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 30));

        btn_acceder.setBackground(new java.awt.Color(204, 0, 0));
        btn_acceder.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_acceder.setForeground(new java.awt.Color(255, 255, 255));
        btn_acceder.setText("ACCEDER");
        btn_acceder.setBorder(null);
        pn_contenido.add(btn_acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 150, 40));

        lbl_libros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/IMAGEN_LIBROS.png"))); // NOI18N
        pn_contenido.add(lbl_libros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 300, 330));

        pn_principal.add(pn_contenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, 380));

        pn_toolbar.setBackground(new java.awt.Color(204, 51, 0));
        pn_toolbar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ventana.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lbl_ventana.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ventana.setText("Bienvenido");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 40));

        btn_minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_MINIMIZAR.png"))); // NOI18N
        pn_toolbar.add(btn_minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 40, 40));

        btn_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_CERRAR.png"))); // NOI18N
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_acceder;
    public javax.swing.JLabel btn_cerrar;
    public javax.swing.JLabel btn_minimizar;
    public javax.swing.JLabel lbl_contraseña;
    public javax.swing.JLabel lbl_libros;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JLabel lbl_usuario;
    public javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_contenido;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    public javax.swing.JPasswordField txf_contraseña;
    public javax.swing.JTextField txf_usuario;
    // End of variables declaration//GEN-END:variables
}
