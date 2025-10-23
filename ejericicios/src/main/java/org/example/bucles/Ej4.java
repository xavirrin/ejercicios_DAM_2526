package org.example.bucles;

import java.util.Scanner;

public class Ej4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una palabra:");
        String palabra = teclado.nextLine();

        for (int i = 0; i < palabra.length() ; i++) {
            System.out.println(palabra.charAt(i));
        }

    }
}
