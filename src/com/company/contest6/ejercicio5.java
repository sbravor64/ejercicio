package com.company.contest6;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        String exe=" ,.:";
        int ulfrase=frase.length();
        ulfrase--;
        boolean pali= true;

            for (int i = 0; i <exe.length() ; i++) {
                for (int j = 0; j <frase.length() ; j++) {
                    char carac = frase.charAt(j);
                    char exec = exe.charAt(j);
                    if(exec!=carac){
                        char carac1=frase.charAt(j);
                        char carac2=frase.charAt(ulfrase--);

                        if(carac1!=carac2){
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

