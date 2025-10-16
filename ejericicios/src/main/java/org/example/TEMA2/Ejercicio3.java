package org.example.TEMA2;

import java.util.Scanner;

public class Ejercicio3 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        String num = teclado.nextLine();
        int tamanyo = num.length();

        System.out.println("Ahora introduzca el número de cifras que quiere eliminar: ");
        int n = teclado.nextInt();

        String num_recortado = num.substring(0, tamanyo-n);

        System.out.println(num_recortado);
    }

}
