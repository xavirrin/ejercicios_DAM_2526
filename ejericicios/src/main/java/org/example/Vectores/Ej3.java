package org.example.Vectores;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {

    static void main() {

        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        int v[] = new int[25];
        int contador = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(101);
        }

        System.out.println(Arrays.toString(v));

        System.out.println("Ingresa un número del 0 al 100 y te diré cuántas veces se encuentra en el vector: ");
        int num = teclado.nextInt();

        for (int i = 0; i < v.length; i++) {
            if (v[i] == num){
                contador++;
            }
        }


        System.out.println("El número " + num + " se encuentra " + contador + " veces en el vector.");

    }
}
