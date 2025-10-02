package ejercicio_2;

/**
 *
 * @author Kevin Gastaldello
 */
public class Circulo extends Figura {
    
    private final double radio;
    
    public Circulo(String nombre, double radio){
        super(nombre);
        this.radio = radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    } 

}
