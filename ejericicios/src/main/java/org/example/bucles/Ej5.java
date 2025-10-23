package org.example.bucles;

import java.util.Scanner;

public class Ej5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");

        int num = teclado.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
