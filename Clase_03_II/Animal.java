package Clase_03_II;

public class Animal extends Reinos {

    private String nombre;

    public Animal(String nombre, String NombreReino) {
        super(NombreReino);
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Este animal esta haciendo un sonido");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    void MostrarNombreCientifico(String nombreCientifico) {
        System.out.println("ANIMALUGI-QWERTY");
    }

}
