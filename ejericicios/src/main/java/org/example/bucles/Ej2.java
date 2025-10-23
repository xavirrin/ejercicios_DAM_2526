package org.example.bucles;

import java.util.Scanner;

public class Ej2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int n = teclado.nextInt();

//        do {
//            System.out.println(n);
//            n--;
//        }while (n != 0);

        for (int i = n; i > 0 ; i--) {
            System.out.println(i);
        }

    }

}
