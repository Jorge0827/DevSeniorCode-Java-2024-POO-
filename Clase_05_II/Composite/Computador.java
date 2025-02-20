package Clase_05_II.Composite;

public class Computador {
    private String marca;
    private Monitor monitor;
    private CPU cpu;
    private RAM ram;
    private Almacenamiento almacenamiento;
    private GPU gpu;

    public Computador(Monitor monitor, CPU cpu, RAM ram, Almacenamiento almacenamiento, GPU gpu, String marca) {
        this.monitor = monitor;
        this.cpu = cpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.gpu = gpu;
        this.marca = marca;
    }

    public void iniciar() {
        System.out.println("Computador: " + marca);
        monitor.mostrarImagen();
        cpu.procesar();
        ram.escribirMemoria();
        almacenamiento.escribirAlmacenamiento();
        gpu.renderizar();
    }

    public String getMarca() {
        return marca;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

}
