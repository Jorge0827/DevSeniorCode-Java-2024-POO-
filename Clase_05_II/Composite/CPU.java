package Clase_05_II.Composite;

public class CPU {

    private String marca;
    private int nucleos;
    private int hilos;
    private double velocidad;

    public CPU(String marca, int nucleos, int hilos, double velocidad) {
        this.marca = marca;
        this.nucleos = nucleos;
        this.hilos = hilos;
        this.velocidad = velocidad;
    }

    public void procesar() {
        System.out.println("Procesando la informacion con " + marca + " de " + nucleos + " nucleos " + hilos + " hilos"
                + velocidad + " GHz ");
    }

}
