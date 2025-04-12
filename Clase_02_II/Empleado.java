package Clase_02_II;

import java.time.LocalDate;

public class Empleado extends Persona {

    private String cargo;
    private double salario;

    public Empleado(String nombre, String tipoDocumento, String dni, double estatura, double peso,
            LocalDate fechaNacimiento) {
        super(nombre, tipoDocumento, dni, estatura, peso, fechaNacimiento);
    }

    public Empleado(String nombre, String tipoDocumento, String dni, double estatura, double peso,
            LocalDate fechaNacimiento, String cargo, double salario) {
        super(nombre, tipoDocumento, dni, estatura, peso, fechaNacimiento);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
