package Clase_06_II.Strategy;

public class PagoEfectivo implements MetodoPago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con efectivo");
    }

}
