package org.example.PRACTICAS;

import java.util.Random;
import java.util.Scanner;

public class Problema1Examen {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Acabo de pensar un número [0-100]... ¿Puedes adivinarlo? ¡Tienes 10 intentos!");

        int num = random.nextInt(101);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Intento " + i + ". Introduce un número:");
            int numero = teclado.nextInt();

            if (numero > num){
                System.out.println("Tu número es mayor al que he pensado.");
            } else if (numero < num) {
                System.out.println("Tu número es menor al que he pensado.");
            } else {
                System.out.println("HAS ACERTADO!!!! El número era " + num);
                return;
            }

        }

    }


}
