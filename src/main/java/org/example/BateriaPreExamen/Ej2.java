package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ej2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        System.out.println("Introduce una base: ");
        int base = teclado.nextInt();

        System.out.println("Introduce un exponente: ");
        int exp = teclado.nextInt();
        int resultado = base;
        if (exp > 0){

            System.out.println("El resultado de " + base + " elevado a " + exp + " es:");
            for (int i = 1; i <= exp ; i++) {
                System.out.println(resultado + " x " + base + " = " + resultado*base);
                resultado *= base;
            }


        }else {
            System.out.println("ERROR. El exponente debe ser positivo.");
        }

    }

}
