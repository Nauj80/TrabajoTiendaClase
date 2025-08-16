/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proclase;

/**
 *
 * @author APRENDIZ
 */
public class UsaFactoryPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PagoFactory pagosFactory = new PagoFactory();
        Pagos pagos= pagosFactory.obtenerPago(TipoDePago.EFECTIVO);
        pagos.crearPago();
        
    }
    
}
