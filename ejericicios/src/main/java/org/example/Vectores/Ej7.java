package org.example.Vectores;

import java.util.Arrays;

public class Ej7 {

    static void main() {

        int v1[] = {1,2,3,4};
        int v2[] = {9,10,2,4,5};
        int v3[] = new int[v1.length + v2.length];

        for (int i = 0; i < v1.length; i++) {
            v3[i] = v1[i];
        }

        for (int i = 0; i < v2.length; i++) {
            v3[i + v1.length] = v2[i];
        }

        System.out.println(Arrays.toString(v3));
    }
}
