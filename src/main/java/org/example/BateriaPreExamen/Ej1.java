package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int conM = 0;
        int conm = 0;
        int conigu = 0;

        System.out.println("Cuántos números quieres introducir?");
        int n = teclado.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Introduce el número " + i);
            int num = teclado.nextInt();

            if (num > 0){
                conM++;
            } else if (num < 0) {
                conm++;
            }else {
                conigu++;
            }
        }

        System.out.println("Mayores que 0: " + conM);
        System.out.println("Menores que 0: " + conm);
        System.out.println("Iguales a 0: " + conigu);
    }

}
