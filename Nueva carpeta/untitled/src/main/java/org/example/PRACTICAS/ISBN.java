package org.example.PRACTICAS;

import java.util.Scanner;

public class ISBN {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca ISBN:");

        String isbn = teclado.next();

        int contador = 11;

        int suma = 0;

//        int intisbn = 0;

        if (isbn.length() != 10){
            System.out.println("ERROR. El número debe tener 10 cifras.");
        } else {

            if (isbn.toUpperCase().charAt(9) != 'X'){

                String numisbn = isbn.substring(0,9);

//                try {
//                    intisbn = Integer.parseInt(numisbn);
//                }catch (Exception e){
//                    System.out.println("ERROR. Debe introducir 10 números o 9 más una X");
//                }

                //ARREGLAR ESTO
                for (int i = 0; i < 10 ; i++) {
                    suma += numisbn.charAt(i) * contador;
                    contador--;
                    System.out.println(numisbn.charAt(i) + " x " + contador + " = " + numisbn.charAt(i) * contador);
                }

                System.out.println(suma);

                if (suma % 11 == 0){
                    System.out.println("El ISBN es válido.");
                }



            }


        }


    }

}
