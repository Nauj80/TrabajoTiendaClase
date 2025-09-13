package Vista;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Aprendiz
 */

public class EditarUsuario extends JFrame {
    private JTextField tId, tNombre, tCorreo, tContra;
    private JButton btnBuscar, btnActualizar, btnCancelar;

    public EditarUsuario() {
        super("Editar Usuario");
        setLayout(new GridLayout(5, 2, 5, 5));

        // Campos
        add(new JLabel("ID Usuario:"));
        tId = new JTextField(10);
        add(tId);

        add(new JLabel("Nombre:"));
        tNombre = new JTextField(15);
        add(tNombre);

        add(new JLabel("Correo:"));
        tCorreo = new JTextField(15);
        add(tCorreo);

        add(new JLabel("Contraseña:"));
        tContra = new JTextField(15);
        add(tContra);

        // Botones
        btnBuscar = new JButton("Buscar");
        btnActualizar = new JButton("Actualizar");
        btnCancelar = new JButton("Cancelar");

        add(btnBuscar);
        add(btnActualizar);
        add(new JLabel()); // espacio vacío
        add(btnCancelar);

        // Eventos básicos (luego conectar a la BD)
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = tId.getText();
                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un ID para buscar");
                    return;
                }

                // Simulación de búsqueda: esto debe ir a la BD
                if (id.equals("1")) {
                    tNombre.setText("Juan");
                    tCorreo.setText("juan@example.com");
                    tContra.setText("1234");
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                }
            }
        });

        btnActualizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String id = tId.getText();
                String nombre = tNombre.getText();
                String correo = tCorreo.getText();
                String contra = tContra.getText();

                if (id.isEmpty() || nombre.isEmpty() || correo.isEmpty() || contra.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos antes de actualizar");
                    return;
                }

                // Aquí más adelante se hace el UPDATE a la BD
                JOptionPane.showMessageDialog(null, "Usuario actualizado:\n" +
                    "ID: " + id + "\nNombre: " + nombre + "\nCorreo: " + correo);
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cierra la ventana
            }
        });

        setSize(350, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EditarUsuario();
    }
}
