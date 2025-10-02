package ejercicio_4;

/**
 *
 * @author Kevin Gastaldello
 */
public class Animal {
    
    protected String nombre;
    
    public Animal(String nombre){
        this.nombre = nombre;
    }
    
    public void hacerSonido(){
        System.out.println("Sonido generico de animal");
    }
    
    public void describirAnimal(){
        System.out.println("Nombre: " +nombre);
    }

}
