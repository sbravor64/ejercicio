package com.company.contest3;

import java.util.Scanner;

public class hack6 {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        int cant=tec.nextInt(), ultimo, i,j, cont=0;
        boolean igual=false;
        int[] num = new int[cant];

        for (i = 0; i < cant; i++) {
            num[i]=tec.nextInt();
        }
        j=0; i=cant-1;
        while(num[i]==num[j]){
            igual=true;
            i--; j++;
            if(i==j || i<j){
                break;
            }
            if(num[i]!=num[j]){
                igual=false;
                break;
            }
        }

        if(igual==true){
            System.out.println("SI");
        } else{
            System.out.println("NO");
        }
    }
}