package org.example.Random;

import java.util.Random;

public class Ej1 {

    static void main() {

        Random random = new Random();

        int conDado = 0;

        for (int i = 0; i < 6; i++) {
            int dado = random.nextInt(6)+1;
            System.out.print(dado + " ");

            conDado += dado;
        }

        System.out.println();
        System.out.println("Suma total: " + conDado);
    }
}
