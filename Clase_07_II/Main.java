package Clase_07_II;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

import Clase_07_II.Clases_Internas.AireAcondicionado;

public class Main {
    public static void main(String[] args) {

        // Clase interna
        AireAcondicionado aireAcondicionado = new AireAcondicionado("Panasonic", 1000);
        aireAcondicionado.encender(16);
        aireAcondicionado.apagar();

        // Clase Anonima
        Timer temporizador = new Timer(3000, new ActionListener() {
            private int contador = 0;
            private final String mensaje = "Tu puedes sigue estudiando programación";

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(mensaje + " " + contador);
                if (contador == 9) {
                    ((Timer) e.getSource()).stop();
                    System.out.println("El temporizador se ha detenido");
                } else {
                    contador++;
                }
            }

        });

        temporizador.start();

        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Lambda expression ->

        List<String> nombres = Arrays.asList("Cristian", "Carlos", "Luis", "Rudy", "Darwin");

        nombres.forEach((nombre) -> System.out.println("El nombre es: " + nombre));
        Collections.sort(nombres, (nombre1, nombre2) -> nombre1.compareToIgnoreCase(nombre2));
        System.out.println(nombres);

    }
}
