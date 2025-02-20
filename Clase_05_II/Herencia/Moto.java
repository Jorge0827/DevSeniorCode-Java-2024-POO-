package Clase_05_II.Herencia;

public class Moto extends Vehiculo {
    private boolean usaCasco;

    public Moto(String marca, String modelo, boolean usaCasco) {
        super(marca, modelo);
        this.usaCasco = usaCasco;
    }

    public void verificarSeguridad() {
        if (usaCasco) {
            System.out.println("Ud es una persona responsable");
        } else {
            System.out.println("Que Dios lo bendiga");
        }
    }

    public boolean isUsaCasco() {
        return usaCasco;
    }

}
