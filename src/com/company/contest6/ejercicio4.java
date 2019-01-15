package com.company.contest6;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        int cont=0;

        while(!frase.equals("END")){
            for (int i = 0; i <frase.length() ; i++) {
                char carac=frase.charAt(i);
                if(carac==' '){
                    cont++;
                }
            }
            cont++;
            frase=tec.nextLine();
        }

        System.out.println(cont);
    }
}

