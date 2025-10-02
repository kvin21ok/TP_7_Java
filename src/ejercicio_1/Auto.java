package ejercicio_1;

/**
 *
 * @author Kevin Gastaldello
 */
public class Auto extends Vehiculo{
    
    private final int cantidadPuertas;
    
    public Auto(String marca, String modelo, int cantidadPuertas){
        super(marca, modelo); 
        this.cantidadPuertas = cantidadPuertas;
        
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Marca: " +marca +", modelo: " +modelo +", Puertas: " +cantidadPuertas);
    }

}
