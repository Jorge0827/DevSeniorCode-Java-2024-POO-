package Clase_06_II.Strategy;

public class CarritoCompras {
    private MetodoPago metodoPago;

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void procesarPago(double monto) {
        if (metodoPago == null) {
            System.out.println("Por favor, seleccione un método de pago");
        } else {
            metodoPago.pagar(monto);
        }
    }

}
