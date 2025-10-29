package org.example.Random;

import java.util.Random;

public class Ej4 {

    static void main() {

        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";
        char letra = ' ';
        int contraLength = random.nextInt(8, 12);

        boolean mayus = false;
        boolean minus = false;
        boolean nums = false;

        for (int i = 0; i < contraLength; i++) {
            int posicion = random.nextInt(62);
            letra = caracteres.charAt(posicion);
            System.out.print(letra);
            contrasenya += letra;

            if (posicion <= 26) {
                mayus = true;
            }
            if (posicion > 26 && posicion <= 52) {
                minus = true;
            }
            if (posicion > 52) {
                nums = true;
            }
        }

        if (mayus && minus && nums) {
            System.out.println();
            System.out.println(contrasenya);
        } else {
            System.out.println();
            System.out.println("La contraseña debe contener al menos una mayúscula, una minúscula y un número.");
        }
    }
}
