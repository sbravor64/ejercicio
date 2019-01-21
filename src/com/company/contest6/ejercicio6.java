package com.company.contest6;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        String letra=tec.nextLine();
        boolean pali= false;

        for (int i = 0; i <frase.length() ; i++) {
            int carac=letra.length();
            char carac1=frase.charAt(i);
            if(carac!=1){
                String frase2=letra;
                letra=tec.nextLine();
            } else {

                if(carac1==carac){
                    pali=true;
                }
            }
        }

        if(pali==true){
            System.out.println("true");
        } else if (pali==false){
            System.out.println("false");
        }
    }
}

