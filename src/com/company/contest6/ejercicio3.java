package com.company.contest6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        String frase=tec.nextLine();

        while(!frase.equals("END")){
            for (int i = 0; i <frase.length() ; i++) {
                char entrada=frase.charAt(i);
                if(entrada=='a'){
                    System.out.print("A");
                } else if (entrada=='e'){
                    System.out.print("E");
                } else if (entrada=='i'){
                    System.out.print("I");
                } else if (entrada=='o'){
                    System.out.print("O");
                } else if (entrada=='u'){
                    System.out.print("U");
                }
                if(entrada!='a' && entrada!='e' && entrada!='i' && entrada!='o' && entrada!='u'){
                    System.out.print(frase.charAt(i));
                }
            }
            System.out.println(" ");
            frase=tec.nextLine();
        }
    }
}

