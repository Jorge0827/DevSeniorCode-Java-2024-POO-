package Clase_03_II;

public class Perro extends Animal implements Terreste {

    private String raza;

    public Perro(String nombre, String raza, String NombreReino) {
        super(nombre, NombreReino);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println("Ladrar!!");
    }

    @Override
    public void caminar() {
        System.out.println("Perro salio a pasear");
    }

    @Override
    public void correr(double velocidad) {
        System.out.println("Perro esta cazando una ardilla a esta velocodad " + velocidad + " Km/h");
    }

    @Override
    public boolean saltar() {
        System.out.println("el perro esta brincando");
        return true;
    }

}
