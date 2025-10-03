package ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class ProcesadorPagos {
    
    public static <T extends Pagable> void procesarPago(T medio, double monto){
        medio.pagar(monto);
    }

}
