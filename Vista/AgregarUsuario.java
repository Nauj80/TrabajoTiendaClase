import java.awt.*;
import javax.swing.*;

public class AgregarUsuario extends JFrame {
    private JTextField tNombre, tCorreo, tContra;
    private JButton btnAgregar;

    public AgregarUsuario() {
        super("Agregar Usuario");
        setLayout(new GridLayout(4, 2, 5, 5));

        add(new JLabel("Nombre:"));
        tNombre = new JTextField(15);
        add(tNombre);

        add(new JLabel("Correo:"));
        tCorreo = new JTextField(15);
        add(tCorreo);

        add(new JLabel("Contraseña:"));
        tContra = new JTextField(15);
        add(tContra);

        btnAgregar = new JButton("Agregar");
        add(new JLabel()); // celda vacía
        add(btnAgregar);

        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AgregarUsuario();
    }
}
