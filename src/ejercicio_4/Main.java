package ejercicio_4;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args){
        Animal animales[] = {new Perro("Branca"),
                            new Gato("Isis"),
                            new Vaca("Lola")};
        
        for (Animal a: animales){
            a.describirAnimal();
            a.hacerSonido();
            System.out.println();
        }
    }

}
