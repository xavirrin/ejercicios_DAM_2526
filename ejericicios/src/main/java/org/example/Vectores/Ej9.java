package org.example.Vectores;

public class Ej9 {

    static void main() {

        String v[] = {"Holaaaaaaa ", "qué ", "tal ", " cómo ", " estamos"};
        int palabraLarga = 0;

        for (int i = 0; i < v.length - 1; i++) {
            if (v[i + 1].length() > v[i].length()){
                palabraLarga = i + 1;
            }
        }

        System.out.println("La palabra más larga es:" + v[palabraLarga]);
    }
}
