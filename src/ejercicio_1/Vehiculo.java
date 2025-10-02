package ejercicio_1;

/**
 *
 * @author Kevin Gastaldello
 */
public class Vehiculo {
    
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void mostrarInfo(){
        System.out.println("Marca: " +marca +", modelo: " +modelo);
    }
    

}
