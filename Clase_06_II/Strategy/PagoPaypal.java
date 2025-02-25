package Clase_06_II.Strategy;

public class PagoPaypal implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con Paypal");
    }
}
