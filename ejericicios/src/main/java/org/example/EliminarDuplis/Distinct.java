package org.example.EliminarDuplis;

import java.util.Arrays;

public class Distinct {

    static void main() {

        int numericos[] = {3,2,8,3,4,5,1,6,6};

        int numericos_limpio[] = Arrays.stream(numericos).distinct().toArray();

        System.out.println(Arrays.toString(numericos));
        System.out.println(Arrays.toString(numericos_limpio));
    }
}
