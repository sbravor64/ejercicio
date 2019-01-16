package com.company.contest6;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        int ulfrase=frase.length();
        boolean pali= true;

        for (int i = 0; i <frase.length() ; i++) {
            char carac=frase.charAt(i);
            if(carac!=' ' && carac!='.' && carac!=',' && carac!=':' && carac!=';'){
                ulfrase--;
                char caracfin=frase.charAt(ulfrase);
                if(caracfin!=' ' && caracfin!='.' && caracfin!=',' && caracfin!=':' && caracfin!=';'){
                    if(carac!=caracfin){
                        pali=false;
                        break;
                    }
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

