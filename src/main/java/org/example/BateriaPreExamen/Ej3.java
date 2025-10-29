package org.example.BateriaPreExamen;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int pago = 10;
        int pagototal = 0;

        System.out.println("¿En cuántos meses quieres pagar?");
        int meses = teclado.nextInt();

        System.out.println("Financiación a " + meses + " meses:");
        for (int i = 1; i <=meses ; i++) {
            System.out.println("Mes " + i + ": " + pago + "€");
            pagototal += pago;
            pago *= 2;
        }
        System.out.println("Total a pagar: " + pagototal + "€");

    }

}
