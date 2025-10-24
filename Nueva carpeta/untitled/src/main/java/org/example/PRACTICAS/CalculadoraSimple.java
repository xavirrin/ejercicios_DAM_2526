package org.example.PRACTICAS;

import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {

        //Inicializamos ya el operador y reulstado
        Scanner teclado = new Scanner(System.in);
        char operador = ' ';
        double resultado = 0;

        System.out.println("**** BIENVENIDO A LA CALCULADORA RÁPIDA ****");

        System.out.println("> Introduce operando: ");

        //Si no se introduce un double, salimos
        if (!teclado.hasNextDouble()) {
            System.out.println("ERROR. Debe introducir un número.");
        }else {
            double operando1 = teclado.nextDouble();

            System.out.println("-------------------------------");

            System.out.println("""
                    [+] -> sumar
                    [-] -> restar
                    [x] -> multiplicar
                    [/] -> dividr
                    [R] -> raíz cuadrada""");
            System.out.println("-------------------------------");
            System.out.println("Elige una opreación (Si escribe más de na solo se tomará en cuenta la primera): ");

            //Le damos valor al operador antes inicializado
            operador = teclado.next().charAt(0);

            //Si el operador no está entre los requeridos salimos, excepto si es raiz cuadrada, que lo controlaremos luego
            if (operador == '+' || operador == '-' || operador == 'x' || operador == 'X' || operador == '/') {

                System.out.println("Introduce el segundo operando:");

                //Controlamos entrada del segundo operando
                if (!teclado.hasNextDouble()) {
                    System.out.println("ERROR. Debe introducir un número.");
                } else {
                    double operando2 = teclado.nextDouble();

                    //Vamos con el switch en el que daremos a resultado un valor dependediendo del operador y mostraremos un mensaje u otro
                    switch (operador) {
                        case '+':
                            resultado = operando1 + operando2;
                            System.out.println("El resultado de " + operando1 + " " + operador + " " + operando2 + " es " + resultado);
                            break;

                        case '-':
                            resultado = operando1 - operando2;
                            System.out.println("El resultado de " + operando1 + " " + operador + " " + operando2 + " es " + resultado);
                            break;

                        case 'x', 'X':
                            resultado = operando1 * operando2;
                            System.out.println("El resultado de " + operando1 + " " + operador + " " + operando2 + " es " + resultado);
                            break;

                            //En el caso de de la division crearemos una condidicion para controlar que no se muestre nan, ni infinity
                        case '/':
                            if (operando2 != 0) {
                                resultado = operando1 / operando2;
                                System.out.println("El resultado de " + operando1 + " " + operador + " " + operando2 + " es " + resultado);
                            }else {
                                System.out.println("ERROR. No se puede dividir entre 0.");
                            }
                            break;

                    }
                }
                //En el caso de la raiz cuadrada, si es un número negativo mostraremos error.
            }else if (operador == 'r' || operador == 'R'){
                if (operando1 > 0) {
                    resultado = Math.sqrt(operando1);
                    System.out.println("El resultado de la raíz cuadrada de " + operando1 + " es " + resultado);
                }else {
                    System.out.println("ERROR. No se puede hacer la raíz cuadrada de un número negativo.");
                }
            }else {
                System.out.println("ERROR. Operador no encontrado.");
            }
        }
    }
}


