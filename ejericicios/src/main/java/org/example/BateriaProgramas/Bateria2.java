package org.example.BateriaProgramas;

import java.util.Scanner;

public class Bateria2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        double horas = 0;

        boolean esNumero = false;

        do {
            try {
                System.out.println("Hola, ¿Cuántas horas trabaja al mes?");
                horas = teclado.nextDouble();
                esNumero = true;
            } catch (Exception e) {
                System.out.println("No se pueden introducir letras.");
            }
            teclado.nextLine();
        }while(!esNumero);

            System.out.println("¿Y qué tarifa recibe por hora?");
            double tarifa = teclado.nextDouble();
            double tarifa_extra = tarifa * 1.5;

            if (horas > 40) {
                double horas_extra = horas - 40;
                System.out.println("Salario: " + ((horas * tarifa) + (horas_extra * tarifa_extra)) + "€");
            } else {
                System.out.println("Salario: " + (horas * tarifa) + "€");
            }

    }
}