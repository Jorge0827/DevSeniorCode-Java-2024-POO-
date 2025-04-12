package Clase_05_II.Composite;

public class RAM {
    private String marca;
    private int capacidad;
    private int latencia;
    private String tipo;

    public RAM(String marca, int capacidad, int latencia, String tipo) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.latencia = latencia;
        this.tipo = tipo;
    }

    public void escribirMemoria() {
        System.out.println("Escribiendo en RAM  " + marca + tipo + " de " + capacidad + " GB " + latencia + " MHz");
    }

}
