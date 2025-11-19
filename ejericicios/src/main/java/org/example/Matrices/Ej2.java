package org.example.Matrices;

import java.util.Arrays;
import java.util.Random;

public class Ej2 {

    static void main() {

        Random random = new Random();

        int filas = random.nextInt(6) + 2;

        int matrix[][] = new int [filas][filas];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = random.nextInt(9)+1;

            }
        }
        for (int fila[] : matrix){

            System.out.println(Arrays.toString(fila));

        }

        System.out.println();


        for (int i = 0; i < matrix.length; i++) {

            System.out.print(matrix[i][matrix.length-1-i] + " ");

        }

    }

}
