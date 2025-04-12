package Clase_05_II.Composite;

public class Monitor {

    private String marca;
    private double tamanio;

    public Monitor(String marca, double tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
    }

    public void mostrarImagen() {
        System.out.println("Mostrando imagen en monitor : " + marca + " de " + tamanio + " pulgadas");
    }

}
