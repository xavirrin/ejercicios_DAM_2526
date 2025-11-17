package org.example.EliminarDuplis;

import java.util.Arrays;

public class Modo1 {

    static void main() {

        int v[] = {1,5,2,45,7,2,2,2,4,5,61,1};
        Arrays.sort(v);
        System.out.println(Arrays.toString(v));

        int vAux[] = new int[v.length];
        int contador = 0;

        for (int i = 0; i < v.length - 1; i++) {

            if (v[i] != v[i + 1]){
                vAux[i] = v[i];
                contador++;
            }
        }

        System.out.println(contador);

        int vOK[] = new int[contador];

        for (int i = 0; i < vAux.length; i++) {
            if (vAux[i] != 0){
                vOK[i] = vAux[i];
            }
        }

        System.out.println(Arrays.toString(vOK));

    }
}
