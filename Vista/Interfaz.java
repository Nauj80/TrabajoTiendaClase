import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Interfaz extends JFrame {

    private Container contenedor;

    // pestañas del jpanel
    private JPanel panelUsuario, panelDetalleTransaccion, panelProductos, panelAgregarProductos, panelUsuarios;

    // tabla usuarios
    private JLabel lNombre, lCorreo, lContraseña;
    private JTextField tNombre, tCorreo, tContraseña;
    private JButton btnBuscar;

    // detalle transaccion
    private JLabel lProducto, lTipoPago, lCantidad, lUsuario;
    private JTextField tCantidad;
    private JComboBox<String> comboProducto, comboUsuario, comboTipoPago;
    private JButton btnEnviar;

    // productos
    private JTable tablaProductos;
    private DefaultTableModel modeloProductos;

    // agregar productos
    private JLabel lNombreProd, lDescripcionProd, lPrecioProd, lStockProd;
    private JTextField tNombreProd, tDescripcionProd, tPrecioProd, tStockProd;
    private JButton btnAgregarProd;

    // usuarios
    private JTable tablaUsuarios;
    private DefaultTableModel modeloUsuarios;

    // detalles transaccion
    private JTable tablaTransacciones;
    private DefaultTableModel modeloTransacciones;

    public Interfaz() {
        super("Gestión de Pagos - Usuarios");

        contenedor = getContentPane();
        contenedor.setLayout(new BorderLayout());

        // panel del usuario
        panelUsuario = new JPanel(new GridLayout(4, 2, 5, 5));
        panelUsuario.setBorder(new TitledBorder("Datos del Usuario"));

        lNombre = new JLabel("Nombre:");
        lCorreo = new JLabel("Correo:");
        lContraseña = new JLabel("Contraseña:");

        tNombre = new JTextField(10);
        tCorreo = new JTextField(10);
        tContraseña = new JTextField(10);

        btnBuscar = new JButton("Buscar");

        panelUsuario.add(lNombre); panelUsuario.add(tNombre);
        panelUsuario.add(lCorreo); panelUsuario.add(tCorreo);
        panelUsuario.add(lContraseña); panelUsuario.add(tContraseña);
        panelUsuario.add(new JLabel()); panelUsuario.add(btnBuscar);

        // panel: detalle de transacción
        panelDetalleTransaccion = new JPanel(new BorderLayout());
        panelDetalleTransaccion.setBorder(new TitledBorder("Consultar Transaccion"));

        JPanel camposTransaccion = new JPanel(new GridLayout(4, 2, 5, 5));

        lProducto = new JLabel("Producto:");
        comboProducto = new JComboBox<>(new String[]{"", "Producto A", "Producto B", "Producto C"});

        lUsuario = new JLabel("Usuario:");
        comboUsuario = new JComboBox<>(new String[]{"", "Usuario 1", "Usuario 2", "Usuario 3"});

        lTipoPago = new JLabel("Método de Pago:");
        comboTipoPago = new JComboBox<>(new String[]{
            "", "Efectivo", "Tarjeta Crédito", "Transferencia",
            "Tarjeta Débito", "Google Pay", "Apple Pay", "Bitcoin"
        });

        lCantidad = new JLabel("Cantidad:");
        tCantidad = new JTextField(10);

        camposTransaccion.add(lProducto); camposTransaccion.add(comboProducto);
        camposTransaccion.add(lUsuario); camposTransaccion.add(comboUsuario);
        camposTransaccion.add(lTipoPago); camposTransaccion.add(comboTipoPago);
        camposTransaccion.add(lCantidad); camposTransaccion.add(tCantidad);

        JPanel botonesTransaccion = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        btnEnviar = new JButton("Enviar");
        botonesTransaccion.add(btnEnviar);

        panelDetalleTransaccion.add(camposTransaccion, BorderLayout.CENTER);
        panelDetalleTransaccion.add(botonesTransaccion, BorderLayout.SOUTH);

        // panel: agregar productos
        panelAgregarProductos = new JPanel(new GridLayout(5, 2, 5, 5));
        panelAgregarProductos.setBorder(new TitledBorder("Agregar Productos"));

        lNombreProd = new JLabel("Nombre:");
        lDescripcionProd = new JLabel("Descripción:");
        lPrecioProd = new JLabel("Precio:");
        lStockProd = new JLabel("Stock:");

        tNombreProd = new JTextField(10);
        tDescripcionProd = new JTextField(10);
        tPrecioProd = new JTextField(10);
        tStockProd = new JTextField(10);

        btnAgregarProd = new JButton("Agregar Producto");

        panelAgregarProductos.add(lNombreProd); panelAgregarProductos.add(tNombreProd);
        panelAgregarProductos.add(lDescripcionProd); panelAgregarProductos.add(tDescripcionProd);
        panelAgregarProductos.add(lPrecioProd); panelAgregarProductos.add(tPrecioProd);
        panelAgregarProductos.add(lStockProd); panelAgregarProductos.add(tStockProd);
        panelAgregarProductos.add(new JLabel()); panelAgregarProductos.add(btnAgregarProd);

        // tabla de productos
        panelProductos = new JPanel(new BorderLayout());
        panelProductos.setBorder(new TitledBorder("Productos"));

        modeloProductos = new DefaultTableModel();
        modeloProductos.addColumn("Nombre");
        modeloProductos.addColumn("Descripción");
        modeloProductos.addColumn("Precio");
        modeloProductos.addColumn("Stock");

        tablaProductos = new JTable(modeloProductos);
        panelProductos.add(new JScrollPane(tablaProductos), BorderLayout.CENTER);

        // panel usuarios
        panelUsuarios = new JPanel(new BorderLayout());
        panelUsuarios.setBorder(new TitledBorder("Usuarios"));

        modeloUsuarios = new DefaultTableModel();
        modeloUsuarios.addColumn("ID Usuario");
        modeloUsuarios.addColumn("Nombre");
        modeloUsuarios.addColumn("Correo");

        tablaUsuarios = new JTable(modeloUsuarios);
        panelUsuarios.add(new JScrollPane(tablaUsuarios), BorderLayout.CENTER);

        // panel detalles transacción 
        JPanel panelDetalles = new JPanel(new BorderLayout());
        panelDetalles.setBorder(new TitledBorder("Consultar Transaccion"));

        modeloTransacciones = new DefaultTableModel();
        modeloTransacciones.addColumn("ID Usuario");
        modeloTransacciones.addColumn("Nombre Usuario");
        modeloTransacciones.addColumn("Correo");
        modeloTransacciones.addColumn("Tipo de Pago");
        modeloTransacciones.addColumn("Fecha");
        modeloTransacciones.addColumn("Total");
        modeloTransacciones.addColumn("Producto");
        modeloTransacciones.addColumn("Precio Unitario");
        modeloTransacciones.addColumn("Cantidad");

        tablaTransacciones = new JTable(modeloTransacciones);
        panelDetalles.add(new JScrollPane(tablaTransacciones), BorderLayout.CENTER);

        // tabbed pane para las pestañas
        JTabbedPane pestañas = new JTabbedPane();
        pestañas.addTab("Usuarios", panelUsuario);
        pestañas.addTab("Detalles de Transaccion", panelDetalleTransaccion);
        pestañas.addTab("Agregar Productos", panelAgregarProductos);
        pestañas.addTab("Productos", panelProductos);
        pestañas.addTab("Usuarios Registrados", panelUsuarios);
        pestañas.addTab("Consultar Transaccion", panelDetalles);

        contenedor.add(pestañas, BorderLayout.CENTER);

        setSize(700, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Interfaz();
    }
}
