package ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class TarjetaCredito implements Pagable{
    
    private String numeroTarjeta;
    
    public TarjetaCredito(String numeroTarjeta){
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public void pagar(double monto){
        System.out.println("Pagando $" +monto +" con la tarjeta de credito: " +numeroTarjeta);
    }

}
