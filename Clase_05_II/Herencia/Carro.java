package Clase_05_II.Herencia;

public class Carro extends Vehiculo {
    private int puertas;

    public Carro(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    public void abrirMaletero() {
        System.out.println("Abriendo maletero....");
    }

    public int getPuertas() {
        return puertas;
    }

}
