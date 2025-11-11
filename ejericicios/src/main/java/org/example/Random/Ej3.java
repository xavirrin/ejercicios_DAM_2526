package org.example.Random;

import java.util.Random;
import java.util.Scanner;

public class Ej3 {

    static void main() {

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos números aleatorios quiere generar?");
        int n = teclado.nextInt();

        System.out.println("Introduzca el rango entre los que saldrán los números.");
        System.out.print("Rango superior:");
        int max = teclado.nextInt();

        System.out.print("Rango inferior:");
        int min = teclado.nextInt();

        if (min > max) {
            System.out.println("ERROR. El rango superior no puede ser menor que el inferior.");

        }else {

            for (int i = 0; i < n; i++) {
                int num = random.nextInt(max - min + 1) + min;
                System.out.print(num);
            }
        }


    }

}
