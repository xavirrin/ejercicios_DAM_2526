package org.example.bucles;

import java.util.Scanner;

public class Ej7 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();

        for (int i = palabra.length() - 1; i >= 0 ; i--) {
            System.out.print(palabra.charAt(i));
        }
    }
}
