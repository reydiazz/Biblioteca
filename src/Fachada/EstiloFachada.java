package Fachada;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class EstiloFachada {

    private static int xMouse;
    private static int yMouse;

    public static void aplicarEstiloGlobal(Container contenedor) {
        aplicarEstiloGlobal(contenedor, Set.of());
    }

    public static void filtrarTabla(JTable tabla, JTextField buscador) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabla.getModel());
        tabla.setRowSorter(sorter);

        buscador.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                filtrar();
            }

            public void removeUpdate(DocumentEvent e) {
                filtrar();
            }

            public void changedUpdate(DocumentEvent e) {
                filtrar();
            }

            private void filtrar() {
                String texto = buscador.getText();
                if (texto.trim().length() == 0) {
                    sorter.setRowFilter(null);
                } else {
                    sorter.setRowFilter(RowFilter.regexFilter("(?i)" + texto, 1));
                }
            }
        });

    }

    public static void aplicarEstiloGlobal(Container contenedor, Set<Component> excluidos) {
        for (Component comp : contenedor.getComponents()) {
            if (excluidos.contains(comp)) {
                continue;
            }
            if (comp instanceof JButton boton) {
                aplicarEstiloBoton(boton);
            } else if (comp instanceof JTextField campo) {
                aplicarEstiloCampo(campo);
            } else if (comp instanceof JTable tabla) {
                aplicarEstiloTabla(tabla);
            } else if (comp instanceof Container sub) {
                aplicarEstiloGlobal(sub, excluidos);
            }
        }
    }

    public static void aplicarEstiloTabla(JTable tabla) {
        tabla.setBackground(Color.white);
        tabla.setSelectionBackground(new Color(234, 229, 228));
        tabla.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tabla.setRowHeight(25);
        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 16));
        tabla.getTableHeader().setBackground(new Color(204, 0, 0));
        tabla.getTableHeader().setForeground(Color.WHITE);
        tabla.getTableHeader().setReorderingAllowed(false);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < tabla.getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        tabla.setAutoCreateRowSorter(true);

        tabla.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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

    private static void aplicarEstiloBoton(JButton boton) {
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

    private static void aplicarEstiloCampo(JTextField campo) {
        campo.setBackground(Color.WHITE);
        campo.setForeground(new Color(30, 30, 30));
        campo.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(204, 51, 0)));
    }

    public static void aplicarFuncionesToolBar(JFrame ventana, JPanel toolbar) {
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

}
