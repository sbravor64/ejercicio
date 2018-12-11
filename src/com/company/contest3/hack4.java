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

        for (j = 0; j < cant; j++) {
            num2[j]=tec.nextInt();
        }

        while(num[i]==num2[j]){
            igual=true;

        }

    }
}