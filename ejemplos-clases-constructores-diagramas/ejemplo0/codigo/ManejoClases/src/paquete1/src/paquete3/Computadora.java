package paquete3;

public class Computadora {
    private String tipoProcesador;
    private double memoria;

    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }

    public void establecerMemoria(double n){
        memoria = n;
    }

    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }

    public double obtenerMemoria(){
        return memoria;
    }

}