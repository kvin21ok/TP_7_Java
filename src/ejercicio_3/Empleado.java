package ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public abstract class Empleado {
    
    protected String nombre;
    protected double sueldoFijo = 1000;
    
    public Empleado(String nombre){
        this.nombre = nombre;
    }
    
    public abstract double calcularSueldo();
    
    public void mostrarSueldo(){
        System.out.println(nombre +" gana: $" +calcularSueldo());
    }

}
