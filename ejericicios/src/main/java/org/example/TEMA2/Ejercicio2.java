package org.example.TEMA2;

import java.util.Scanner;

public class Ejercicio2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra1 = teclado.nextLine();
        int tamanyo1 = palabra1.length();

        System.out.println("Introduce otra palabra a comparar: ");
        String palabra2 = teclado.nextLine();
        int tamanyo2 = palabra2.length();

        if (tamanyo1 < tamanyo2){
            System.out.println("La palabra '" + palabra2 + "' es más larga que '" + palabra1 + "'.");
        } else if (tamanyo1 > tamanyo2) {
            System.out.println("La palabra '" + palabra1 + "' es más larga que '" + palabra2 + "'.");
        }else {
            System.out.println("Las palabras son igual de largas.");
        }
    }
}
