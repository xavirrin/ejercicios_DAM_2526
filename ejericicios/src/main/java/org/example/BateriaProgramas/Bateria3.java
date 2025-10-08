package org.example.BateriaProgramas;

import java.util.Scanner;

public class Bateria3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        try {
            System.out.print("Introduzca un número: ");
            num = teclado.nextInt();

            if (num < 0) {
                System.out.println("El número introducido es negativo");
            } else if (num > 0) {
                System.out.println("El número introducido es mayor que 0");
            } else {
                System.out.println("El número introducido es 0!");
            }

        } catch (Exception e) {
            System.out.println("No se pueden introducir letras.");
        }
    }
}
