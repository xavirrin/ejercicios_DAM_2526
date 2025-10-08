package org.example;

import java.util.Scanner;

public class Azulejos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        System.out.println("La obra de " + nombre);

        System.out.println("Introduce el ancho de la pared...");
        double anchoPared = teclado.nextInt();

        System.out.println("Introduce el largo de la pared...");
        double largoPared = teclado.nextInt();

        System.out.println("Introduce el ancho del azulejo...");
        double anchoAzulejo = teclado.nextInt();

        System.out.println("Introduce el largo del azulejo...");
        double largoAzulejo = teclado.nextInt();

        if (anchoAzulejo == largoAzulejo){
            System.out.println("El azulejo no puede ser cuadrado.");
            return;
        } else if ((anchoAzulejo*largoAzulejo)>(anchoPared*largoPared)) {
            System.out.println("El azulejo no puede ser más grande que la pared.");
            return;
        }

        System.out.println("Se necesitan " + (anchoPared*largoPared)/(anchoAzulejo*largoAzulejo) + " azulejos.");

    }


}
