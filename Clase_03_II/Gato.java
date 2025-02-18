package Clase_03_II;

public class Gato extends Animal implements Terreste {

    private String raza;

    public Gato(String nombre, String raza, String NombreReino) {
        super(nombre, NombreReino);
        this.raza = raza;
    }

    @Override
    public void caminar() {
        System.out.println("El gato esta por el parque");
    }

    @Override
    public void correr(double velocidad) {
        System.out.println("Gato esta cazando un raton a esta velocodad " + velocidad + " Km/h");
    }

    @Override
    public boolean saltar() {
        System.out.println("el gato esta brincando");
        return true;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

}
