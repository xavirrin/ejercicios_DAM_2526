package org.example.PRACTICAS;

import java.util.Scanner;

public class PRACTICA3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final double PESOMAX = 120;
        final int ALTURAMAX = 230;
        final int ALTURAPERMITIDA = 140;

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");
        System.out.println("Leyendo altura (cm)...");
        double peso = 0;
        int altura = 0;

        try {
            altura = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR. Solo puede introducir números.");
            return;
        }
        double pesoMin = (altura * 2) / 8;
        if (altura < 0 || altura > ALTURAMAX){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
        }else{
            if (altura < ALTURAPERMITIDA){
                System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + (ALTURAPERMITIDA - altura) + " cm de altura.");
            }else{
                System.out.println("Leyendo peso (kg)...");
                try {
                    peso = teclado.nextDouble();
                }catch (Exception e) {
                    System.out.println("ERROR. Solo puede introducir números.");
                    return;
                }
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + pesoMin + " kg.");
                if (peso < pesoMin){
                    System.out.println("LO SIENTO. Te faltan " + (pesoMin - peso) + " kg para poder subir...");
                } else if (peso > PESOMAX) {
                    System.out.println("LO SIENTO. Sobrepasas " + (peso - PESOMAX) + " kg el límite de la atracción...");
                } else if (peso <= PESOMAX) {
                    System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
                }
            }
        }
    }
}
