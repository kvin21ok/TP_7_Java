package ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args){
        Figura figuras[] = {new Circulo("circulo 1", 2), new Rectangulo("rectangulo 1", 2, 3), 
                            new Circulo("circulo 2", 1), new Rectangulo("rectangulo 1", 10, 20)};
        
        for (Figura f: figuras){
            f.mostrarArea();
        }
    }

}
