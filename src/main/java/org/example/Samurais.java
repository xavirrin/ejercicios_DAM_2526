package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Samurais {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** BIENVENIDO A LA BATALLA DE LOS SAMURÁIS ***");
        System.out.println();

        //Creamos los dos vectores en los que copiaremos mas adelante los samurais del vector auxilar del for
        int[] equipo1 = new int[7];
        int[] equipo2 = new int[7];

        //Esto controlara que foramos primero el equipo 1 y una vez completado correctamente hagamos lo mismo con el 2
        //Sin repetir codigo
        int equipoActual = 1;

        while (equipoActual <= 2) {

            System.out.println("Equipo " + equipoActual);

            //Con este booleano daremos paso a otro equipo
            boolean equipoFormado = false;

            while (!equipoFormado) {

                System.out.print("Introduce potencia de los samurais: ");

                String aux = teclado.nextLine();
                String eqAux[] = aux.split(" ");

                //Controlamos que se introduzcan 7 samurais
                if (eqAux.length != 7) {
                    System.out.println("ERROR. Debe introducir 7 samuráis.");
                } else {
                    //Creamos un vector para pasar el introducido por teclado en String a int
                    int eqInt[] = new int[7];
                    int potencia = 0;
                    //Y creamos otro booleano para controlar el formato
                    boolean formato = true;

                    for (int i = 0; i < eqInt.length; i++) {

                        int num = Integer.parseInt(eqAux[i]);
                        //Controlamos que cada samurai este entre 1 y 24 de potencia
                        if (num < 1 || num > 24) {
                            System.out.println("ERROR. Cada samurái debe tener potencia entre 0 y 24.");
                            formato = false;
                        } else {
                            eqInt[i] = num;
                            potencia += num;
                        }
                    }

                    if (formato) {
                        //Ahora controlaremos la suma total
                        if (potencia != 30) {
                            System.out.println("ERROR. La potencia total no suma 30.");
                        } else {
                            //Y dependiendo de en que equipo estemos se clonara en el equipo 1 o 2 antes creado
                            if (equipoActual == 1) {
                                equipo1 = eqInt.clone();
                            } else {
                                equipo2 = eqInt.clone();
                            }
                            System.out.println("Equipo " + equipoActual + " completado: " + Arrays.toString(eqInt));
                            System.out.println();

                            //Si esta todo correcto pasamos al siguiente equipo o salimos
                            equipoFormado = true;
                            equipoActual++;
                        }
                    }
                }
            }
            }

            //Comenzamos con la batalla
            System.out.println("¡Empeiza la batalla");

        //Inicializamos contadores para ver cuando acaba el bucle de la batalla
            int contador1 = 0;
            int contador2 = 0;

            //Creamos el random del 1 al 7
            int posicion = random.nextInt(7) + 1;

            System.out.println("La batalla inicia con el samurai " + posicion);

            //Hacemos un for para la batalla
            for (int i = posicion - 1; contador1 < 4 && contador2 < 4; i++) {

                //Aqui controlamos que si llega a la ultima posicion se le de la vuelta al vector
                if (i == 7) {
                    i = 0;
                }

                System.out.println("Samurai " + (i + 1));

                int samu1 = equipo1[i];
                int samu2 = equipo2[i];

                if (samu1 > samu2) {
                    equipo2[i] = 0;
                    contador2++;
                    System.out.println("Gana Equipo 1. " + samu1 + " vs " + samu2);
                } else if (samu2 > samu1) {
                    equipo1[i] = 0;
                    contador1++;
                    System.out.println("Gana Equipo 2. " + samu1 + " vs " + samu2);
                } else {
                    equipo1[i] = 0;
                    equipo2[i] = 0;
                    contador1++;
                    contador2++;
                    System.out.println("Empate. " + samu1 + " vs " + samu2);
                }
            }

            //Finalmente mostamos al ganador o empeate en caso de empate
            if (contador1 >= 4 && contador2 >= 4) {
                System.out.println("¡EMPATE! Ambos equipos han perdido 4 samuráis.");
            } else if (contador1 >= 4) {
                System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + contador1 + " bajas.");
            } else if (contador2 >= 4) {
                System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + contador2 + " bajas.");
            }
    }
}
