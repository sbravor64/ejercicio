package com.company.contest3;

import java.util.Scanner;

public class hack1 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt(), cont=0, i;

        int[] num = new int[cant];

        for (i = 0; i < cant; i++) {
            num[i]=tec.nextInt();
            cont=num[i];

            if(i+1==cant) {
                int j=i;
                do {
                    System.out.print(num[j] + " ");
                    j--;
                } while(j!=-1);
            }
        }
    }
}