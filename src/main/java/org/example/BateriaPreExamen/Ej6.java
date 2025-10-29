package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int conedad = 0;
        double conaltura = 0;
        int mayores = 0;
        int altos = 0;

        System.out.println("¿A cuántos niños vamos a medir?");
        int n = teclado.nextInt();

        for (int i = 1; i <= n ; i++) {
            System.out.println("Niño " + i +".");
            System.out.println("Introduce edad:");
            int edad = teclado.nextInt();
            conedad += edad;
            if (edad >= 18){
                mayores++;
            }
            System.out.println("Introduce altura:");
            double altura = teclado.nextDouble();
            conaltura +=altura;
            if (altura >= 175){
                altos++;
            }
        }

        System.out.println("Edad media: " + conedad/n);
        System.out.println("Altura media: " + conaltura/n);
        System.out.println("Mayores de 18 años: " + mayores);
        System.out.println("Más de 175 cm: " + altos);

    }

}
