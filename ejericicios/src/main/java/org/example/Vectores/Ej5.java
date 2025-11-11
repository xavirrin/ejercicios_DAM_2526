package org.example.Vectores;

import java.util.Arrays;

public class Ej5 {

    static void main() {

        int v[] = {1,2,3,4,5,6,7,8,9};
        int aux = 0;
        int aux2 = 0;

        for (int i = 0; i < v.length - 1; i++) {
            aux = v[i + 1];
            v[i + 1] = v[i];
            aux2 = v[i + 2];
            v[v.length - 1 - i] = aux;
        }

        System.out.println(Arrays.toString(v));
    }
}
