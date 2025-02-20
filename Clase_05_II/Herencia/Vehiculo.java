package Clase_05_II.Herencia;

public class Vehiculo {

    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void conducir() {
        System.out.println("el Vehículo esta en marcha");
    }

    public void cosumoCombustible(String tipo, double litros) {
        System.out.println("el vehículo gasto " + litros + " de " + tipo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
