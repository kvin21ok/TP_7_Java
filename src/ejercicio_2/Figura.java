package ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public abstract class Figura {
    
    protected String nombre;
    
    public Figura(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public void mostrarArea(){
        System.out.println(nombre +", Area: " +calcularArea());
    }

}
