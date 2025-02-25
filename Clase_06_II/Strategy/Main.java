package Clase_06_II.Strategy;

public class Main {
    public static void main(String[] args) {

        CarritoCompras carrito = new CarritoCompras();
        carrito.setMetodoPago(new PagoTarjetaCredito());
        carrito.procesarPago(300000);

        carrito.setMetodoPago(new PagoTransferenciaBancaria());
        carrito.procesarPago(120000);

    }
}
