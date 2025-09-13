package Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InterfazUsuarios extends JFrame {
    private JTextField txtNombre, txtCorreo;
    private JPasswordField txtContrasena;
    private JTable tabla;
    private DefaultTableModel modelo;

    // 🔹 Ahora los botones son atributos de la clase
    private JButton btnAgregar, btnConsultar, btnEditar, btnEliminar;

    public InterfazUsuarios() {
        setTitle("Gestión de Usuarios");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ------------------ PANEL SUPERIOR (FORMULARIO) ------------------
        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Agregar Usuario"));

        panelFormulario.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelFormulario.add(txtNombre);

        panelFormulario.add(new JLabel("Correo:"));
        txtCorreo = new JTextField();
        panelFormulario.add(txtCorreo);

        panelFormulario.add(new JLabel("Contraseña:"));
        txtContrasena = new JPasswordField();
        panelFormulario.add(txtContrasena);

        add(panelFormulario, BorderLayout.NORTH);

        // ------------------ TABLA CENTRAL ------------------
        String[] columnas = {"ID", "Nombre", "Correo", "Contraseña"};
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

    // GETTERS PARA EL CONTROLADOR
    public JTextField getTxtNombre() { return txtNombre; }
    public JTextField getTxtCorreo() { return txtCorreo; }
    public JPasswordField getTxtContrasena() { return txtContrasena; }
    public JTable getTabla() { return tabla; }
    public JButton getBtnAgregar() { return btnAgregar; }
    public JButton getBtnConsultar() { return btnConsultar; }
    public JButton getBtnEditar() { return btnEditar; }
    public JButton getBtnEliminar() { return btnEliminar; }
}
