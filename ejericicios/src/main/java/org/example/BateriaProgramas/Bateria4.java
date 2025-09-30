package org.example.BateriaProgramas;

import java.util.Scanner;

public class Bateria4 {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num1 = teclado.nextInt();
        System.out.print("Itroduzca otro número: ");
        int num2 = teclado.nextInt();

        if(num1 != num2){
            System.out.print("Introduzca un tercer número: ");
            int num3 = teclado.nextInt();

            if (num3 != num1 && num3 != num2){
                int num_mayor = num1;
                int num_menor = num2;

                if(num1 < num2){
                    num_mayor = num2;
                    if(num2 < num3){

                    }
                }

            }else{
                System.out.println("ERROR: No introduzca número iguales.");

            }
        }else{
            System.out.println("ERROR: No introduzca número iguales.");
        }

    }
}
