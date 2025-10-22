package org.example.TEMA2;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HasNextInt {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        int modo = 0;
        final int ANYO_MIN = 1900;
        LocalDateTime fecha = LocalDateTime.now();
        int anyo_actual = fecha.getYear();

        System.out.println("Elija un modo:");
        System.out.println("[1] - Año de nacimiento.");
        System.out.println("[2] - Edad.");
        System.out.println("---------------------------");

        boolean seguir = true;



        if (teclado.hasNextInt()){
            modo = teclado.nextInt();
        }else {
            System.out.println("ERROR. Valor del modo incorrecto");
            seguir = false;
        }

        if (seguir) {
            if (modo == 1) {

                System.out.println("Introduce tu año de nacimiento:");
                String anyo_naci = teclado.nextLine();
                int anyo = 0;

                try {
                    anyo = Integer.parseInt(anyo_naci);
                }catch (InputMismatchException e){
                    System.out.println("ERROR. No puede introducir letras en el año de nacimiento.");
                    return;
                }

                if (anyo >= ANYO_MIN && anyo <= fecha.getYear()){

                }

            } else if (modo == 2) {



            } else {
                System.out.println("El modo introducido no es correcto.");
            }
        }
    }
}
