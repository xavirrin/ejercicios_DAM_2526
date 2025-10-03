package org.example;

import java.util.Scanner;

public class PRACTICA4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int ando = 0;
        int ador = 0;

        boolean correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce el multiplicando (3 cifras): ");
                ando = teclado.nextInt();
                correcto = true;
            } catch (Exception e) {
                System.out.println("Has de introducir números.");
                return;
            }
            if (ando < 100 && ando >= 0 || ando > 999 || ando < -999 || ando > -100 && ando <= 0) {
                System.out.println("El número debe tener 3 cifras.");
                return;
            }
        }
//        String andoC = Integer.toString(ando);
//        String andoC_1 = andoC.substring(0,1);
//        String andoC_2 = andoC.substring(1,2);
//        String andoC_3 = andoC.substring(2,3);
//        int ando1 = Integer.parseInt(andoC_1);
//        int ando2 = Integer.parseInt(andoC_2);
//        int ando3 = Integer.parseInt(andoC_3);

        correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce el multiplicador (3 cifras): ");
                ador = teclado.nextInt();
                correcto = true;
            } catch (Exception e) {
                System.out.println("Has de introducir números.");
                return;
            }
            if (ador < 100 && ador >= 0 || ador > 999 || ador < -999 || ador > -100 && ador <= 0) {
                System.out.println("El número debe tener 3 cifras.");
                return;
            }
//            if (ador < 0){
            String adorC = Integer.toString(ador);
            String adorC_1 = adorC.substring(0, 1);
            String adorC_2 = adorC.substring(1, 2);
            String adorC_3 = adorC.substring(2, 3);
            int ador1 = Integer.parseInt(adorC_1);
            int ador2 = Integer.parseInt(adorC_2);
            int ador3 = Integer.parseInt(adorC_3);


            int fila1 = ando * ador3;
            int fila2 = ando * ador2;
            int fila3 = ando * ador1;

            int filaneg1 = ando * ador3 * -1;
            int filaneg2 = ando * ador2 * -1;
            int filaneg3 = ando * ador1 * -1;

            int resultado = ando * ador;


            System.out.println("El producto de la multiplicación es: " + ando * ador);
            System.out.println("El proceso es: ");
            System.out.println("   " + ando);
            System.out.println(" x " + ador);
            System.out.println("--------");
            if (fila1 < 1000) {
                System.out.println("   " + fila1);
            } else {
                System.out.println("  " + fila1);
            }
            if (fila2 < 1000) {
                System.out.println("  " + fila2 + "x");
            } else {
                System.out.println(" " + fila2 + "x");
            }
            if (fila3 < 1000) {
                System.out.println(" " + fila3 + "xx");
            } else {
                System.out.println(fila3 + "xx");
            }
            System.out.println("--------");
            if (resultado < 100000) {
                System.out.println(" " + resultado);
            } else {
                System.out.println(resultado);
            }


        }
    }
}
