package Clase_05_II.Herencia;

public class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String marca, String modelo, double capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public void cargarMercancia() {
        System.out.println("Cagando la mercacia de " + capacidadCarga + " kilo(s)");
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

}