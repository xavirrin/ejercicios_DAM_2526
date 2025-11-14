package org.example.PRACTICAS;

import java.util.Arrays;
import java.util.Scanner;

public class Primitiva {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        boolean boletoOK = false;

        while(!boletoOK) {

            System.out.println("Introduce los datos de tu boleto:");

            String boletoEntero = teclado.nextLine();

            boolean formato = boletoEntero.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");

            if (formato) {

                String boleto = boletoEntero.substring(0,boletoEntero.length()-2);
                System.out.println(boleto);

                String reintegro = boletoEntero.substring(boletoEntero.length()-1);
                System.out.println(reintegro);
                int reintegroInt = Integer.parseInt(reintegro);

                String[] boletoString = boleto.split("-");
                System.out.println(Arrays.toString(boletoString));

                int[] boletoInt = new int[boletoString.length];

                for (int i = 0; i < boletoString.length; i++) {
                    boletoInt[i] = Integer.parseInt(boletoString[i]);
                    if (boletoInt[i] < 0 || boletoInt[i] > 49){
                        System.out.println("Error, los números deben estar entre 0 y 49.");
                        boletoOK = false;
                        return;
                    }
                }

                System.out.println(Arrays.toString(boletoInt));






                boletoOK = true;

            } else {
                System.out.println("Error de formato.");

            }
        }

    }

}
