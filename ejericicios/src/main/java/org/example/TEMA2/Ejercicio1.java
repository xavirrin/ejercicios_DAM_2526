package org.example.TEMA2;

import java.util.Scanner;

public class Ejercicio1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        //a
        System.out.println("Introduzca una frase:");
        String frase = teclado.nextLine();
        System.out.println("Texto original: " + frase);
        //b
        int tamanyo = frase.length();
        System.out.println("El tamaño de la frase introducida es de " + tamanyo + " caracteres.");
        //c
        String frase_replace = frase.replace(" ", "");
        System.out.println("Texto sin espacios: " + frase_replace);
        //d
        int mitad_tamanyo = tamanyo/2;

        String mitad1 = frase.substring(0, mitad_tamanyo);
        String mitad2 = frase.substring(mitad_tamanyo, tamanyo);

        System.out.println("Primera mitad del texto es: " + mitad1 + ", y la segunda mitad del texto es: " + mitad2);

        //e
        String frase_mayus = frase.toUpperCase();
        System.out.println("Texto a mayúsculas: " + frase_mayus);

    }
}
