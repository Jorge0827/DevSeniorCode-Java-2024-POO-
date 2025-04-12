package Clase_02_II;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

    private String nombre;
    private String tipoDocumento;
    private String dni;
    private int edad;
    private double estatura;
    private double peso;
    private LocalDate fechaNacimiento;

    public Persona(String nombre, String tipoDocumento, String dni, double estatura, double peso,
            LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.tipoDocumento = tipoDocumento;
        this.dni = dni;
        this.estatura = estatura;
        this.peso = peso;
        this.fechaNacimiento = fechaNacimiento;
    }

    protected void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo de documento: " + tipoDocumento);
        System.out.println("Numero de identificación: " + dni);
        System.out.println("Edad: " + edad);
        System.out.println("Estatura: " + estatura);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void calcularEdad() {
        edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", tipoDocumento=" + tipoDocumento + ", dni=" + dni + ", edad=" + edad
                + ", estatura=" + estatura + ", peso=" + peso + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

}
