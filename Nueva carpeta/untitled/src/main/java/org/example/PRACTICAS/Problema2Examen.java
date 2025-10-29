package org.example.PRACTICAS;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Problema2Examen {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        int contador = 0;
        final int HOY = LocalDateTime.now().getYear();

        System.out.println("Introduce un año:");
        int anyo = teclado.nextInt();

        for (int i = anyo; i <= HOY ; i++) {
            if (i % 4 == 0) {
                if (i % 100 != 0) {
                    contador++;
                }
//                if (i % 400 == 0) {
//
//                }
            }
        }
        System.out.println("Ha habido " + contador + " años bisiestos.");
    }
}
