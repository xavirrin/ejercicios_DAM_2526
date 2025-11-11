package org.example.PRACTICAS;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurais {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** BIENVENIDO A LA BATALLA DE LOS SAMURAIS ***");
        System.out.println();
        System.out.println("Equipo 1");

        boolean equpo1 = false;

        int potencia1 = 0;
        int potencia2 = 0;
        int potencia = 0;


        while (!equpo1) {

            System.out.print("Introduce potencia de los samurais: ");

            String eq1 = teclado.nextLine();
            String eq1S[] = eq1.split(" ");

            if (eq1S.length != 7) {
                System.out.println("ERROR. Debe introducir 7 samuráis.");
            } else {

                int eqInt[] = new int[eq1S.length];

                potencia = 0;

                for (int i = 0; i < eqInt.length; i++) {

                    int num = Integer.parseInt(eq1S[i]);
                    eqInt[i] = num;
                    potencia += num;
                }

                if (potencia != 30) {
                    System.out.println("ERROR. La potencia total no suma 30");
                } else {
                    potencia1 = potencia;
                    System.out.println(Arrays.toString(eqInt));
                    equpo1 = true;
                }





            }
        }
    }
}
