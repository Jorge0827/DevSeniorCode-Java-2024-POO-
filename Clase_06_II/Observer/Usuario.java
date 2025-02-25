package Clase_06_II.Observer;

public class Usuario implements Observador {

    private String nombre;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Pilas!! : " + nombre + " le tengo un chisme : " + mensaje);
    }

}
