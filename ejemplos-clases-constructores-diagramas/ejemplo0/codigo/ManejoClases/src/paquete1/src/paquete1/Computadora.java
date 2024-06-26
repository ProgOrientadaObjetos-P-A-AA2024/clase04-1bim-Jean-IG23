package paquete1;

public class Computadora {
    private String tipoProcesador;
    private double memoria;

    public Computadora(){
        tipoProcesador = "Intel - X";
        memoria = 16;

    }

    public Computadora(double m){
        memoria = m;

    }

    public Computadora(String tipo ){
        tipoProcesador = tipo;

    }

    public Computadora(String tipo, double mem ){
        memoria = mem;
        tipoProcesador = tipo;

    }

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