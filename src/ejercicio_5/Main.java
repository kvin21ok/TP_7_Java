package ejercicio_5;

/**
 *
 * @author Kevin Gastaldello
 */
public class Main {
    
    public static void main(String[] args){
        
        //creo las distintas fromas de pago
        TarjetaCredito tarjeta1 = new TarjetaCredito("001122");
        Transferencia transferencia1 = new Transferencia("carniceria");
        Efectivo efectivo1 = new Efectivo();
        TarjetaCredito tarjeta2 = new TarjetaCredito("334455");
        Transferencia transferencia2 = new Transferencia("verduleria");
        Efectivo efectivo2 = new Efectivo();
        
        //proceso usando PorecsadorPagos para todas
        ProcesadorPagos.procesarPago(tarjeta1, 200000);
        ProcesadorPagos.procesarPago(tarjeta2, 15426);
        ProcesadorPagos.procesarPago(transferencia1, 1589);
        ProcesadorPagos.procesarPago(transferencia2, 2025);
        ProcesadorPagos.procesarPago(efectivo1, 15900);
        ProcesadorPagos.procesarPago(efectivo2, 95680);
    }

}
