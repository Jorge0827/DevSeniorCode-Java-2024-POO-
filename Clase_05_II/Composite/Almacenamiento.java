package Clase_05_II.Composite;

public class Almacenamiento {
    private String marca;
    private int capacidad;
    private double velocidad;
    private String tipo;

    public Almacenamiento(String marca, int capacidad, double velocidad, String tipo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    public void escribirAlmacenamiento() {
        System.out.println("Escribiendo en ROM  " + marca + tipo + " de " + capacidad + " GB " + velocidad + " MB/s");
    }

}
