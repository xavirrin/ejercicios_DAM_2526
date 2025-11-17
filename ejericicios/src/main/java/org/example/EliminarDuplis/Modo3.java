package org.example.EliminarDuplis;

import java.util.Arrays;
import java.util.Random;

public class Modo3 {

    static void main() {

        Random random = new Random();

        int num[] = new int[10];

        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(10)+1;
        }

        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        boolean numOK = true;

        while (numOK) {

            numOK = false;
            Arrays.sort(num);
            System.out.println(Arrays.toString(num));

            for (int i = 0; i < num.length; i++) {

                if (i != num.length - 1 && num[i] == num[i + 1]) {
                    System.out.println("Duplicado: " + num[i]);
                    System.out.println(Arrays.toString(num));
                    num[i] = random.nextInt(10) + 1;
                    numOK = true;
                }
            }
        }

        System.out.println();
        System.out.print("Array final:");
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
    }
}
