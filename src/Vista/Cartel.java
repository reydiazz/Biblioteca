package Vista;

import Fabrica.Aviso;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;
import javax.swing.ButtonModel;
import javax.swing.JDialog;

public class Cartel extends JDialog implements Aviso {

    private final String TITULO = "Atencion";

    private int xMouse;
    private int yMouse;

    public Cartel(Frame ventana, String mensaje) {
        super(ventana, true);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        lbl_titulo.setText(mensaje);
        personalizarBoton(btn_entendido);
        setTitle(TITULO);
    }

    @Override
    public void mostrar() {
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principal = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        btn_entendido = new javax.swing.JButton();
        pn_toolbar = new javax.swing.JPanel();
        lbl_ventana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Montserrat", 1, 19)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_ATENCION.png"))); // NOI18N
        lbl_titulo.setText("  XXXXXX");
        lbl_titulo.setIconTextGap(10);
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 70));

        btn_entendido.setBackground(new java.awt.Color(204, 51, 0));
        btn_entendido.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_entendido.setForeground(new java.awt.Color(255, 255, 255));
        btn_entendido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Imagenes/ICONO_ENTENDIDO.png"))); // NOI18N
        btn_entendido.setText("ENTENDIDO");
        btn_entendido.setBorder(null);
        pn_principal.add(btn_entendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 170, 40));

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
        lbl_ventana.setText("Atención");
        pn_toolbar.add(lbl_ventana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 80, 40));

        pn_principal.add(pn_toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        getContentPane().add(pn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 170));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pn_toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_toolbarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        int deltaX = x - xMouse;
        int deltaY = y - yMouse;
        setLocation(getX() + deltaX, getY() + deltaY);
        xMouse = x;
        yMouse = y;
    }//GEN-LAST:event_pn_toolbarMouseDragged

    private void pn_toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_toolbarMousePressed
        xMouse = evt.getXOnScreen();
        yMouse = evt.getYOnScreen();
    }//GEN-LAST:event_pn_toolbarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_entendido;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JLabel lbl_ventana;
    public javax.swing.JPanel pn_principal;
    public javax.swing.JPanel pn_toolbar;
    // End of variables declaration//GEN-END:variables

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dispose();
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

}
