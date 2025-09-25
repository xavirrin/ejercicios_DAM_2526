package org.example;

import java.util.Scanner;

public class Actividad {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre?");
        String nombre = teclado.nextLine();

        System.out.println("¿Cuál es tu curso?");
        String curso = teclado.next();

        System.out.println("Hola " + nombre + ", bienvenid@ a " + curso + "!");

        System.out.println();

        System.out.print("Introduce un número: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce otro número: ");
        int num2 = teclado.nextInt();

        System.out.println("La suma de esos dos números es: " + (num1 + num2));
    }

}
