package com.company.contest6;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        String vocal="aeiou";
        String mayus="AEIOU";
        int salida;

        for (int i = 0; i <frase.length() ; i++) {
            for (int j = 0; j <vocal.length() ; j++) {
                if(vocal.charAt(j)==frase.charAt(i)){
                    if(){
                        salida = mayus.charAt(1);
                    }
                }
            }
        }
        System.out.println(frase);
    }
}

