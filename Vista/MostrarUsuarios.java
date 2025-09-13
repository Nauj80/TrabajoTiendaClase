/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Controlador.ControladorUsuario;
import conexion.UsuariosSystem;

public class MostrarUsuarios {
    public static void main(String[] args) {
        InterfazUsuarios vista = new InterfazUsuarios();

        // Crear el CRUD (modelo)
        UsuariosSystem crud = new UsuariosSystem();

        // Crear el controlador y vincularlo con la vista y el modelo
        ControladorUsuario controlador = new ControladorUsuario(vista, crud);

        // Mostrar la ventana
        vista.setVisible(true);

        // Cargar usuarios al inicio
        controlador.cargarUsuarios();
    }
    
}
