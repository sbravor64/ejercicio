package com.company.contest6;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        String vocal="aeiou";
        String vocalm="AEIOU";
        int cont=0;

        for (int i = 0; i <vocal.length() ; i++) {
            cont=0;
            for (int j = 0; j <frase.length() ; j++) {
                if(vocal.charAt(i)==frase.charAt(j)){
                    frase = frase.replace("a","");
                    frase = frase.replace("A","");
                    frase = frase.replace("e","");
                    frase = frase.replace("E","");
                    frase = frase.replace("i","");
                    frase = frase.replace("I","");
                    frase = frase.replace("o","");
                    frase = frase.replace("O","");
                    frase = frase.replace("u","");
                    frase = frase.replace("U","");
                }
            }
        }
        System.out.println(frase);
    }
}

