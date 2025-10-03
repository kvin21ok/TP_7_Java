package ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class Efectivo implements Pagable{
    
    @Override
    public void pagar(double monto){
        System.out.println("Pagando $" +monto +" en efectivo");
    }

}
