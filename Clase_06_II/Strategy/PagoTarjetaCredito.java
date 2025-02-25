package Clase_06_II.Strategy;

public class PagoTarjetaCredito implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando " + monto + " con tarjeta de crédito");
    }
}
