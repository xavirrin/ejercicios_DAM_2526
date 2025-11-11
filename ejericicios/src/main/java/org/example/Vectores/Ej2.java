package org.example.Vectores;

import java.util.Arrays;

public class Ej2 {

    static void main() {

        int v[] = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < v.length/2; i++) {
            int aux = v[i];
            v[i] = v[v.length - 1 - i];
            v[v.length - 1 - i] = aux;
        }

        System.out.println(Arrays.toString(v));
    }
}
