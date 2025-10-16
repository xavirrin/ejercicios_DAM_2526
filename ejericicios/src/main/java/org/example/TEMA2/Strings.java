package org.example.TEMA2;

public class Strings {

    static void main() {

        String frase = "Al palo Juanfran del Osasuna palo";

        int tamanyo = frase.length();
        System.out.println(tamanyo);

        System.out.println(frase.charAt(8));

        String trozo = frase.substring(8, 16);
        System.out.println(trozo);

        String trozoFinal = frase.substring(17);
        System.out.println(trozoFinal);

        int posicion = frase.indexOf("palo");
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo", 10);
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);

        String frase_may = frase.toUpperCase();
        System.out.println(frase_may);

        String frase_min = frase.toLowerCase();
        System.out.println(frase_min);

        String frase_trimear = "Raul            ";
        System.out.println(frase_trimear);
        System.out.println(frase_trimear.trim());

        boolean igual = frase_trimear.trim().equals("Raul");
        System.out.println(igual);

        boolean igual_sin_may = frase_trimear.trim().equalsIgnoreCase("raul");
        System.out.println(igual_sin_may);

        String frase_replace = frase.replace("palo", "Florentino");
        System.out.println(frase_replace);

    }
}
