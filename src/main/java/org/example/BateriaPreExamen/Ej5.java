package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int sueldoM = 0;
        int sueldoMil = 0;

        System.out.println("Introduce 5 sueldos");
        for (int i = 1; i <= 5 ; i++) {
            System.out.println("Sueldo " + i + ":");
            int sueldo = teclado.nextInt();

            if (sueldo > sueldoM){
                sueldoM = sueldo;
            }
            if (sueldo >= 1000) {
                sueldoMil++;
            }
        }

        System.out.println("El sueldo más alto es el de " + sueldoM + "€");
        System.out.println("Y " + sueldoMil + " ganan más de 1000€");
    }
}
