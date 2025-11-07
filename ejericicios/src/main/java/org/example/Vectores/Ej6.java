package org.example.Vectores;

public class Ej6 {

    static void main() {


        int v[] = {1,2,3,3,3,1};
        boolean palindromo = true;

        for (int i = 0; i < v.length/2; i++) {
            if (v[i] != v[v.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        if (palindromo){
            System.out.println("Es palíndromo.");
        } else {
            System.out.println("No es palíndromo.");
        }
    }
}
