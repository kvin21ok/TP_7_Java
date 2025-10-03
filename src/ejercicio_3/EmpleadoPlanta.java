package ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class EmpleadoPlanta extends Empleado{
    
    private static final double PORCENTAJE = 0.20; //esto deja un %20 fijo para todos los empleados de planta
    
    public EmpleadoPlanta(String nombre){
        super(nombre);
    }
    
    @Override
    public double calcularSueldo(){
        return sueldoFijo + (sueldoFijo * PORCENTAJE); //al sueldo fijo le sumo un %20 (el porcentaje)
    }

}
