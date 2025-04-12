package Clase_03_II;

public class Main {
    public static void main(String[] args) {
        // Polimorfismo
        Animal miperro = new Perro("Pancho", "Chandoberman", "Reino Animal");
        miperro.hacerSonido();

        // Abstraccion
        Perro perro = new Perro("Gonzo", "Dogo", "Reino Animal");
        Gato gato = new Gato("Michi", "Persa", "Reino Animal");
        perro.correr(32.5);
        gato.correr(16.3);

    }
}
