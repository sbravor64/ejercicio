package com.company.contest6;

import java.util.Scanner;

public class ejercicio05 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();
        int ulfrase=frase.length();
        boolean pali= false;

        for (int i = 0; i <frase.length() ; i++) {
            char carac=frase.charAt(i);
            if(carac!=' ' && carac!='.' && carac!=',' && carac!=':' && carac!=';'){
                if(ulfrase<i){break;}
                    while(ulfrase>i){
                        ulfrase--;
                        int j=ulfrase;
                        char carac2=frase.charAt(j);
                        if(carac2!=' ' && carac2!='.' && carac2!=',' && carac2!=':' && carac2!=';'){
                            if(carac==carac2){
                                pali=true;
                                break;
                            } else {
                                pali=false;
                                break;
                            }
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

