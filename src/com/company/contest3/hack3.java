package com.company.contest3;

import java.util.Scanner;

public class hack3 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt(), ultimo, i, cont=0;

        int[] num = new int[cant];

        for (i = 0; i < cant; i++) {
            num[i]=tec.nextInt();

            if(i+1==cant){
                ultimo=num[i];
                for (int j = 0; j < cant-1; j++) {
                    if(num[j]==ultimo){
                        cont++;
                    }
                }
                System.out.println(cont);
            }

        }
    }
}