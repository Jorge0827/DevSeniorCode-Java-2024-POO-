package Clase_03_II;

public abstract class Reinos {

    public String nombreReino;

    public Reinos(String nombreReino) {
        this.nombreReino = nombreReino;
    }

    public void monstrarReino() {
        System.out.println("Es el Reino : " + nombreReino);
    }

    abstract void MostrarNombreCientifico(String nombreCientifico);

}
