package paquete1;

public class Ejecutable3 {
    public static void main(String[] args){
        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Intel vPRo");
        System.out.printf("%s - %.2f\n"
                , personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());

    }
}