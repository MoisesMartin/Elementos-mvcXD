/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unitec.elementosmvc;

/**
 *
 * @author T-107
 */
public class Nomina implements Tarjeta{
    @Override
    public String obtenerSaldo(){
        System.out.println("Hola, tu saldo de: ");
        return "Nomina 20000";
    }
}
    
