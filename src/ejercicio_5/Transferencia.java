package ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class Transferencia implements Pagable{
    
    private String destino;
    
    public Transferencia(String destino){
        this.destino = destino;
    }
    
    @Override
    public void pagar(double monto){
        System.out.println("Pagando $" +monto +" mediante transferencia a: " +destino);
    }
    
}
