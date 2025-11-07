package org.example.Vectores;

import java.util.Scanner;

public class Ej10 {

    static void main() {

        String palabras[] = {"hola","que", "tal", "como", "estamos" };

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una letra:");

        char letra = teclado.next().toLowerCase().charAt(0);

        for (int i = 0; i < palabras.length; i++) {

            if (letra == palabras[i].charAt(0)){
                System.out.println(palabras[i]);
            }
        }
    }
}
