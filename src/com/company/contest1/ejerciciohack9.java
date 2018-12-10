package com.company.contest1;

import java.util.Scanner;

public class ejerciciohack9 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt();
        int num = tec.nextInt(),cont=0, contador=0;
        boolean primo=true;

        do {
            while (num != 0) {
                if (num <= 2) {
                    primo = true;
                } else {
                    for (int x = 2; x < num; x++) {
                        if (num % x == 0) {
                            primo = false;
                        }
                    }
                }
                if (primo == true) {
                    contador++;
                }
                num = tec.nextInt();
                primo = true;
            }
            if(cant!=cont){
                System.out.println(contador);
                contador=0;
                num=tec.nextInt();
            }

        } while(cant!=cont);
    }
}