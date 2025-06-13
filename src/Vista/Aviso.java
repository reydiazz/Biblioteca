
package Vista;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.ButtonModel;

public class Aviso extends javax.swing.JDialog {

      
    public Aviso(java.awt.Frame parent, boolean modal,String titulo) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        lbl_titulo.setText(titulo);
        personalizarBoton(btn_entendido);
        setTitle("Atencion");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_principal = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        btn_entendido = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_principal.setBackground(new java.awt.Color(255, 255, 255));
        pn_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_titulo.setBackground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lbl_titulo.setForeground(new java.awt.Color(0, 0, 0));
        lbl_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_titulo.setText("  XXXXXX");
        pn_principal.add(lbl_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 60));

        btn_entendido.setBackground(new java.awt.Color(255, 51, 0));
        btn_entendido.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_entendido.setForeground(new java.awt.Color(255, 255, 255));
        btn_entendido.setText("ENTENDIDO");
        btn_entendido.setBorder(null);
        btn_entendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_entendidoActionPerformed(evt);
            }
        });
        pn_principal.add(btn_entendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 170, 40));

        getContentPane().add(pn_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_entendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_entendidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_entendidoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_entendido;
    public javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pn_principal;
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
            public void mouseClicked(java.awt.event.MouseEvent evt){
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
