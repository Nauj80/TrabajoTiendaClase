package conexion;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/tienda";
    String pass="";
    String user="root";
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString(),"Base de datos Apagada"+"",JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
}