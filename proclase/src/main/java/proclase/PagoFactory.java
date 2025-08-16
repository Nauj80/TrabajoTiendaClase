/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proclase;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author APRENDIZ
 */
public class PagoFactory {
    
    private final static Map<TipoDePago, Pagos> pagos=new HashMap<>(){{
       
        put(TipoDePago.PAYPAL, new PagoPayPal());
        put(TipoDePago.EFECTIVO, new PagoEfectivo());
    
    }};
    
    public Pagos obtenerPago(TipoDePago tipoDePago){
        return pagos.get(tipoDePago);
        
        
        
    }
    
}
