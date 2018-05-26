
package unitec.elementosmvc;

/**
 *
 * @author T-107
 */
public class Credito implements Tarjeta{
    @Override
    public String obtenerSaldo(){//Puede ser void en vez de string 
        System.out.println("Hola, tu saldo de: ");
        return "Credito 40000";
    }
}
