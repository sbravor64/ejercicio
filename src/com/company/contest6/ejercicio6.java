package com.company.contest6;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        String letra=tec.nextLine();
        boolean pali= true;

        for (int i = 0; i <frase.length() ; i++) {
            char carac=letra.charAt(0);
            char carac1=frase.charAt(i);

                if(carac1==carac){
                    pali=false;
                }
        }

        if(pali==true){
            System.out.println("true");
        } else if (pali==false){
            System.out.println("false");
        }
    }
}

