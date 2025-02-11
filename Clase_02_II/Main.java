package Clase_02_II;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Darwin", "CC", "123456789", 1.80, 85, LocalDate.of(1992, 3, 5));
        System.out.println(persona1.getEdad());
        persona1.calcularEdad();
        System.out.println(persona1.getEdad());

        Empleado EmpleadoCristian = new Empleado("Cristian", "CC", "122334432534", 1.79, 78, LocalDate.of(2000, 1, 23));
        EmpleadoCristian.mostrarInformacion();
    }
}
