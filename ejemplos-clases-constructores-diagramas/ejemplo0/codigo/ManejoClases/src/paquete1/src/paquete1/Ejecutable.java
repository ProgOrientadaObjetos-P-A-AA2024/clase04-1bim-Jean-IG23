package paquete1;

public class Ejecutable {
    public static void main(String[] args) {
        Computadora computadoraPersonal = new Computadora();

        String procesador = "Intel";
        double memoria = 8.2;
        computadoraPersonal.establecerTipoProcesador(procesador);
        computadoraPersonal.establecerMemoria(memoria);

        System.out.printf("Computadora\n"
                        + "Procesador: %s\n"
                        + "Memoria: %.2f GB\n",
                computadoraPersonal.obtenerTipoProcesador(),
                computadoraPersonal.obtenerMemoria());

    }
}
