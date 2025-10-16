package org.example;

import java.util.Scanner;

public class PracticaNumSuerte {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Inicializamos ya las variables que usaremos posteriormente para no hacerlo dentro del try catch
        String dia = "";
        String mes = "";
        String anyo = "";
        int dianum = 0;
        int mesnum = 0;
        int anyonum = 0;

        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        //Guardamos la fecha de nacimiento
        String fecha = teclado.nextLine();
        //Aquí controlaremos lo primero que tenga el símbolo pedido '/'en las posiciones correctas
        if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/') {
            System.out.println("ERROR. Formato erróneo. Debe separar los números por '/'.");
            //si es correcto pasamos a los try
            }else {
            //se podria hacer un try catch general pero así el mensaje lanzado sera especifico por
            //si el error ha sido en el dia, el mes o el año
                try {
                    //Si es correcto, le daremos a la variable previamente creada 'dia', el valor de
                    //los dos primeros digitos de la fecha introducida
                    dia = fecha.substring(0, 2);
                    dianum = Integer.parseInt(dia);
                } catch (Exception e) {
                    System.out.println("ERROR. No puede introducir letras en el día");
                    return;
                }
                try {
                    //Despues lo mismo con el mes
                    mes = fecha.substring(3, 5);
                    mesnum = Integer.parseInt(mes);
                } catch (Exception e) {
                    System.out.println("ERROR. No puede introducir letras en el mes");
                    return;
                }
                try {
                    //Y finalmente con el año
                    anyo = fecha.substring(6, 10);
                    anyonum = Integer.parseInt(anyo);
                } catch (Exception e) {
                    System.out.println("ERROR. No puede introducir letras en el año");
                    return;
                }

                //Ahora crearemos un if en el que el programa funcione si ttodo esta correcto
                if ((dianum < 32 && dianum > 0) && (mesnum < 13 && mesnum > 0) && (anyonum > 999 && anyonum < 2026)) {

                    //Para imprimir luego la suma de los numeros de la fecha creamos sumafecha
                    int sumafecha = dianum + mesnum + anyonum;

                    //Luego querremos sumar cada cifra del numero obtenido
                    //Asi que lo pasamos a String y separaremos cada una de las cifras
                    String sumafechaS = Integer.toString(sumafecha);
                    String cifra1S = sumafechaS.substring(0, 1);
                    String cifra2S = sumafechaS.substring(1, 2);
                    String cifra3S = sumafechaS.substring(2, 3);
                    String cifra4S = sumafechaS.substring(3, 4);

                    //Pasamos de nuevo todas las cifras que estban en String a int
                    int cifra1 = Integer.parseInt(cifra1S);
                    int cifra2 = Integer.parseInt(cifra2S);
                    int cifra3 = Integer.parseInt(cifra3S);
                    int cifra4 = Integer.parseInt(cifra4S);

                    //Y las sumamos para obtener el numero de la suerte
                    int sumaAnyo = cifra1 + cifra2 + cifra3 + cifra4;

                    System.out.println(fecha);

                    System.out.println(dianum + "+" + mesnum + "+" + anyonum + " = " + sumafecha);

                    System.out.println(cifra1 + "+" + cifra2 + "+" + cifra3 + "+" + cifra4 + " = " + sumaAnyo);

                    System.out.println("Tu número de la suerte es " + sumaAnyo);

                    //Esta condicion controla cada campo de la fecha para que los números introducidos esten entre los permitidos
                }else {
                    if (dianum > 31 || dianum < 1){
                        System.out.println("ERROR. El día de nacimiento debe ester entre 1 y 31");
                    } if (mesnum > 12 || mesnum < 1) {
                        System.out.println("ERROR. El mes de nacimiento debe ester entre 1 y 12");
                    } if (anyonum > 2025 || anyonum < 1000) {
                        System.out.println("ERROR. El año de nacimiento debe ester entre 1000 y 2025");
                    }
                }
            }
        }
    }
