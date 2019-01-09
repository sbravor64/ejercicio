package com.company.contest6;

import java.util.Scanner;

public class ejercicioo2 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase = tec.nextLine();
        String vocal = "aeiou";

        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < vocal.length(); j++) {
                if (frase.charAt(i) != vocal.charAt(j)) {
                    System.out.print(frase.charAt(j));
                }
            }

        }
    }

}
