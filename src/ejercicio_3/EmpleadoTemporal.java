package ejercicio_3;

/**
 *
 * @author Kevin Gastaldello
 */
public class EmpleadoTemporal extends Empleado {
    
    private static final double VALOR_HORA = 100; // para todos los empleados temporales la hora va a valer esto
    private int horasTrabajadas;
    
    public EmpleadoTemporal(String nombre, int horasTrabajadas){
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    @Override
    public double calcularSueldo(){
        return sueldoFijo + (horasTrabajadas * VALOR_HORA);
    }

}
