package com.company.contest3;

import java.util.Arrays;
import java.util.Scanner;

public class hack07 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt(), i,mayor, cont=0;
        boolean secuencia=true;
        int[] num = new int[cant];

        for (i = 0; i < cant; i++) {
            num[i]=tec.nextInt();
        }

        for (int j = 1; j <=cant ; j++) {
            cont=0;
            for (i = 0; i < cant; i++) {
                if(num[i]==j){
                    cont++;
                }

                if(cont>1 || num[i]>cant){
                    secuencia=false;
                    break;
                }
            }
        }


        if(secuencia==true){
            System.out.println("SI");
        } else{
            System.out.println("NO");
        }
    }
}