package Servicio;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner read = new Scanner(System.in);

    //crear la cadena
    public Cadena crearCadena() {
        Cadena nuevaCadena = new Cadena();
        System.out.println("Ingrese una frase random.");
        nuevaCadena.setFrase(read.nextLine());

        return nuevaCadena;

    }

//      Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
//      frase ingresada.
    public void mostrarVocal(Cadena nuevaCadena) {

        int contador = 0;
        for (int i = 0; i < nuevaCadena.getFrase().length(); i++) {

            if (nuevaCadena.getFrase().charAt(i) == 'a' || nuevaCadena.getFrase().charAt(i) == 'e' || nuevaCadena.getFrase().charAt(i) == 'i' || nuevaCadena.getFrase().charAt(i) == 'o' || nuevaCadena.getFrase().charAt(i) == 'u') {
                contador = contador + 1;
            }

        }

        System.out.println("El total de vocales que posee esa frase es de: " + contador + " vocales");

    }

//    Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
//    Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena nuevaCadena) {
        String fraseInvertida = nuevaCadena.getFrase();

        StringBuilder sb = new StringBuilder(fraseInvertida);

        System.out.println("La frase invertida es: " + sb.reverse());
    }

//      Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
//      y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
//      Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    //el indexOf() lo que hace es que te encuentra la primer letra que buscaste en toda la oracion
    //si la oracion es: "Hola mundo" y buscas la M. te va a tirar: 6, porque la PRIMER M esta en la 6ta posicion.
    public void vecesRepetido(Cadena nuevaCadena) {
        System.out.println("Ingrese un caracter");
        String caracter = read.next();

        int pos = nuevaCadena.getFrase().indexOf(caracter);
        int contador = 0;

        while (pos != -1) {
            contador++;

            pos = nuevaCadena.getFrase().indexOf(caracter, pos + 1);
        }

        System.out.println("La leta: " + caracter + " se repite: " + contador + " veces.");
    }

//          Método compararLongitud(String frase), deberá comparar la longitud de la frase
//          que compone la clase con otra nueva frase ingresada por el usuario.
    public int comprararLongitud(Cadena nuevaCadena) {
        System.out.println("Ingrese una frase para ser comparada con la frase ingresada primeramente..");
        String fraseNueva = read.next();

        int fraseNuevaCantidadCaracteres = fraseNueva.length();

        int estado;
        //Devuelve -1 osea que la primera frase es Mayor.
        if (nuevaCadena.getFrase().length() > fraseNuevaCantidadCaracteres) {

            return estado = -1;
            //Este else if devuelve 0 osea que la 2nda frase es Mayor.
        }
        if (nuevaCadena.getFrase().length() < fraseNuevaCantidadCaracteres) {

            return estado = 0;
            //Este else devuelve 1 eso quiere decir que ambas frases tienen la misma longitud.
        } else {

            return estado = 1;

        }

    }

//          Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
//          con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena nuevaCadena) {
        System.out.println("Ingrese la frase que quiere unir a: " + nuevaCadena.getFrase());
        String fraseParaConcatenar = " " + read.next();

        nuevaCadena.setFrase(nuevaCadena.getFrase().concat(fraseParaConcatenar));

        System.out.println(nuevaCadena.getFrase());

    }

//      Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
//      encuentren en la frase, por algún otro carácter seleccionado por el usuario y
//      mostrar la frase resultante.
    public void reemplazar(Cadena nuevaCadena) {
        System.out.println("Ingrese un caracter, y éste caracter reemplazara a la letra 'a' en la frase ingresada.");
        char caracterReemplazo = read.next().charAt(0);

        nuevaCadena.setFrase(nuevaCadena.getFrase().replace('a', caracterReemplazo));

        System.out.println(nuevaCadena.getFrase());

    }

//      Método contiene(String letra), deberá comprobar si la frase contiene una letra que
//      ingresa el usuario y devuelve verdadero si la contiene y falso si no.
    public boolean contiene(Cadena nuevaCadena) {
        System.out.println("Ingrese una letra y buscaremos a ver si la frase la tiene.");
        String buscarLaLetra = read.next();

        if (nuevaCadena.getFrase().contains(buscarLaLetra)) {
            return true;

        } else {
            return false;
        }

//        for (int i = 0; i < nuevaCadena.getFrase().length(); i++) {
//            String letraActual = nuevaCadena.getFrase().substring(0, i + 1);
//
//            if (letraActual.equals(buscarLaLetra)) {
//
//                return true;
//            }
//
//        }
//
//        return false;
    }
}
