package Clase_06_II.Observer;

public class Main {
    public static void main(String[] args) {

        Sujeto chismosa = new Sujeto();

        Usuario miguel = new Usuario("Miguel O");
        Usuario nelson = new Usuario("Nelson R");
        Usuario yuri = new Usuario("Yuri T");

        chismosa.agregarObservador(yuri);
        chismosa.agregarObservador(nelson);

        chismosa.notificarObservadores("Llego la policia porque donde martica habia gritos");

        chismosa.agregarObservador(miguel);

        chismosa.notificarObservadores("Se pelearon los niños en la cancha");

        chismosa.eliminarObservador(yuri);

        chismosa.notificarObservadores("Lorenita le fue infiel al marido");

    }
}
