package org.example.Vectores;

import java.util.Arrays;
import java.util.Random;

public class Ej1 {

    static void main() {

        Random random = new Random();

        int v[] = new int[8];
        int suma = 0;

        for (int i = 0; i < v.length; i++) {
            v[i] = random.nextInt(501);
            suma+= v[i];
        }

        System.out.println("La suma de los elementos es: " + suma);
        System.out.println(Arrays.toString(v));



    }
}
