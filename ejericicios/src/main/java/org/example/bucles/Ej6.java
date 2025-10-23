package org.example.bucles;

import java.util.Scanner;

public class Ej6 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuántos números quiere sumar?: ");
        int cantidad = teclado.nextInt();
        int resultado = 0;

        for (int i = 1; i <= cantidad; i++) {
            System.out.println("Inserta nª" + i + ": ");
            int num = teclado.nextInt();
            resultado += num;
        }
        System.out.println();
        System.out.println("El resultado es: " + resultado);
    }

}
