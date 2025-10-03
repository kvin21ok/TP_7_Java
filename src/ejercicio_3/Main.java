package ejercicio_3;

import java.util.ArrayList;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args){
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("Juan"));
        empleados.add(new EmpleadoPlanta("Maribel"));
        empleados.add(new EmpleadoTemporal("Andrea", 12));
        empleados.add(new EmpleadoTemporal("Marquitos", 15));
        
        for(Empleado e: empleados){
            e.mostrarSueldo();
            if (e instanceof EmpleadoPlanta){
                System.out.println(e.nombre +" es empleado de planta");
            } else if (e instanceof EmpleadoTemporal){
                System.out.println(e.nombre +" es empleado temporal");
            }
            
            System.out.println("--------------------------");
        }
    }

}
