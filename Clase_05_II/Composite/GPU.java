package Clase_05_II.Composite;

public class GPU {
    private String marca;
    private int capacidad;
    private double velocidad;

    public GPU(String marca, int capacidad, double velocidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
    }

    public void renderizar() {
        System.out.println("Renderizando en GPU  " + marca + " de " + capacidad + " GB " + velocidad + " MHz");
    }

}
