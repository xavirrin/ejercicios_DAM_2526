package org.example.Random;

import java.util.Random;

public class Ej2 {

    static void main() {

        Random random = new Random();

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";
        char letra = ' ';

        for (int i = 0; i < 12; i++) {
            int posicion = random.nextInt(62);
            letra = caracteres.charAt(posicion);
            System.out.print(letra);
            contrasenya += letra;
        }

        System.out.println();
        System.out.println(contrasenya);
    }

}
