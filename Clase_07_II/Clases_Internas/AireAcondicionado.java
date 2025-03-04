package Clase_07_II.Clases_Internas;

public class AireAcondicionado {

    private String marca;
    private int capacidad;
    private int temperatura;
    private Ventilador ventilador;

    public AireAcondicionado(String marca, int capacidad) {
        this.marca = marca;
        this.capacidad = capacidad;
        this.ventilador = new Ventilador();
    }

    /**
     * Enciende el aire acondicionado y le asigna la temperatura especificada
     * 
     * @param temperatura la temperatura a la que se quiere encender el aire
     */
    public void encender(int temperatura) {
        this.temperatura = temperatura;
        System.out.println("El aire acondicionado se encendio");
        this.ventilador.girar();
    }

    /**
     * Apaga el aire acondicionado
     * 
     * @return true si el aire acondicionado se apago correctamente, false en caso
     *         de error
     */
    public boolean apagar() {
        System.out.println("El aire acondicionado se apago");
        return true;
    }

    private class Ventilador {
        public void girar() {
            System.out.println("El ventilador gira");
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getTemperatura() {
        return temperatura;
    }
}
