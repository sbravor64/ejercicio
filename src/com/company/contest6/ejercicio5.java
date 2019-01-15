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

            for (int i = 0; i <frase.length() ; i++) {
                char carac = frase.charAt(i);
                for (int j = 0; j <exe.length() ; j++) {
                    char exec =exe.charAt(j);
                    if(exec!=carac){
                        char carac1=frase.charAt(i);
                        char carac2=frase.charAt(ulfrase--);

                        if(carac!=carac2){
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

