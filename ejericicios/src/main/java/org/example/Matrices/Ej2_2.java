package org.example.Matrices;

import java.util.Arrays;
import java.util.Random;

public class Ej2_2 {

    static void main() {

        Random random = new Random();

        int matA[][] = {{4,5,6},{7,2,7},{1,2,3}};
        int matB[][] = {{3,7,8},{17,0,1},{2,32,3}};
        int matM[][] = new int[matA.length][matA.length];

        for (int i = 0; i < matM.length; i++) {
            for (int j = 0; j < matM[i].length; j++) {
                if (matA[i][j] < matB[i][j]){
                    matM[i][j] = matB[i][j];
                } else if (matA[i][j] > matB[i][j]) {
                    matM[i][j] = matA[i][j];
                } else {
                    matM[i][j] = matA[i][j];
                }
            }
        }

        for (int fila[] : matM){

            System.out.println(Arrays.toString(fila));

        }

    }
}
