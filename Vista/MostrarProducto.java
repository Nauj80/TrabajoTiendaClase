package Vista;

import Controlador.ControladorProductos;
import conexion.ProductosSystem;

public class MostrarProducto {
    public static void main(String[] args) {
        InterfazProductos vista = new InterfazProductos();

        ProductosSystem crud = new ProductosSystem();

        ControladorProductos controlador = new ControladorProductos(vista, crud);

        vista.setVisible(true);

        controlador.cargarProductos();
    }
    
}
