package Clase_01_II;

public class Persona {

    // Atributos
    String nombre;
    int edad;

    // constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /*
     * public Persona() {
     * this.nombre = "";
     * this.edad = 0;
     * }
     */

    // metodos
    public void mostrarInformacion(String mensaje) {
        System.out.println(mensaje);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public String DevolverInformacion() {
        return "Nombre: " + nombre + " Edad: " + edad;
    }

    /**
     * Muestra saludos cordiales con el nombre y la edad de la persona
     */
    public void Saludos() {
        System.out.println("Saludos cordiales, Nombre: " + nombre + " Edad: " + edad);
    }

}
