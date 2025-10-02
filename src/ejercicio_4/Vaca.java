package ejercicio_4;

/**
 *
 * @author Kevin Gastaldello
 */
public class Vaca extends Animal {
    
    public Vaca(String nombre){
        super(nombre);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("MUUUUUUUUUUUUUUUUUUU");
    }

}
