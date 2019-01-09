package com.company.contest6;

import java.util.Scanner;

public class ejercicio1 {

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
                    cont++;
                }
                if(vocalm.charAt(i)==frase.charAt(j)){
                    cont++;
                }
            }
            System.out.println(cont);
        }
    }
}

