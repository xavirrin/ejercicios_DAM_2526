package org.example.BateriaProgramas;

import java.util.Scanner;

public class Bateria5 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número a dividir: ");
        int num = teclado.nextInt();

        System.out.print("Ahora introduzca un divisor: ");
        int num2 = teclado.nextInt();

        if (num2 == 0){
            System.out.println("ERROR: no se puede dividir entre 0");
        }else{
            System.out.println("El resultado de dividir " + num + " entre " + num2 + " es: " + (num / num2));
        }

    }
}
