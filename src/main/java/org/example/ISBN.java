package org.example;

import java.util.Scanner;

public class ISBN {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        //Creamos un contador que será el número por el que irá multiplicando cada cifra del ISBN
        int contador = 10;
        //Y la variable en la que irmeos almacenando la suma de cada operacion
        int suma = 0;

        //Esto es para la funcionalidad de reparar el ISBN
        boolean faltaNum = false;
        //Crearemos una variable para identificar la posicion del interrogante
        int posFaltante = 0;
        //Y otra para guardar el número correcto
        int numReparador = 0;
        //Y esta la he añadido para controlar que no haya más de un interrogante
        int contadorFaltantes = 0;

        System.out.println("****BIENVENIDO A LA CALCULADORA DE ISBN****");
        System.out.println("Introduzca ISBN:");
        //Pasamos el isbn a mayusculas para que la x siempre sea X
        String isbn = teclado.next().toUpperCase();

        //Primero controlamos que tenga 10 cifras, si no error.
        if (isbn.length() != 10) {
            System.out.println("ERROR. El número debe tener 10 cifras.");
        } else {

            //Creamos un for para recorrer el isbn desde el primer numero hasta el ultimo
            for (int i = 0; i < 10; i++) {
                //Si tenemos X y está en la ultima posicion pasa a valer 10
                if (isbn.charAt(i) == 'X' && i == 9) {
                    suma += 10 * contador;
                    //Si encontramos un interrogante
                } else if (isbn.charAt(i) == '?') {
                    //Primero contamos que ya tenemos una
                    contadorFaltantes++;
                    //El buleano antes creado lo ponemos true para entrar en el if de la reparacion que luego veremos
                    faltaNum = true;
                    //Y guardamos su posicion para luego calcular el numero reparador
                    posFaltante = contador;
                    //Aqui nos cercioraremos de que cada digito sea un numero entre 1 y 9
                } else if (Character.getNumericValue(isbn.charAt(i)) > -1 && Character.getNumericValue(isbn.charAt(i)) < 10) {
                    //Y sumamos
                    suma += Character.getNumericValue(isbn.charAt(i)) * contador;
                } else {
                    //Si no error, y te digo en que posicion ha sido
                    System.out.println("ERROR. Carácter inválido en posición " + (i + 1));
                    return;
                }

                //Restamos un numero al contador y volvemos con otra iteracion del for
                contador--;
            }

            //Antes de reparar nada, si hay mas de un interrogante en el contador salimos.
            if (contadorFaltantes > 1){
                System.out.println("ERROR. No puede haber más de una incógnita.");
                return;
            }

            //Aqui comienza la reparacion del isbn
            if (faltaNum) {

                //Crearemos un for para ir probando cada numero
                for (int i = 0; i <= 10; i++) {
                    //crearemos la variable 'total' cada iteracion añadiendo a la suma que ya teniamos la multiplicacion
                    //de la posicion almacenada por i
                    int total = suma + posFaltante * i;
                    //Y si este total es multiplo de 11 saldremos
                    if (total % 11 == 0) {
                        //Le daremos a la variable antes creada numReparador el valor actual de i
                        numReparador = i;
                        break;
                    }
                }

                //Aqui nos ocuparemos de que el 10 solo pueda ir en la ultima posicion. Si es asi el reparador sera X
                if (numReparador == 10 && isbn.charAt(9) == '?') {
                    System.out.println("El dígito que falta es 'X'.");
                } else {
                    //En cualquier otro caso el reparador sera numReparador
                    System.out.println("El dígito que falta es " + numReparador);
                }

                //En caso de que no hubiera incognita, simplemente mostramos si es valido o no
            } else {

                if (suma % 11 == 0) {
                    System.out.println("El ISBN es válido.");
                } else {
                    System.out.println("El ISBN no es válido.");
                }
            }
        }
    }
}
