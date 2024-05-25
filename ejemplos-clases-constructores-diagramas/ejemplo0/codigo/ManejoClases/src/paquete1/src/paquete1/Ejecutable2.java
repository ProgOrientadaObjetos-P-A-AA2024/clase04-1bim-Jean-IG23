package paquete1;

public class Ejecutable2 {
    public static void main(String[] args){
        Computadora personal = new Computadora(24.0);
        personal.establecerTipoProcesador("R1");
        System.out.printf("%s - %f", personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());

    }
}