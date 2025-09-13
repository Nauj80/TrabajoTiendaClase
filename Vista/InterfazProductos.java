package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InterfazProductos extends JFrame {
    private JTextField txtNombre, txtDescripcion, txtPrecio, txtStock;
    private JTable tabla;
    private DefaultTableModel modelo;

    private JButton btnAgregar, btnConsultar, btnEditar, btnEliminar;

    public InterfazProductos() {
        setTitle("Gestión de Productos");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ------------------ PANEL SUPERIOR (FORMULARIO) ------------------
        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Producto"));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Descripción:"));
        txtDescripcion = new JTextField();
        panelFormulario.add(txtDescripcion);

        panelFormulario.add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        panelFormulario.add(txtPrecio);

        panelFormulario.add(new JLabel("Stock:"));
        txtStock = new JTextField();
        panelFormulario.add(txtStock);

        add(panelFormulario, BorderLayout.NORTH);

        // ------------------ TABLA CENTRAL ------------------
        String[] columnas = {"ID", "Nombre", "Descripción", "Precio", "Stock"};
        modelo = new DefaultTableModel(columnas, 0);
        tabla = new JTable(modelo);
        add(new JScrollPane(tabla), BorderLayout.CENTER);

        // ------------------ PANEL DERECHO (ACCIONES) ------------------
        JPanel panelAcciones = new JPanel(new GridLayout(4, 1, 5, 5));
        panelAcciones.setBorder(BorderFactory.createTitledBorder("Acciones"));

        btnAgregar = new JButton("Agregar");
        btnConsultar = new JButton("Consultar");
        btnEditar = new JButton("Editar");
        btnEliminar = new JButton("Eliminar");

        panelAcciones.add(btnAgregar);
        panelAcciones.add(btnConsultar);
        panelAcciones.add(btnEditar);
        panelAcciones.add(btnEliminar);

        add(panelAcciones, BorderLayout.EAST);
    }

    // ------------------ GETTERS PARA EL CONTROLADOR ------------------
    public JTextField getTxtNombre() { return txtNombre; }
    public JTextField getTxtDescripcion() { return txtDescripcion; }
    public JTextField getTxtPrecio() { return txtPrecio; }
    public JTextField getTxtStock() { return txtStock; }
    public JTable getTabla() { return tabla; }
    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnConsultar() { return btnConsultar; }
    public JButton getBtnEditar() { return btnEditar; }
    public JButton getBtnEliminar() { return btnEliminar; }
    public DefaultTableModel getModelo() { return modelo; }
}

