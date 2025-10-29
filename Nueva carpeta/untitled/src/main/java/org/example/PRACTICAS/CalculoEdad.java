package org.example.PRACTICAS;

import java.time.LocalDateTime;
import java.util.Scanner;

public class CalculoEdad {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        final int HOY = LocalDateTime.now().getYear();

        System.out.println("¿En qué año ha nacido?");
        int anyo = teclado.nextInt();
        int edad = 0;

        for (int i = anyo; i <= HOY ; i++) {
            System.out.println(i + " - edad: " + edad);
            edad++;
        }
    }
}
