package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Spectrum {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ancho = 0;
        int alto = 0;

        System.out.println("******** VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM ********");

        //buleano para controlar que la resolucion sea correcta y seguir con el programa o enbuclarnos
        boolean resolucion = false;

        while (!resolucion){

            System.out.println("Introduce la resolución de tu pantalla (ancho x alto)...");
            System.out.println("Ancho:");

            //controlamos formato numerico
            if (teclado.hasNextInt()) {
                ancho = teclado.nextInt();

                //controlamos que sea multiplo de 8, no mayor de 48 y que no pueda ser negativo
                if (ancho % 8 == 0 && ancho <= 48 && ancho >= 0) {

                    System.out.println("Alto:");

                    if (teclado.hasNextInt()) {
                        alto = teclado.nextInt();
                        if (alto % 8 == 0 && alto <= 48 && alto >= 0) {

                            resolucion = true;

                        }
                    }else {
                        System.out.println("Error. El ancho deber ser un número.");
                        teclado.nextLine();
                    }
                }
            }else {
                System.out.println("Error. El ancho deber ser un número.");
                teclado.nextLine();
            }
        }


        System.out.println("Introduce línea a línea los colores de tu imagen para cada píxel:");

        //matriz que guardara la resolucion
        char[][] bloque = new char[alto][ancho];

        teclado.nextLine();

        //leemos linea a linea
        for (int i = 0; i < alto; i++) {
            String linea = teclado.nextLine();
            if (linea.length()== ancho) {       //si la longitud no es la del ancho error y restamos 1 a i para que solo se acabe cuando lleguemos a 8 lineas correctas
                if (linea.matches("[A-O]+")) {      //Lo mismo si las letras introducidas no estan entre la A y O
                    for (int j = 0; j < ancho; j++) {       //Si es correcto guardamos la linea caracter a caracter
                        bloque[i][j] = linea.charAt(j);
                    }
                } else {
                    System.out.println("Introduce un valor de píxel correcto. (A-O)");
                    i--;
                }
            }else {
                System.out.println("Introduce un número de colores correcto. (" + ancho + ").");
                i--;
            }
        }

        //mostramos el bloque con un for each
        for (char[] color : bloque){
            System.out.println(Arrays.toString(color));
        }

        //buleano para controlar que solo hay dos colores por bloque de 8x8
        boolean compatible = true;

        //creamos for que avanza por pasos de 8 para ir controlando bloques
        for (int fila = 0; fila < alto; fila += 8) {
            for (int col = 0; col < ancho; col += 8) {

                //creamos 2 opcines de colores inicialmente vacios
                char color1 = 0;
                char color2 = 0;

                //recorremos el bloque de 8x8 en el que nos encontramos
                for (int i = fila; i < fila + 8 && compatible; i++) {
                    for (int j = col; j < col + 8 && compatible; j++) {

                        char actual = bloque[i][j];

                        // Si en color1 no hay color, lo guardamos ahi
                        if (color1 == 0) {
                            color1 = actual;
                        }
                        // Si el color actual es distinto al color1 y el color2 esta vacio,
                        //lo almacenamos en color2
                        else if (actual != color1 && color2 == 0) {
                            color2 = actual;
                        }
                        // Si aparece un tercer color distinto falseamos el buleano porque no puede
                        //haber mas de dos colores
                        else if (actual != color1 && actual != color2) {
                            compatible = false;
                        }
                    }
                }
            }
        }

        if (compatible) {
            System.out.println("Es compatible con un ZX Spectrum");
        } else {
            System.out.println("No es compatible con un ZX Spectrum");
        }
    }
}
