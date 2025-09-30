package org.example.BateriaProgramas;

import java.util.Scanner;

public class Bateria1 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        double horas = 0;

        double tarifa = 0;

        boolean esNumero = false;

        while (!esNumero) {

            esNumero = true;

            try {
                System.out.println("Hola, ¿Cuántas horas trabaja al mes?");
                horas = teclado.nextDouble();

            } catch (Exception e) {
                System.out.println("No se pueden introducir letras.");
                esNumero = false;
                teclado.nextLine();

            }

        }

            esNumero = false;

        while (!esNumero) {

            esNumero = true;

            try {
                System.out.println("¿Y qué tarifa recibe por hora?");
                tarifa = teclado.nextDouble();

            } catch (Exception e) {
                System.out.println("No se pueden introducir letras.");
                esNumero = false;
                teclado.next();

            }

        }

            System.out.println("Salario: " + (horas * tarifa) + "€");

    }
}
