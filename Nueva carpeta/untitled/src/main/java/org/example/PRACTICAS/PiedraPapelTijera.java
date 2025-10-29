package org.example.PRACTICAS;

import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("JUGUEMOS A PIEDRA, PAPEL, TIJERA!");

        int conPlayer = 0;
        int conCompu = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Ronda " + i);
            System.out.print("Piedra, papel o tijera? (p/a/t): ");
            char opcionPlayer = teclado.next().toLowerCase().charAt(0);

            switch (opcionPlayer) {
                case 'p':
                    System.out.println("Ha elegido: Piedra.");
                    opcionPlayer = 0;
                    break;
                case 'a':
                    System.out.println("Ha elegido: Papel.");
                    opcionPlayer = 1;
                    break;
                case 't':
                    System.out.println("Ha elegido: Tijera.");
                    opcionPlayer = 2;
                default:
                    System.out.println("ERROR.");
            }

            int opcionCompu = random.nextInt(3);

            switch (opcionCompu) {
                case 0:
                    System.out.println("El ordenador ha elegido: Piedra.");
                    break;
                case 1:
                    System.out.println("El ordenador ha elegido: Papel.");
                    break;
                case 2:
                    System.out.println("El ordenador ha elegido: Tijera.");
                default:
                    System.out.println("ERROR.");
            }

            if (opcionPlayer == 0){
                if (opcionCompu == 1){
                    System.out.println("Has perdido!");
                    conCompu++;
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                } else if (opcionCompu == 2) {
                    System.out.println("Has ganado!");
                    conPlayer++;
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                }else{
                    System.out.println("Empate!");
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                }
            } else if (opcionPlayer == 1) {
                if (opcionCompu == 2){
                    System.out.println("Has perdido!");
                    conCompu++;
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                } else if (opcionCompu == 0) {
                    System.out.println("Has ganado!");
                    conPlayer++;
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                }else{
                    System.out.println("Empate!");
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                }
            } else {
                if (opcionCompu == 0){
                    System.out.println("Has perdido!");
                    conCompu++;
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                } else if (opcionCompu == 1) {
                    System.out.println("Has ganado!");
                    conPlayer++;
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                }else{
                    System.out.println("Empate!");
                    System.out.println("Marcador actual (PC-Usuario): " + conCompu + " - " + conPlayer);
                }

                System.out.println("--------------");
            }
        }
    }
}
