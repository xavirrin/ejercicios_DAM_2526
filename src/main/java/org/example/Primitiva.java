package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Primitiva {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //booleano para controlar si el boleto introducido es valido
        boolean boletoOK = false;

        int[] boletoInt = new int[6];
        int reintegroUsuario = -1;

        //mientras el boleto no sea valido repetimos
        while (!boletoOK) {

            System.out.println("Introduce los datos de tu boleto (N-N-N-N-N-N/R):");
            String boletoEntero = teclado.nextLine();

            //Comprobamos formato con matches
            boolean formato = boletoEntero.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d");
            //Si el formato es correcto
            if (formato) {
                // Separamos los numeros y el reintegro mediante split
                String[] partes = boletoEntero.split("[-/]");
                // Booleano para comprobar si los numeros son validos
                boolean valido = true;

                //Recorremos el boleto
                for (int i = 0; i < 6; i++) {

                    // Convertimos el número de a int
                    int num = Integer.parseInt(partes[i]);

                    // Comprobamos que este entre 1 y 49
                    if (num < 1 || num > 49) {
                        System.out.println("Error: los números deben estar entre 1 y 49.");
                        valido = false;
                        break;
                    }

                    // Comprobamos repetidos comparando con los anteriores
                    for (int j = 0; j < i; j++) {
                        if (boletoInt[j] == num) {
                            System.out.println("Error: números repetidos.");
                            valido = false;
                            break;
                        }
                    }

                    // Si hubo error, salimos del bucle principal
                    if (!valido) {
                        break;
                    }

                    // Guardamos el numero en el array del boleto
                    boletoInt[i] = num;
                }

                // Si hay error volvemos a pedir el boleto
                if (!valido) continue;

                // Guardamos el reintegro del usuario
                reintegroUsuario = Integer.parseInt(partes[6]);
                // Marcamos que el boleto es correcto
                boletoOK = true;

            } else {
                System.out.println("Error de formato.");
            }
        }

        // Cremaos array para el sorteo
        int[] sorteo = new int[6];

        // Generamos los 6 numeros del sorteo
        for (int i = 0; i < 6; i++) {

            // Numero aleatorio entre 1 y 49
            int num = random.nextInt(49) + 1;

            // Repetimos mientras haya repetido
            while (true) {
                boolean repetido = false;
                for (int j = 0; j < i; j++) {
                    if (sorteo[j] == num) {
                        repetido = true;
                        break;
                    }
                }
                if (!repetido) {
                    break;
                }
                num = random.nextInt(49) + 1;
            }

            sorteo[i] = num;
        }

        Arrays.sort(sorteo);

        // Genreramos un nmero complementario aleatorio
        int complementario = random.nextInt(49) + 1;

        while (true) {
            boolean repetido = false;
            for (int i = 0; i < sorteo.length; i++) {
                if (sorteo[i] == complementario) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                break;
            }
            complementario = random.nextInt(49) + 1;
        }

        // Generamos reintregro aleaotorio del 0 al 9
        int reintegroSorteo = random.nextInt(10);

        // Mostramos sorteo
        System.out.println("\n*** SORTEO ***");
        System.out.println("Números: " + Arrays.toString(sorteo));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reintegroSorteo);

        // Contador de aciertos
        int aciertos = 0;
        boolean aciertoComplementario = false;
        boolean aciertoReintegro = false;

        // Recorremos el boleto
        for (int i = 0; i < boletoInt.length; i++) {
            int num = boletoInt[i];

            // Booleano para comprobar si coincide con sorteo
            boolean encontrado = false;
            for (int j = 0; j < sorteo.length; j++) {
                if (num == sorteo[j]) {
                    encontrado = true;
                    break;
                }
            }
            // Si estaba aumentamos aciertos
            if (encontrado) {
                aciertos++;
            }

            if (num == complementario) {
                aciertoComplementario = true;
            }
        }

        if (reintegroUsuario == reintegroSorteo) {
            aciertoReintegro = true;
        }

        //Determinamos categoria
        String premio;

        if (aciertos == 6 && aciertoReintegro) {
            premio = "Categoría Especial";
        } else if (aciertos == 6) {
            premio = "1ª Categoría";
        } else if (aciertos == 5 && aciertoComplementario) {
            premio = "2ª Categoría";
        } else if (aciertos == 5) {
            premio = "3ª Categoría";
        } else if (aciertos == 4) {
            premio = "4ª Categoría";
        } else if (aciertos == 3) {
            premio = "5ª Categoría";
        } else if (aciertoReintegro) {
            premio = "Reintegro";
        } else {
            premio = "No premiado";
        }

        // Mostramos resultado
        System.out.println("\n*** RESULTADOS ***");
        System.out.println("Aciertos: " + aciertos);
        if (aciertoComplementario) {
            System.out.println("Complementario.");
        }
        if (aciertoReintegro) {
            System.out.println("Reintegro.");
        }
        System.out.println("Categoría: " + premio);
    }
}