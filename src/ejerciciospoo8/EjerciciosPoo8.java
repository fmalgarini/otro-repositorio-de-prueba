package ejerciciospoo8;

import Entidades.Cadena;
import Servicio.CadenaServicio;

public class EjerciciosPoo8 {

    public static void main(String[] args) {

        //primero se llama al servicio y se le pone un NOMBRE NUEVO.. y el new.
        //estoy creando un newCadena de tipo cadenaservicio, que es una clase.
        //luego va la clase cadena que tambien se crea con un nuevo nombre, pero el servicio va siempre primero.
        //aca en el igual se pone newCcadena.crearCadena
        CadenaServicio newCadena = new CadenaServicio();

        Cadena cadenaUno = newCadena.crearCadena();

        newCadena.mostrarVocal(cadenaUno);
        newCadena.invertirFrase(cadenaUno);
        newCadena.vecesRepetido(cadenaUno);

        int resultado = newCadena.comprararLongitud(cadenaUno);

        if (resultado == -1) {
            System.out.println("La primera frase es mayor que la segunda.");

        } else if (resultado == 0) {
            System.out.println("La segunda frase es mayor que la primera.");

        } else {
            System.out.println("Ambas frases tienen la misma cantidad de caracteres.");
        }

        newCadena.unirFrases(cadenaUno);
        newCadena.reemplazar(cadenaUno);

        if (newCadena.contiene(cadenaUno)) {
            System.out.println("Si contiene.");
            System.out.println("No contiene.");
        } else {
        }
    }
}
