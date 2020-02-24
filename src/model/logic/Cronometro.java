package model.logic;

//Solucion tomada del libro guia en:https://algs4.cs.princeton.edu/14analysis/Stopwatch.java.html
public class Cronometro { 

    private final long start;

    /**
     * Inicializa el cronometro
     */
    public Cronometro() {
        start = System.currentTimeMillis();
    } 


    /**
     * Retorna el tiempo en segundos que paso desde la creacion del cronometro
     * @return tiempo que paso desde la cracion del cronometro en segundos
     */
    public double darTiempo() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
