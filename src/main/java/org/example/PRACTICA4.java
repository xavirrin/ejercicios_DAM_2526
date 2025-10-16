package org.example;

import java.util.Scanner;

public class PRACTICA4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        //Inicializamos multiplicando y multiplicador para poder introducir luego por teclado su valor
        int ando = 0;
        int ador = 0;

        //Creamos buleano para crear el bucle while en el que se introduzca obligatoriamente un numero de 3 cifras
        //negativo o positivo
        boolean correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce el multiplicando (3 cifras): ");
                ando = teclado.nextInt();

                // Validamos si tiene 3 cifras (positivas o negativas)
                if ((ando >= 100 && ando <= 999) || (ando <= -100 && ando >= -999)) {
                    correcto = true; // solo se sale del bucle si el número es correcto
                } else {
                    System.out.println("El número debe tener 3 cifras.");
                }

            } catch (Exception e) {
                System.out.println("Has de introducir números.");
                return; // el programa termina si no se introduce un numero
            }
        }

        //y repetimos operacion con el mutiplicador
        correcto = false;

        while (!correcto) {
            try {
                System.out.print("Introduce el multiplicador (3 cifras): ");
                ador = teclado.nextInt();

                if ((ador >= 100 && ador <= 999) || (ador <= -100 && ador >= -999)) {
                    correcto = true;
                } else {
                    System.out.println("El número debe tener 3 cifras.");
                }

            } catch (Exception e) {
                System.out.println("Has de introducir números.");
                return;
            }
        }

        //Crearemos un caso de impresion para los numeros positivos para controlar el guion de la mejor manera posible
            if (ador > 0) {

                //pasamos a String cada uno de los digitos del multiplicdor
                String adorC = Integer.toString(ador);
                String adorC_1 = adorC.substring(0, 1);
                String adorC_2 = adorC.substring(1, 2);
                String adorC_3 = adorC.substring(2, 3);
                //Y luego los pasamos de nuevo a int
                int ador1 = Integer.parseInt(adorC_1);
                int ador2 = Integer.parseInt(adorC_2);
                int ador3 = Integer.parseInt(adorC_3);

                //creamos las filas para mostrarlas despues
                int fila1 = ando * ador3;
                int fila2 = ando * ador2;
                int fila3 = ando * ador1;

                //Y hacemos lo mismo con el resultado
                int resultado = ando * ador;

                System.out.println("El producto de la multiplicación es: " + ando * ador);
                System.out.println("El proceso es: ");
                System.out.println("   " + ando);
                System.out.println(" x " + ador);
                System.out.println("--------");
                //Dependiendo de si tiene 3 o 4 cifras el resultado de cada operacion le pondremos un espacio o 2 antes
                //para que todos queden en linea
                if (fila1 < 1000) {
                    System.out.println("   " + fila1);
                } else {
                    System.out.println("  " + fila1);
                }
                if (fila2 < 1000) {
                    System.out.println("  " + fila2 + "x");
                } else {
                    System.out.println(" " + fila2 + "x");
                }
                if (fila3 < 1000) {
                    System.out.println(" " + fila3 + "xx");
                } else {
                    System.out.println(fila3 + "xx");
                }
                System.out.println("--------");
                if (resultado < 100000) {
                    System.out.println(" " + resultado);
                } else {
                    System.out.println(resultado);
                }

            }else { //Y haremos casi lo mismo aqui

                String adorC = Integer.toString(ador);
                String adorC_1 = adorC.substring(1, 2);
                String adorC_2 = adorC.substring(2, 3);
                String adorC_3 = adorC.substring(3, 4);
                int ador1 = Integer.parseInt(adorC_1);
                int ador2 = Integer.parseInt(adorC_2);
                int ador3 = Integer.parseInt(adorC_3);

                //pero multiplicando por -1 las filas
                int fila1 = ando * ador3 * -1;
                int fila2 = ando * ador2 * -1;
                int fila3 = ando * ador1 * -1;

                int resultado = ando * ador;


                System.out.println("El producto de la multiplicación es: " + ando * ador);
                System.out.println("El proceso es: ");
                System.out.println("   " + ando);
                System.out.println(" x " + ador);
                System.out.println("--------");
                if (fila1 > -1000 && fila1 < 1000) {
                    System.out.println("   " + fila1);
                } else {
                    System.out.println("  " + fila1);
                }
                if (fila2 > -1000 && fila2 < 1000) {
                    System.out.println("  " + fila2 + "x");
                } else {
                    System.out.println(" " + fila2 + "x");
                }
                if (fila3 > -1000 && fila3 < 1000) {
                    System.out.println(" " + fila3 + "xx");
                } else {
                    System.out.println(fila3 + "xx");
                }
                System.out.println("--------");
                if (resultado > -100000 && resultado < 100000) {
                    System.out.println(" " + resultado);
                } else {
                    System.out.println(resultado);
                }


            }
        }
    }
