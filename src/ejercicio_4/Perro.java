package ejercicio_4;

/**
 *
 * @author Kevin Gastaldello
 */
public class Perro extends Animal {
    
    public Perro(String nombre){
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("GUAAUUU GUAAUUUU");
    }

}
