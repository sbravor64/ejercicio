package com.company.contest3;

import java.util.Scanner;

public class hack5 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt(), i,j, total=0;
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
            total=num[i] + num2[j];
            System.out.print(total + " ");
            i++; j++;

        } while(i!=cant && j!=cant2);
    }
}