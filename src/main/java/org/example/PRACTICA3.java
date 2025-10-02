package org.example;

import java.util.Scanner;

public class PRACTICA3 {

    public static void main(String[] args) {

        //Instanciamos el teclado
        Scanner teclado = new Scanner(System.in);

        //Instanciamos constantes que no van a ser modificadas nunca
        final double PESOMAX = 120;
        final int ALTURAMAX = 230;
        final int ALTURAPERMITIDA = 140;

        System.out.println("***BIENVENIDO AL RATÓN JUGUETÓN***");
        System.out.println("Leyendo altura (cm)...");
        double peso = 0; //el peso lo queremos en double ya que en el ejemplo que das aparecen 41,25 kg
        int altura = 0; //la altura va en cm y pediste enteros así que en int

        try { //primer try catch para evitar la entrada de letras en la altura
            altura = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("ERROR. Solo puede introducir números.");
            return;
        }

        double pesoMin = (altura * 2) / 8; //una vez tenemos la altura calculamos el peso minimo
        //aquí primero controlamos que no sea ni negativa ni por encima de 230
        if (altura < 0 || altura > ALTURAMAX){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR...");
        }else{
            if (altura < ALTURAPERMITIDA){ //después miramos que no sea menor que la altura permitida
                System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + (ALTURAPERMITIDA - altura) + " cm de altura.");
            }else{
                System.out.println("Leyendo peso (kg)...");
                // e introducimos el segundo try catch para asegurarnos de que no entren letras en el peso
                try {
                    peso = teclado.nextDouble();
                }catch (Exception e) {
                    System.out.println("ERROR. Solo puede introducir números.");
                    return;
                }
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + pesoMin + " kg.");
                if (peso < pesoMin){ // si el peso es inferior al peso minimo: error
                    System.out.println("LO SIENTO. Te faltan " + (pesoMin - peso) + " kg para poder subir...");
                } else if (peso > PESOMAX) { // si es superior al peso maximo: error
                    System.out.println("LO SIENTO. Sobrepasas " + (peso - PESOMAX) + " kg el límite de la atracción...");
                } else if (peso <= PESOMAX) { // y si esta entre el minimo y el maximo: ¡¡sube a la atraccion!!
                    System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
                }
            }
        }
    }
}