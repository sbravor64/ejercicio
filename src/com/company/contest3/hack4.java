package com.company.contest3;

import java.util.Scanner;

public class hack4 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt(), ultimo, i,j, cont=0;
        boolean igual=false;
        int[] num = new int[cant];

        for (i = 0; i < cant; i++) {
            num[i]=tec.nextInt();
        }

        int cant2=tec.nextInt();
        int[] num2 = new int[cant2];

        for (j = 0; j < cant2; j++) {
            num2[j]=tec.nextInt();
        }
        i = 0; j = 0;
        do {
            if (cant==cant2 && num[i] == num2[j]) {
                igual = true;
            } else {
                igual = false;
            }
            i++; j++;

        } while(i!=cant && j!=cant2);

        System.out.println(igual);
    }
}