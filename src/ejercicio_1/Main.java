package ejercicio_1;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args){
        Auto auto1 = new Auto("Volkswagen", "Gol 1.6", 3);
        auto1.mostrarInfo();
        
        Vehiculo auto2 = new Vehiculo("Toyota", "Corolla");
        auto2.mostrarInfo();
        
        Vehiculo auto3 = new Auto("Fiat", "Duna 1.6", 5);
        auto3.mostrarInfo();
    }

}
