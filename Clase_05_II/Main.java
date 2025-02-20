package Clase_05_II;

import Clase_05_II.Herencia.Carro;
import Clase_05_II.Herencia.Moto;
import Clase_05_II.Composite.Almacenamiento;
import Clase_05_II.Composite.CPU;
import Clase_05_II.Composite.Computador;
import Clase_05_II.Composite.GPU;
import Clase_05_II.Composite.Monitor;
import Clase_05_II.Composite.RAM;
import Clase_05_II.Herencia.Camion;

public class Main {
    public static void main(String[] args) {

        // Herencia
        System.out.println("-------------------------Herencia-----------------");

        Carro carro = new Carro("Chevrolet", "Onix", 5);
        carro.conducir();
        carro.abrirMaletero();
        carro.cosumoCombustible("Gasolina", 45);

        Moto moto = new Moto("Kawasaki", "Z1000", true);
        moto.conducir();
        moto.verificarSeguridad();
        moto.cosumoCombustible("Gasolina", 12);

        Camion camion = new Camion("Volvo", "XYZ", 1500);
        camion.conducir();
        camion.cargarMercancia();
        camion.cosumoCombustible("Diesel", 60);

        // Composite

        System.out.println("------------------------Composite-----------------");

        Monitor monitor = new Monitor("Samsung", 14);
        CPU cpu = new CPU("Intel", 4, 8, 2.7);
        RAM ram = new RAM("Corsair", 8, 3200, "DDR5");
        Almacenamiento rom = new Almacenamiento("Sandisk", 500, 150, "SSD");
        GPU gpu = new GPU("Nvidia", 16, 4000);

        Computador miPC = new Computador(monitor, cpu, ram, rom, gpu, "Lenovo");
        miPC.iniciar();
        miPC.setGpu(new GPU("MSI", 32, 8000));

    }
}
