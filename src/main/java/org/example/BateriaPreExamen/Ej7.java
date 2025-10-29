package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n = 0;
        int num0 = 0;
        int num1 = 1;

        do {
            System.out.println("¿Cuántos números desea ver?");
            n = teclado.nextInt();
            if (n <= 0) {
                System.out.println("ERROR. El número debe ser positivo.");
            }
        }while (n <= 0);

        System.out.print("Secuencia de números: ");

        if (n == 1) {
            System.out.println(num0);
        }else {
            System.out.print(num0 + " " + num1);
            for (int i = 2; i < n; i++) {
                int num2 = num0 + num1;
                System.out.print(" " + num2);
                num0 = num1;
                num1 = num2;

            }
        }
    }
}
