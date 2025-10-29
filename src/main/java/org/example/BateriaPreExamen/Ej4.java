package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Qué nota ha sacado?");
        int nota = teclado.nextInt();

        switch (nota){

            case 0, 1, 2, 3, 4:
                System.out.println("INSUFICIENTE");
                break;
            case 5:
                System.out.println("SUFICIENTE");
                break;
            case 6:
                System.out.println("BIEN");
                break;
            case 7, 8:
                System.out.println("NOTABLE");
                break;
            case 9, 10:
                System.out.println("SOBRESALIENTE");
                break;
            default:
                System.out.println("NO VÄLIDO");

        }


    }

}
