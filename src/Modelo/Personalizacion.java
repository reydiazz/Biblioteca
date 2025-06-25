package Modelo;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Personalizacion {

    private int xMouse;
    private int yMouse;

    public Personalizacion(JFrame ventana, JPanel toolbar) {
        aplicarFuncionesToolBar(ventana, toolbar);
    }

    public Personalizacion(JFrame ventana, JPanel toolbar, JTextField[] txf, JButton[] btns, JTable tbl) {

        for (int i = 0; i < txf.length; i++) {
            personalizarTextField(txf[i]);
        }

        for (int i = 0; i < btns.length; i++) {
            personalizarBoton(btns[i]);
        }

        aplicarFuncionesToolBar(ventana, toolbar);
        
        personalizarTable(tbl);
    }

    public Personalizacion(JFrame ventana, JPanel toolbar, JTextField[] txf, JButton[] btns) {

        for (int i = 0; i < txf.length; i++) {
            personalizarTextField(txf[i]);
        }

        for (int i = 0; i < btns.length; i++) {
            personalizarBoton(btns[i]);
        }

        aplicarFuncionesToolBar(ventana, toolbar);
    }

    private void personalizarTextField(JTextField campo) {
        campo.setBackground(Color.WHITE);
        campo.setForeground(new Color(30, 30, 30));
        campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 51, 0)));
    }

    private void personalizarTable(JTable tbl) {
        tbl.setBackground(Color.white);
        tbl.setSelectionBackground(new Color(234, 229, 228));
        tbl.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tbl.setRowHeight(25);
        tbl.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tbl.getTableHeader().setBackground(new Color(204, 0, 0));
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

    private void aplicarFuncionesToolBar(JFrame ventana, JPanel toolbar) {
        MouseAdapter mouseHandler = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                xMouse = e.getXOnScreen();
                yMouse = e.getYOnScreen();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                int x = e.getXOnScreen();
                int y = e.getYOnScreen();
                int deltaX = x - xMouse;
                int deltaY = y - yMouse;
                ventana.setLocation(ventana.getX() + deltaX, ventana.getY() + deltaY);
                xMouse = x;
                yMouse = y;
            }
        };

        toolbar.addMouseListener(mouseHandler);
        toolbar.addMouseMotionListener(mouseHandler);
    }

    private void personalizarBoton(JButton boton) {
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

}
